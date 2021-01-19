/*
 * Copyright 2019 Kunal Sheth
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package info.kunalsheth.units

import info.kunalsheth.units.data.Dimension
import info.kunalsheth.units.data.Quantity
import info.kunalsheth.units.data.Relation
import info.kunalsheth.units.data.UnitOfMeasure
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

open class GenerateUnitsOfMeasureTask @Inject constructor(p: Project) : DefaultTask() {

    @Input
    override fun getGroup() = "units-of-measure"

    @Input
    override fun getDescription() = "(Re)generate DSL for type-safe dimensional analysis and unit conversion."

    @TaskAction
    fun generate() {
        generatedSrcDir.delete()
        generatedSrcDir.mkdirs()
        val srcWriter = generatedSrc.outputStream()
        writeBase(srcWriter)

        val allRelations = Relation.closedPermute(mathDependencies +
                quantities.map(Quantity::dimension) +
                unitsOfMeasure.map(UnitOfMeasure::dimension)
        ) + relationships

        val allDimensions = (mathDependencies +
                allRelations.flatMap { listOf(it.a, it.b, it.result) } +
                quantities.map(Quantity::dimension) +
                unitsOfMeasure.map(UnitOfMeasure::dimension))
                .toSet()

        val relationGroups = allRelations
                .groupBy { it.a }
                .mapValues { (_, v) -> v.toSet() }

        val quantityGroups = quantities
                .groupBy { it.dimension }
                .mapValues { (_, v) -> v.toSet() }

        val unitGroups = unitsOfMeasure
                .groupBy { it.dimension }
                .mapValues { (_, v) -> v.toSet() }

        val generatedSourceCode = allDimensions.map {
            it.src(
                    relationGroups[it] ?: emptySet(),
                    quantityGroups[it] ?: emptySet(),
                    unitGroups[it] ?: emptySet()
            )
        }

        srcWriter.bufferedWriter().use { writer ->
            generatedSourceCode.forEach { writer.appendLine(it) }
        }

        mathSrc.outputStream().use(::writeMath)
    }

    @Input
    var relationships: Set<Relation> = emptySet()

    @Input
    var quantities: Set<Quantity> = InternationalSystemOfUnits.quantities

    @Input
    var unitsOfMeasure: Set<UnitOfMeasure> = InternationalSystemOfUnits.units

    @OutputDirectory
    val generatedSrcDir = File(p.buildDir, "uom")

    @OutputFile
    val generatedSrc = File(generatedSrcDir, "UnitsOfMeasure.kt")

    @OutputFile
    val mathSrc = File(generatedSrcDir, "UomMath.kt")

    // for Groovy to Kotlin interop

    fun dimension(params: MutableMap<String, Any>?) =
            if (params != null) Dimension(
                    L = (params.remove("L") ?: 0) as Int,
                    A = (params.remove("A") ?: 0) as Int,
                    M = (params.remove("M") ?: 0) as Int,
                    T = (params.remove("T") ?: 0) as Int,
                    I = (params.remove("I") ?: 0) as Int,
                    Theta = (params.remove("Theta") ?: 0) as Int,
                    N = (params.remove("N") ?: 0) as Int,
                    J = (params.remove("J") ?: 0) as Int
            ).also {
                require(params.isEmpty()) { "Unrecognized base dimensions: ${params.keys.joinToString()}" }
            } else Dimension()

    fun d(params: MutableMap<String, Any>?) = dimension(params)

    fun relation(vararg dimensions: Dimension) = Relation.openPermute(dimensions.toSet())
    fun r(vararg dimensions: Dimension) = relation(*dimensions)

    fun quantity(name: String, dimension: Dimension) = Quantity(name, dimension)
    fun q(name: String, dimension: Dimension) = quantity(name, dimension)

    fun unitOfMeasure(name: String, factorToSI: Double, dimension: Dimension) = UnitOfMeasure(name, factorToSI, dimension)
    fun u(name: String, factorToSI: Double, dimension: Dimension) = unitOfMeasure(name, factorToSI, dimension)
}