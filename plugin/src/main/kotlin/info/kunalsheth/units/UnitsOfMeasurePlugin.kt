package info.kunalsheth.units

import org.gradle.api.Plugin
import org.gradle.api.Project

class UnitsOfMeasurePlugin : Plugin<Project> {
    override fun apply(p: Project) {
        p.tasks.create(
                "generateUnitsOfMeasure",
                GenerateUnitsOfMeasureTask::class.java, p
        )
    }
}