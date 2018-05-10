package info.kunalsheth.units.extractor

import java.io.PrintStream

import org.clapper.classutil.ClassFinder
import squants._

import scala.reflect.io.File
import scala.reflect.runtime._
import scala.util.Try

object SquantsExtractor extends App {

  System.setOut(new PrintStream(File("common_units.tsv").outputStream()))

  ClassFinder()
    .getClasses()
    .filter(_.isConcrete)
    .filter(_.implements("squants.Dimension"))
    .map(_.name)
    .map(currentMirror.staticModule)
    .map(currentMirror.reflectModule)
    .map(_.instance)
    .map(_.asInstanceOf[Dimension[A] forSome {type A <: Quantity[A]}])
    .sortBy(_.name)
    .foreach(i => printDimension(i))

  def printDimension[A <: Quantity[A]](d: Dimension[A]) = Try {
    val dimensionName = d.name
    val si = d.siUnit
    d.units.toList
      .sortBy(_.symbol)
      .foreach { u =>
        val factorToSI = u(1) to si
        val unitName = u.getClass.getSimpleName replaceAll("\\$", "")

        println(s"$dimensionName\t${si(1)}\t$factorToSI\t$unitName")
      }
  }
}
