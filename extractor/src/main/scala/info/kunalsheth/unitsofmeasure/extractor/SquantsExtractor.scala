package info.kunalsheth.unitsofmeasure.extractor

import java.io.PrintStream

import org.clapper.classutil.ClassFinder

import scala.reflect.runtime._
import squants._
import squants.electro.Capacitance
import squants.motion.Acceleration
import squants.space.Length

import scala.reflect.io.File
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
    .foreach(i => printDimension(i))

  def printDimension[A <: Quantity[A]](d: Dimension[A]) = Try {
    val si = d.siUnit(1)
    val dimensionName = d.name
    d.units.foreach { u =>
      val factorToSI = si to u
      val unitName = u.getClass.getSimpleName replaceAll("\\$", "")

      println(s"$dimensionName\t$si\t$factorToSI\t$unitName")
    }
  }
}
