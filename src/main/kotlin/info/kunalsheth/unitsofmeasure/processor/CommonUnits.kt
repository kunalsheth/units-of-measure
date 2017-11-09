package info.kunalsheth.unitsofmeasure.processor

import info.kunalsheth.unitsofmeasure.processor.data.MetaDimension
import info.kunalsheth.unitsofmeasure.processor.data.MetaQuantity
import info.kunalsheth.unitsofmeasure.processor.data.MetaUnitOfMeasure

val Length = MetaDimension(L = 1)
val Mass = MetaDimension(M = 1)
val Time = MetaDimension(T = 1)
val ElectricCurrent = MetaDimension(I = 1)
val Temperature = MetaDimension(Theta = 1)
val AmountOfSubstance = MetaDimension(N = 1)
val LuminousIntensity = MetaDimension(J = 1)
val Absement = MetaDimension(L = 1, T = 1)
val AbsorbedDoseRate = MetaDimension(L = 2, T = -3)
val Acceleration = MetaDimension(L = 1, T = -2)
val AngularAcceleration = MetaDimension(T = -2)
val AngularMomentum = MetaDimension(M = 1, L = 2, T = -1)
val AngularVelocity = MetaDimension(T = -1)
val Area = MetaDimension(L = 2)
val AreaDensity = MetaDimension(M = 1, L = -2)
val Capacitance = MetaDimension(M = -1, L = -2, T = 4, I = 2)
val CatalyticActivity = MetaDimension(T = -1, N = 1)
val CatalyticActivityConcentration = MetaDimension(L = -3, T = -1, N = 1)
val ChemicalPotential = MetaDimension(M = 1, L = 2, T = -2, N = -1)
val Crackle = MetaDimension(L = 1, T = -5)
val CurrentDensity = MetaDimension(L = -2, I = 1)
val DoseEquivalent = MetaDimension(L = 2, T = -2)
val DynamicViscosity = MetaDimension(M = 1, L = -1, T = -1)
val ElectricCharge = MetaDimension(T = 1, I = 1)
val ElectricChargeDensity = MetaDimension(L = -3, T = 1, I = 1)
val ElectricDisplacement = MetaDimension(L = -2, T = 1, I = 1)
val ElectricFieldStrength = MetaDimension(M = 1, L = 1, T = -3, I = -1)
val ElectricalConductance = MetaDimension(M = -1, L = -2, T = 3, I = 2)
val ElectricalConductivity = MetaDimension(M = -1, L = -3, T = 3, I = 2)
val ElectricPotential = MetaDimension(M = 1, L = 2, T = -3, I = -1)
val ElectricalResistance = MetaDimension(M = 1, L = 2, T = -3, I = -2)
val ElectricalResistivity = MetaDimension(M = 1, L = 3, T = -3, I = -2)
val Energy = MetaDimension(M = 1, L = 2, T = -2)
val EnergyDensity = MetaDimension(M = 1, L = -1, T = -2)
val Entropy = MetaDimension(M = 1, L = 2, T = -2, Theta = -1)
val Force = MetaDimension(M = 1, L = 1, T = -2)
val Frequency = MetaDimension(T = -1)
val FuelEfficiency = MetaDimension(L = -2)
val HalfLife = MetaDimension(T = 1)
val Heat = MetaDimension(M = 1, L = 2, T = -2)
val HeatCapacity = MetaDimension(M = 1, L = 2, T = -2, Theta = -1)
val HeatFluxDensity = MetaDimension(M = 1, T = -3)
val Illuminance = MetaDimension(L = -2, J = 1)
val Impedance = MetaDimension(M = 1, L = 2, T = -3, I = -2)
val Impulse = MetaDimension(M = 1, L = 1, T = -1)
val Inductance = MetaDimension(M = 1, L = 2, T = -2, I = -2)
val Irradiance = MetaDimension(M = 1, T = -3)
val Intensity = MetaDimension(M = 1, T = -3)
val Jerk = MetaDimension(L = 1, T = -3)
val Snap = MetaDimension(L = 1, T = -4)
val LinearDensity = MetaDimension(M = 1, L = -1)
val LuminousFlux = MetaDimension(J = 1)
val Mach = MetaDimension(1)
val MagneticFieldStrength = MetaDimension(L = -1, I = 1)
val MagneticFlux = MetaDimension(M = 1, L = 2, T = -2, I = -1)
val MagneticFluxDensity = MetaDimension(M = 1, T = -2, I = -1)
val Magnetization = MetaDimension(L = -1, I = 1)
val MassFraction = MetaDimension(1)
val Density = MetaDimension(M = 1, L = -3)
val MeanLifetime = MetaDimension(T = 1)
val MolarConcentration = MetaDimension(L = -3, N = 1)
val MolarEnergy = MetaDimension(M = 1, L = 2, T = -2, N = -1)
val MolarEntropy = MetaDimension(M = 1, L = 2, T = -2, Theta = -1, N = -1)
val MolarHeatCapacity = MetaDimension(M = 1, L = 2, T = -2, N = -1)
val MomentOfInertia = MetaDimension(M = 1, L = 2)
val Momentum = MetaDimension(M = 1, L = 1, T = -1)
val Permeability = MetaDimension(M = 1, L = 1, T = -2, I = -2)
val Permittivity = MetaDimension(M = -1, L = -3, T = 4, I = 2)
val PlaneAngle = MetaDimension(1)
val Power = MetaDimension(M = 1, L = 2, T = -3)
val Pressure = MetaDimension(M = 1, L = -1, T = -2)
val Pop = MetaDimension(L = 1, T = -6)
val RadioactiveActivity = MetaDimension(T = -1)
val RadioactiveDose = MetaDimension(L = 2, T = -2)
val Radiance = MetaDimension(M = 1, T = -3)
val RadiantIntensity = MetaDimension(M = 1, L = 2, T = -3)
val ReactionRate = MetaDimension(N = 1, L = -3, T = -1)
val RefractiveIndex = MetaDimension(1)
val SolidAngle = MetaDimension(1)
val Speed = MetaDimension(L = 1, T = -1)
val SpecificEnergy = MetaDimension(L = 2, T = -2)
val SpecificHeatCapacity = MetaDimension(L = 2, T = -2, Theta = -1)
val SpecificVolume = MetaDimension(M = -1, L = 3)
val Spin = MetaDimension(M = 1, L = 2, T = -1)
val Strain = MetaDimension(1)
val Stress = MetaDimension(M = 1, L = -1, T = -2)
val SurfaceTension = MetaDimension(M = 1, T = -2)
val ThermalConductivity = MetaDimension(M = 1, L = 1, T = -3, Theta = -1)
val Torque = MetaDimension(M = 1, L = 2, T = -2)
val Velocity = MetaDimension(L = 1, T = -1)
val Volume = MetaDimension(L = 3)
val Wavelength = MetaDimension(L = 1)
val Wavenumber = MetaDimension(L = -1)
val Wavevector = MetaDimension(L = -1)
val Weight = MetaDimension(M = 1, L = 1, T = -2)
val Work = MetaDimension(M = 1, L = 2, T = -2)
val YoungsModulus = MetaDimension(M = 1, L = -1, T = -2)
val LuminousEnergy = MetaDimension(T = 1, J = 1)
val Luminance = MetaDimension(L = -2, J = 1)
val LuminousEmittance = MetaDimension(L = -2, J = 1)
val LuminousExposure = MetaDimension(L = -2, T = 1, J = 1)
val LuminousEnergyDensity = MetaDimension(L = -3, T = 1, J = 1)
val LuminousEfficacy = MetaDimension(M = -1, L = -2, T = 3, J = 1)
val RadiantEnergy = MetaDimension(M = 1, L = 2, T = -2)
val RadiantEnergyDensity = MetaDimension(M = 1, L = -1, T = -2)
val RadiantFlux = MetaDimension(M = 1, L = 2, T = -3)
val SpectralFlux = MetaDimension(M = 1, L = 1, T = -3)
val SpectralIntensity = MetaDimension(M = 1, L = 1, T = -3)
val SpectralIrradiance = MetaDimension(M = 1, L = -1, T = -3)
val Radiosity = MetaDimension(M = 1, T = -3)
val RadiantExitance = MetaDimension(M = 1, T = -3)
val RadiantExposure = MetaDimension(M = 1, T = -2)

val commonQuantities = setOf(
        MetaQuantity("Length", Length),
        MetaQuantity("Mass", Mass),
        MetaQuantity("Time", Time),
        MetaQuantity("ElectricCurrent", ElectricCurrent),
        MetaQuantity("Temperature", Temperature),
        MetaQuantity("AmountOfSubstance", AmountOfSubstance),
        MetaQuantity("LuminousIntensity", LuminousIntensity),
        MetaQuantity("Absement", Absement),
        MetaQuantity("AbsorbedDoseRate", AbsorbedDoseRate),
        MetaQuantity("Acceleration", Acceleration),
        MetaQuantity("AngularAcceleration", AngularAcceleration),
        MetaQuantity("AngularMomentum", AngularMomentum),
        MetaQuantity("AngularVelocity", AngularVelocity),
        MetaQuantity("Area", Area),
        MetaQuantity("AreaDensity", AreaDensity),
        MetaQuantity("Capacitance", Capacitance),
        MetaQuantity("CatalyticActivity", CatalyticActivity),
        MetaQuantity("CatalyticActivityConcentration", CatalyticActivityConcentration),
        MetaQuantity("ChemicalPotential", ChemicalPotential),
        MetaQuantity("Crackle", Crackle),
        MetaQuantity("CurrentDensity", CurrentDensity),
        MetaQuantity("DoseEquivalent", DoseEquivalent),
        MetaQuantity("DynamicViscosity", DynamicViscosity),
        MetaQuantity("ElectricCharge", ElectricCharge),
        MetaQuantity("ElectricChargeDensity", ElectricChargeDensity),
        MetaQuantity("ElectricDisplacement", ElectricDisplacement),
        MetaQuantity("ElectricFieldStrength", ElectricFieldStrength),
        MetaQuantity("ElectricalConductance", ElectricalConductance),
        MetaQuantity("ElectricalConductivity", ElectricalConductivity),
        MetaQuantity("ElectricPotential", ElectricPotential),
        MetaQuantity("ElectricalResistance", ElectricalResistance),
        MetaQuantity("ElectricalResistivity", ElectricalResistivity),
        MetaQuantity("Energy", Energy),
        MetaQuantity("EnergyDensity", EnergyDensity),
        MetaQuantity("Entropy", Entropy),
        MetaQuantity("Force", Force),
        MetaQuantity("Frequency", Frequency),
        MetaQuantity("FuelEfficiency", FuelEfficiency),
        MetaQuantity("HalfLife", HalfLife),
        MetaQuantity("Heat", Heat),
        MetaQuantity("HeatCapacity", HeatCapacity),
        MetaQuantity("HeatFluxDensity", HeatFluxDensity),
        MetaQuantity("Illuminance", Illuminance),
        MetaQuantity("Impedance", Impedance),
        MetaQuantity("Impulse", Impulse),
        MetaQuantity("Inductance", Inductance),
        MetaQuantity("Irradiance", Irradiance),
        MetaQuantity("Intensity", Intensity),
        MetaQuantity("Jerk", Jerk),
        MetaQuantity("Snap", Snap),
        MetaQuantity("LinearDensity", LinearDensity),
        MetaQuantity("LuminousFlux", LuminousFlux),
        MetaQuantity("Mach", Mach),
        MetaQuantity("MagneticFieldStrength", MagneticFieldStrength),
        MetaQuantity("MagneticFlux", MagneticFlux),
        MetaQuantity("MagneticFluxDensity", MagneticFluxDensity),
        MetaQuantity("Magnetization", Magnetization),
        MetaQuantity("MassFraction", MassFraction),
        MetaQuantity("Density", Density),
        MetaQuantity("MeanLifetime", MeanLifetime),
        MetaQuantity("MolarConcentration", MolarConcentration),
        MetaQuantity("MolarEnergy", MolarEnergy),
        MetaQuantity("MolarEntropy", MolarEntropy),
        MetaQuantity("MolarHeatCapacity", MolarHeatCapacity),
        MetaQuantity("MomentOfInertia", MomentOfInertia),
        MetaQuantity("Momentum", Momentum),
        MetaQuantity("Permeability", Permeability),
        MetaQuantity("Permittivity", Permittivity),
        MetaQuantity("PlaneAngle", PlaneAngle),
        MetaQuantity("Power", Power),
        MetaQuantity("Pressure", Pressure),
        MetaQuantity("Pop", Pop),
        MetaQuantity("RadioactiveActivity", RadioactiveActivity),
        MetaQuantity("RadioactiveDose", RadioactiveDose),
        MetaQuantity("Radiance", Radiance),
        MetaQuantity("RadiantIntensity", RadiantIntensity),
        MetaQuantity("ReactionRate", ReactionRate),
        MetaQuantity("RefractiveIndex", RefractiveIndex),
        MetaQuantity("SolidAngle", SolidAngle),
        MetaQuantity("Speed", Speed),
        MetaQuantity("SpecificEnergy", SpecificEnergy),
        MetaQuantity("SpecificHeatCapacity", SpecificHeatCapacity),
        MetaQuantity("SpecificVolume", SpecificVolume),
        MetaQuantity("Spin", Spin),
        MetaQuantity("Strain", Strain),
        MetaQuantity("Stress", Stress),
        MetaQuantity("SurfaceTension", SurfaceTension),
        MetaQuantity("ThermalConductivity", ThermalConductivity),
        MetaQuantity("Torque", Torque),
        MetaQuantity("Velocity", Velocity),
        MetaQuantity("Volume", Volume),
        MetaQuantity("Wavelength", Wavelength),
        MetaQuantity("Wavenumber", Wavenumber),
        MetaQuantity("Wavevector", Wavevector),
        MetaQuantity("Weight", Weight),
        MetaQuantity("Work", Work),
        MetaQuantity("YoungsModulus", YoungsModulus),
        MetaQuantity("LuminousEnergy", LuminousEnergy),
        MetaQuantity("Luminance", Luminance),
        MetaQuantity("LuminousEmittance", LuminousEmittance),
        MetaQuantity("LuminousExposure", LuminousExposure),
        MetaQuantity("LuminousEnergyDensity", LuminousEnergyDensity),
        MetaQuantity("LuminousEfficacy", LuminousEfficacy),
        MetaQuantity("RadiantEnergy", RadiantEnergy),
        MetaQuantity("RadiantEnergyDensity", RadiantEnergyDensity),
        MetaQuantity("RadiantFlux", RadiantFlux),
        MetaQuantity("SpectralFlux", SpectralFlux),
        MetaQuantity("SpectralIntensity", SpectralIntensity),
        MetaQuantity("SpectralIrradiance", SpectralIrradiance),
        MetaQuantity("Radiosity", Radiosity),
        MetaQuantity("RadiantExitance", RadiantExitance),
        MetaQuantity("RadiantExposure", RadiantExposure)
)

val commonUnits = setOf(
        MetaUnitOfMeasure("Each", 1.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Score", 5.00E-02.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Dozen", 8.33E-02.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Percent", 100.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Gross", 0.006944444444.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Millifarads", 1000.toDouble(), Capacitance),
        MetaUnitOfMeasure("Farads", 1.toDouble(), Capacitance),
        MetaUnitOfMeasure("Microfarads", 1000000.toDouble(), Capacitance),
        MetaUnitOfMeasure("Nanofarads", 1.00E+09.toDouble(), Capacitance),
        MetaUnitOfMeasure("Kilofarads", 0.001.toDouble(), Capacitance),
        MetaUnitOfMeasure("Picofarads", 1.00E+12.toDouble(), Capacitance),
        MetaUnitOfMeasure("SiemensPerMeter", 1.toDouble(), ElectricalConductivity),
        MetaUnitOfMeasure("Abcoulombs", 0.1.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Coulombs", 1.00E+00.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("MilliampereHours", 2.78E-01.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Nanocoulombs", 1.00E+09.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Picocoulombs", 1.00E+12.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Millicoulombs", 1000.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Microcoulombs", 1000000.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("MilliampereSeconds", 1.00E+03.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("AmpereHours", 2.78E-04.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Amperes", 1.00E+00.toDouble(), ElectricCurrent),
        MetaUnitOfMeasure("Milliamperes", 1000.toDouble(), ElectricCurrent),
        MetaUnitOfMeasure("Millivolts", 1.00E+03.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Kilovolts", 0.001.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Microvolts", 1000000.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Megavolts", 1.00E-06.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Volts", 1.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Siemens", 1.toDouble(), ElectricalConductance),
        MetaUnitOfMeasure("Milliohms", 1000.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Microohms", 1000000.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Megohms", 1.00E-06.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Gigohms", 1.00E-09.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Ohms", 1.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Kilohms", 0.001.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Nanohms", 1.00E+09.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Henry", 1.toDouble(), Inductance),
        MetaUnitOfMeasure("Webers", 1.toDouble(), MagneticFlux),
        MetaUnitOfMeasure("Teslas", 1.toDouble(), MagneticFluxDensity),
        MetaUnitOfMeasure("Gauss", 10000.toDouble(), MagneticFluxDensity),
        MetaUnitOfMeasure("OhmMeters", 1.toDouble(), ElectricalResistivity),
        MetaUnitOfMeasure("Joules", 1.toDouble(), Energy),
        MetaUnitOfMeasure("WattHours", 2.78E-04.toDouble(), Energy),
        MetaUnitOfMeasure("GigawattHours", 2.78E-13.toDouble(), Energy),
        MetaUnitOfMeasure("BritishThermalUnits", 9.48E-04.toDouble(), Energy),
        MetaUnitOfMeasure("MegawattHours", 2.78E-10.toDouble(), Energy),
        MetaUnitOfMeasure("Terajoules", 1.00E-12.toDouble(), Energy),
        MetaUnitOfMeasure("Millijoules", 1000.toDouble(), Energy),
        MetaUnitOfMeasure("KilowattHours", 2.78E-07.toDouble(), Energy),
        MetaUnitOfMeasure("Kilojoules", 1.00E-03.toDouble(), Energy),
        MetaUnitOfMeasure("MMBtus", 9.48E-10.toDouble(), Energy),
        MetaUnitOfMeasure("Ergs", 1.00E+07.toDouble(), Energy),
        MetaUnitOfMeasure("Megajoules", 1.00E-06.toDouble(), Energy),
        MetaUnitOfMeasure("Microjoules", 1000000.toDouble(), Energy),
        MetaUnitOfMeasure("Nanojoules", 1.00E+09.toDouble(), Energy),
        MetaUnitOfMeasure("Picojoules", 1.00E+12.toDouble(), Energy),
        MetaUnitOfMeasure("MBtus", 9.48E-07.toDouble(), Energy),
        MetaUnitOfMeasure("Gigajoules", 1.00E-09.toDouble(), Energy),
        MetaUnitOfMeasure("JoulesPerCubicMeter", 1.00E+00.toDouble(), EnergyDensity),
        MetaUnitOfMeasure("SolarLuminosities", 2.61E-27.toDouble(), Power),
        MetaUnitOfMeasure("Watts", 1.00E+00.toDouble(), Power),
        MetaUnitOfMeasure("Milliwatts", 1000.toDouble(), Power),
        MetaUnitOfMeasure("BtusPerHour", 3.412141633.toDouble(), Power),
        MetaUnitOfMeasure("Megawatts", 1.00E-06.toDouble(), Power),
        MetaUnitOfMeasure("Kilowatts", 1.00E-03.toDouble(), Power),
        MetaUnitOfMeasure("ErgsPerSecond", 1.00E+07.toDouble(), Power),
        MetaUnitOfMeasure("Gigawatts", 1.00E-09.toDouble(), Power),
//MetaUnitOfMeasure("MegawattsPerHour", 1.00E-06.toDouble(), PowerRamp),
//MetaUnitOfMeasure("KilowattsPerHour", 0.001.toDouble(), PowerRamp),
//MetaUnitOfMeasure("GigawattsPerHour", 1.00E-09.toDouble(), PowerRamp),
//MetaUnitOfMeasure("WattsPerHour", 1.toDouble(), PowerRamp),
//MetaUnitOfMeasure("WattsPerMinute", 6.00E+01.toDouble(), PowerRamp),
//MetaUnitOfMeasure("KilowattsPerMinute", 0.06.toDouble(), PowerRamp),
        MetaUnitOfMeasure("Grays", 1.toDouble(), SpecificEnergy),
//MetaUnitOfMeasure("GibibytesPerSecond", 9.31E-10.toDouble(), DataRate),
//MetaUnitOfMeasure("ExbibytesPerSecond", 8.67E-19.toDouble(), DataRate),
//MetaUnitOfMeasure("BytesPerSecond", 1.toDouble(), DataRate),
//MetaUnitOfMeasure("KilobytesPerSecond", 1.00E-03.toDouble(), DataRate),
//MetaUnitOfMeasure("YobibytesPerSecond", 8.27E-25.toDouble(), DataRate),
//MetaUnitOfMeasure("TebibytesPerSecond", 9.09E-13.toDouble(), DataRate),
//MetaUnitOfMeasure("KibibytesPerSecond", 9.77E-04.toDouble(), DataRate),
//MetaUnitOfMeasure("ZettabytesPerSecond", 1.00E-21.toDouble(), DataRate),
//MetaUnitOfMeasure("PebibytesPerSecond", 8.88E-16.toDouble(), DataRate),
//MetaUnitOfMeasure("PetabytesPerSecond", 1.00E-15.toDouble(), DataRate),
//MetaUnitOfMeasure("GigabytesPerSecond", 1.00E-09.toDouble(), DataRate),
//MetaUnitOfMeasure("TerabytesPerSecond", 1.00E-12.toDouble(), DataRate),
//MetaUnitOfMeasure("MegabytesPerSecond", 1.00E-06.toDouble(), DataRate),
//MetaUnitOfMeasure("ExabytesPerSecond", 1.00E-18.toDouble(), DataRate),
//MetaUnitOfMeasure("ZebibytesPerSecond", 8.47E-22.toDouble(), DataRate),
//MetaUnitOfMeasure("MebibytesPerSecond", 9.54E-07.toDouble(), DataRate),
//MetaUnitOfMeasure("YottabytesPerSecond", 1.00E-24.toDouble(), DataRate),
//MetaUnitOfMeasure("Petabytes", 1.00E-15.toDouble(), Information),
//MetaUnitOfMeasure("Zebibytes", 8.47E-22.toDouble(), Information),
//MetaUnitOfMeasure("Yottabytes", 1.00E-24.toDouble(), Information),
//MetaUnitOfMeasure("Gigabytes", 1.00E-09.toDouble(), Information),
//MetaUnitOfMeasure("Pebibytes", 8.88E-16.toDouble(), Information),
//MetaUnitOfMeasure("Gibibytes", 9.31E-10.toDouble(), Information),
//MetaUnitOfMeasure("Bytes", 1.00E+00.toDouble(), Information),
//MetaUnitOfMeasure("Zettabytes", 1.00E-21.toDouble(), Information),
//MetaUnitOfMeasure("Tebibytes", 9.09E-13.toDouble(), Information),
//MetaUnitOfMeasure("Kilobytes", 1.00E-03.toDouble(), Information),
//MetaUnitOfMeasure("Exbibytes", 8.67E-19.toDouble(), Information),
//MetaUnitOfMeasure("Terabytes", 1.00E-12.toDouble(), Information),
//MetaUnitOfMeasure("Megabytes", 1.00E-06.toDouble(), Information),
//MetaUnitOfMeasure("Mebibytes", 9.54E-07.toDouble(), Information),
//MetaUnitOfMeasure("Kibibytes", 9.77E-04.toDouble(), Information),
//MetaUnitOfMeasure("Exabytes", 1.00E-18.toDouble(), Information),
//MetaUnitOfMeasure("Yobibytes", 8.27E-25.toDouble(), Information),
        MetaUnitOfMeasure("KilogramsPerSquareMeter", 1.00E+00.toDouble(), AreaDensity),
        MetaUnitOfMeasure("KilogramsPerHectare", 1.00E+04.toDouble(), AreaDensity),
        MetaUnitOfMeasure("GramsPerSquareCentimeter", 1.00E-01.toDouble(), AreaDensity),
        MetaUnitOfMeasure("Moles", 1.00E+00.toDouble(), AmountOfSubstance),
        MetaUnitOfMeasure("PoundMoles", 2.20E-03.toDouble(), AmountOfSubstance),
        MetaUnitOfMeasure("KilogramsPerCubicMeter", 1.toDouble(), Density),
        MetaUnitOfMeasure("Tolas", 8.57E+01.toDouble(), Mass),
        MetaUnitOfMeasure("SolarMasses", 5.03E-31.toDouble(), Mass),
        MetaUnitOfMeasure("TroyOunces", 3.22E+01.toDouble(), Mass),
        MetaUnitOfMeasure("Micrograms", 1.00E+09.toDouble(), Mass),
        MetaUnitOfMeasure("Stone", 0.1574730444.toDouble(), Mass),
        MetaUnitOfMeasure("Carats", 5000.toDouble(), Mass),
        MetaUnitOfMeasure("Tonnes", 0.001.toDouble(), Mass),
        MetaUnitOfMeasure("TroyGrains", 15432.35835.toDouble(), Mass),
        MetaUnitOfMeasure("Pounds", 2.204622622.toDouble(), Mass),
        MetaUnitOfMeasure("Pennyweights", 643.0149314.toDouble(), Mass),
        MetaUnitOfMeasure("Milligrams", 1000000.toDouble(), Mass),
        MetaUnitOfMeasure("Kilopounds", 0.002204622622.toDouble(), Mass),
        MetaUnitOfMeasure("Megapounds", 0.002204622622.toDouble(), Mass),
        MetaUnitOfMeasure("Grams", 1000.toDouble(), Mass),
        MetaUnitOfMeasure("Ounces", 35.27396195.toDouble(), Mass),
        MetaUnitOfMeasure("Kilograms", 1.toDouble(), Mass),
        MetaUnitOfMeasure("TroyPounds", 2.679228881.toDouble(), Mass),
        MetaUnitOfMeasure("KilogramsMetersSquared", 1.toDouble(), MomentOfInertia),
        MetaUnitOfMeasure("PoundsSquareFeet", 0.02373026548.toDouble(), MomentOfInertia),
        MetaUnitOfMeasure("FeetPerSecondSquared", 3.28E+00.toDouble(), Acceleration),
        MetaUnitOfMeasure("MetersPerSecondSquared", 1.toDouble(), Acceleration),
        MetaUnitOfMeasure("UsMilesPerHourSquared", 8052.954545.toDouble(), Acceleration),
        MetaUnitOfMeasure("EarthGravities", 0.1019716213.toDouble(), Acceleration),
        MetaUnitOfMeasure("RadiansPerSecondSquared", 1.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("ArcsecondsPerSecondSquared", 2.06E+05.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("DegreesPerSecondSquared", 57.29577951.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("ArcminutesPerSecondSquared", 3437.746771.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("TurnsPerSecondSquared", 0.1591549431.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("GradiansPerSecondSquared", 63.66197724.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("RadiansPerSecond", 1.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("DegreesPerSecond", 57.29577951.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("GradiansPerSecond", 63.66197724.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("TurnsPerSecond", 0.1591549431.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("Newtons", 1.toDouble(), Force),
        MetaUnitOfMeasure("KilogramForce", 0.1019716213.toDouble(), Force),
        MetaUnitOfMeasure("PoundForce", 0.2248089431.toDouble(), Force),
        MetaUnitOfMeasure("MetersPerSecondCubed", 1.toDouble(), Jerk),
        MetaUnitOfMeasure("FeetPerSecondCubed", 3.280833333.toDouble(), Jerk),
//MetaUnitOfMeasure("PoundsPerSecond", 2.204622622.toDouble(), MassFlow),
//MetaUnitOfMeasure("PoundsPerHour", 7936.641439.toDouble(), MassFlow),
//MetaUnitOfMeasure("MegapoundsPerHour", 0.007936641439.toDouble(), MassFlow),
//MetaUnitOfMeasure("KilopoundsPerHour", 7.936641439.toDouble(), MassFlow),
//MetaUnitOfMeasure("KilogramsPerSecond", 1.toDouble(), MassFlow),
        MetaUnitOfMeasure("NewtonSeconds", 1.toDouble(), Momentum),
        MetaUnitOfMeasure("Bars", 1.00E-05.toDouble(), Pressure),
        MetaUnitOfMeasure("Pascals", 1.toDouble(), Pressure),
        MetaUnitOfMeasure("PoundsPerSquareInch", 1.45E-04.toDouble(), Pressure),
        MetaUnitOfMeasure("StandardAtmospheres", 9.87E-06.toDouble(), Pressure),
        MetaUnitOfMeasure("MillimetersOfMercury", 0.007500615758.toDouble(), Pressure),
        MetaUnitOfMeasure("Torrs", 0.007500616827.toDouble(), Pressure),
//MetaUnitOfMeasure("PascalsPerSecond", 1.toDouble(), PressureChange),
//MetaUnitOfMeasure("BarsPerSecond", 1.00E-05.toDouble(), PressureChange),
//MetaUnitOfMeasure("PoundsPerSquareInchPerSecond", 1.45E-04.toDouble(), PressureChange),
//MetaUnitOfMeasure("StandardAtmospheresPerSecond", 9.87E-06.toDouble(), PressureChange),
        MetaUnitOfMeasure("NewtonMeters", 1.toDouble(), Torque),
        MetaUnitOfMeasure("PoundFeet", 0.7375606742.toDouble(), Torque),
        MetaUnitOfMeasure("KilometersPerHour", 3.6.toDouble(), Velocity),
        MetaUnitOfMeasure("InternationalMilesPerHour", 2.236936292.toDouble(), Velocity),
        MetaUnitOfMeasure("MetersPerSecond", 1.toDouble(), Velocity),
        MetaUnitOfMeasure("FeetPerSecond", 3.280833333.toDouble(), Velocity),
        MetaUnitOfMeasure("KilometersPerSecond", 0.001.toDouble(), Velocity),
        MetaUnitOfMeasure("UsMilesPerHour", 2.236931818.toDouble(), Velocity),
        MetaUnitOfMeasure("Knots", 1.943844492.toDouble(), Velocity),
//MetaUnitOfMeasure("GallonsPerSecond", 264.1720524.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("CubicMetersPerSecond", 1.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("GallonsPerDay", 2.28E+07.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("GallonsPerHour", 9.51E+05.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("CubicFeetPerHour", 127132.0374.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("GallonsPerMinute", 15850.32314.toDouble(), VolumeFlow),
//MetaUnitOfMeasure("NewtonsPerSecond", 1.toDouble(), Yank),
        MetaUnitOfMeasure("Lux", 1.00E+00.toDouble(), Illuminance),
        MetaUnitOfMeasure("CandelasPerSquareMeter", 1.00E+00.toDouble(), Luminance),
        MetaUnitOfMeasure("LumenSeconds", 1.toDouble(), LuminousEnergy),
        MetaUnitOfMeasure("LuxSeconds", 1.toDouble(), LuminousExposure),
        MetaUnitOfMeasure("Lumens", 1.00E+00.toDouble(), LuminousFlux),
        MetaUnitOfMeasure("Candelas", 1.00E+00.toDouble(), LuminousIntensity),
        MetaUnitOfMeasure("WattsPerSquareMeter", 1.00E+00.toDouble(), Irradiance),
        MetaUnitOfMeasure("ErgsPerSecondPerSquareCentimeter", 1000.toDouble(), Irradiance),
        MetaUnitOfMeasure("WattsPerSteradianPerSquareMeter", 1.toDouble(), Radiance),
        MetaUnitOfMeasure("WattsPerSteradian", 1.toDouble(), RadiantIntensity),
        MetaUnitOfMeasure("WattsPerSteradianPerMeter", 1.toDouble(), SpectralIntensity),
        MetaUnitOfMeasure("WattsPerCubicMeter", 1.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerSquareMeterPerMicron", 1.00E-06.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerSquareMeterPerNanometer", 1.00E-09.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("ErgsPerSecondPerSquareCentimeterPerAngstrom", 1.00E-07.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerMeter", 1.toDouble(), SpectralFlux),
        MetaUnitOfMeasure("Turns", 0.1591549431.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Arcseconds", 206264.8062.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Gradians", 63.66197724.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Radians", 1.00E+00.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Arcminutes", 3437.746771.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Degrees", 57.29577951.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("SquareInches", 1550.0031.toDouble(), Area),
        MetaUnitOfMeasure("SquareFeet", 10.76391042.toDouble(), Area),
        MetaUnitOfMeasure("Acres", 2.47E-04.toDouble(), Area),
        MetaUnitOfMeasure("SquareKilometers", 1.00E-06.toDouble(), Area),
        MetaUnitOfMeasure("SquareCentimeters", 10000.toDouble(), Area),
        MetaUnitOfMeasure("SquareUsMiles", 3.86E-07.toDouble(), Area),
        MetaUnitOfMeasure("Barnes", 1.00E+28.toDouble(), Area),
        MetaUnitOfMeasure("SquareYards", 1.195990046.toDouble(), Area),
        MetaUnitOfMeasure("SquareMeters", 1.toDouble(), Area),
        MetaUnitOfMeasure("Hectares", 1.00E-04.toDouble(), Area),
        MetaUnitOfMeasure("Inches", 39.37.toDouble(), Length),
        MetaUnitOfMeasure("NauticalMiles", 5.40E-04.toDouble(), Length),
        MetaUnitOfMeasure("Nanometers", 1.00E+09.toDouble(), Length),
        MetaUnitOfMeasure("NominalSolarRadii", 1.44E-09.toDouble(), Length),
        MetaUnitOfMeasure("Parsecs", 3.24E-17.toDouble(), Length),
        MetaUnitOfMeasure("AstronomicalUnits", 6.68E-12.toDouble(), Length),
        MetaUnitOfMeasure("UsMiles", 6.21E-04.toDouble(), Length),
        MetaUnitOfMeasure("Decameters", 0.1.toDouble(), Length),
        MetaUnitOfMeasure("Microns", 1000000.toDouble(), Length),
        MetaUnitOfMeasure("InternationalMiles", 6.21E-04.toDouble(), Length),
        MetaUnitOfMeasure("Feet", 3.280833333.toDouble(), Length),
        MetaUnitOfMeasure("Centimeters", 100.toDouble(), Length),
        MetaUnitOfMeasure("Kilometers", 0.001.toDouble(), Length),
        MetaUnitOfMeasure("Hectometers", 0.01.toDouble(), Length),
        MetaUnitOfMeasure("Decimeters", 10.toDouble(), Length),
        MetaUnitOfMeasure("Meters", 1.toDouble(), Length),
        MetaUnitOfMeasure("SolarRadii", 1.44E-09.toDouble(), Length),
        MetaUnitOfMeasure("Millimeters", 1000.toDouble(), Length),
        MetaUnitOfMeasure("Angstroms", 1.00E+10.toDouble(), Length),
        MetaUnitOfMeasure("LightYears", 1.06E-16.toDouble(), Length),
        MetaUnitOfMeasure("Yards", 1.09E+00.toDouble(), Length),
        MetaUnitOfMeasure("SquaredRadians", 1.toDouble(), SolidAngle),
        MetaUnitOfMeasure("UsGallons", 264.1720524.toDouble(), Volume),
        MetaUnitOfMeasure("CubicYards", 1.307942772.toDouble(), Volume),
        MetaUnitOfMeasure("AcreFeet", 8.11E-04.toDouble(), Volume),
        MetaUnitOfMeasure("CubicUsMiles", 2.40E-10.toDouble(), Volume),
        MetaUnitOfMeasure("Hectolitres", 10.toDouble(), Volume),
        MetaUnitOfMeasure("CubicInches", 61023.37795.toDouble(), Volume),
        MetaUnitOfMeasure("FluidOunces", 33814.0227.toDouble(), Volume),
        MetaUnitOfMeasure("Decilitres", 10000.toDouble(), Volume),
        MetaUnitOfMeasure("Millilitres", 1000000.toDouble(), Volume),
        MetaUnitOfMeasure("UsQuarts", 1056.688209.toDouble(), Volume),
        MetaUnitOfMeasure("Teaspoons", 202884.1362.toDouble(), Volume),
        MetaUnitOfMeasure("Nanolitres", 1.00E+12.toDouble(), Volume),
        MetaUnitOfMeasure("UsCups", 4226.752838.toDouble(), Volume),
        MetaUnitOfMeasure("CubicFeet", 35.31445483.toDouble(), Volume),
        MetaUnitOfMeasure("UsPints", 2.11E+03.toDouble(), Volume),
        MetaUnitOfMeasure("Centilitres", 1.00E+05.toDouble(), Volume),
        MetaUnitOfMeasure("Litres", 1.00E+03.toDouble(), Volume),
        MetaUnitOfMeasure("Microlitres", 1.00E+09.toDouble(), Volume),
        MetaUnitOfMeasure("Tablespoons", 6.76E+04.toDouble(), Volume),
        MetaUnitOfMeasure("CubicMeters", 1.toDouble(), Volume),
        MetaUnitOfMeasure("Kelvin", 1.toDouble(), Temperature),
        MetaUnitOfMeasure("Fahrenheit", -457.87.toDouble(), Temperature),
        MetaUnitOfMeasure("Celsius", -272.15.toDouble(), Temperature),
        MetaUnitOfMeasure("Rankine", 1.8.toDouble(), Temperature),
        MetaUnitOfMeasure("JoulesPerKelvin", 1.00E+00.toDouble(), HeatCapacity),
        MetaUnitOfMeasure("RevolutionsPerMinute", 60.toDouble(), Frequency),
        MetaUnitOfMeasure("Terahertz", 1.00E-12.toDouble(), Frequency),
        MetaUnitOfMeasure("Gigahertz", 1.00E-09.toDouble(), Frequency),
        MetaUnitOfMeasure("Kilohertz", 0.001.toDouble(), Frequency),
        MetaUnitOfMeasure("Hertz", 1.00E+00.toDouble(), Frequency),
        MetaUnitOfMeasure("Megahertz", 1.00E-06.toDouble(), Frequency),
        MetaUnitOfMeasure("Seconds", 1.00E+00.toDouble(), Time),
        MetaUnitOfMeasure("Nanoseconds", 1.00E+09.toDouble(), Time),
        MetaUnitOfMeasure("Minutes", 1.67E-02.toDouble(), Time),
        MetaUnitOfMeasure("Microseconds", 1000000.toDouble(), Time),
        MetaUnitOfMeasure("Hours", 2.78E-04.toDouble(), Time),
        MetaUnitOfMeasure("Milliseconds", 1000.toDouble(), Time),
        MetaUnitOfMeasure("Days", 1.16E-05.toDouble(), Time)
)