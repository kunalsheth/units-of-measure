package info.kunalsheth.unitsofmeasure.extractor

import java.io.PrintStream

import squants._
import squants.electro._
import squants.energy._
import squants.information._
import squants.mass._
import squants.motion._
import squants.photo._
import squants.radio._
import squants.space._
import squants.thermal._
import squants.time._

import scala.reflect.io.File

object SquantsExtractor extends App {

  System.setOut(new PrintStream(File("common_units.tsv").outputStream()))

  // copied from squants.experimental.unitgroups.ImplicitDimensions
  print(Capacitance)
  print(Conductivity)
  print(ElectricalConductance)
  print(ElectricalResistance)
  print(ElectricCharge)
  print(ElectricPotential)
  print(Inductance)
  print(MagneticFlux)
  print(MagneticFluxDensity)
  print(Resistivity)
  print(Energy)
  print(EnergyDensity)
  print(Power)
  print(PowerRamp)
  print(SpecificEnergy)
  print(DataRate)
  print(Information)
  print(AreaDensity)
  print(ChemicalAmount)
  print(Density)
  print(Mass)
  print(MomentOfInertia)
  print(Acceleration)
  print(AngularAcceleration)
  print(AngularVelocity)
  print(Force)
  print(Jerk)
  print(MassFlow)
  print(Momentum)
  print(Pressure)
  print(PressureChange)
  print(Torque)
  print(Velocity)
  print(VolumeFlow)
  print(Yank)
  print(Illuminance)
  print(Luminance)
  print(LuminousEnergy)
  print(LuminousExposure)
  print(LuminousFlux)
  print(LuminousIntensity)
  print(Irradiance)
  print(Radiance)
  print(RadiantIntensity)
  print(SpectralIntensity)
  print(SpectralIrradiance)
  print(SpectralPower)
  print(Angle)
  print(Area)
  print(Length)
  print(SolidAngle)
  print(Volume)
  print(Temperature)
  print(ThermalCapacity)
  print(Frequency)
  print(Time)

  def print[A <: Quantity[A]](d: Dimension[A]) {
    println(d.name)
    val si = d.siUnit(1)
    d.units.foreach(u => println(s"$si\t${si to u}\t${u.getClass.getSimpleName}"))
    println()
  }
}
