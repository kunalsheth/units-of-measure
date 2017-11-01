package info.kunalsheth.unitsofmeasure.source

import java.io.File
import java.io.PrintWriter

/**
 * Created by kunal on 8/5/17.
 */
fun writeKt(parent: File, simpleName: String): PrintWriter {
    val out = File(parent, "$simpleName.kt").printWriter()
    out.println("package info.kunalsheth.unitsofmeasure.generated")
    return out
}

fun PrintWriter.done() {
    flush()
    close()
}