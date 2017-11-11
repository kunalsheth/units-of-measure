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
        MetaUnitOfMeasure("FeetPerSecondSquared", 0.3048006096.toDouble(), Acceleration),
        MetaUnitOfMeasure("EarthGravities", 9.81E+00.toDouble(), Acceleration),
        MetaUnitOfMeasure("MetersPerSecondSquared", 1.00E+00.toDouble(), Acceleration),
        MetaUnitOfMeasure("UsMilesPerHourSquared", 1.24E-04.toDouble(), Acceleration),
        MetaUnitOfMeasure("Arcminutes", 2.91E-04.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Arcseconds", 4.85E-06.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Gradians", 0.01570796327.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Radians", 1.00E+00.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Turns", 6.28E+00.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("Degrees", 1.75E-02.toDouble(), PlaneAngle),
        MetaUnitOfMeasure("ArcminutesPerSecondSquared", 2.91E-04.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("ArcsecondsPerSecondSquared", 4.85E-06.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("GradiansPerSecondSquared", 0.01570796327.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("RadiansPerSecondSquared", 1.00E+00.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("TurnsPerSecondSquared", 6.28E+00.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("DegreesPerSecondSquared", 1.75E-02.toDouble(), AngularAcceleration),
        MetaUnitOfMeasure("GradiansPerSecond", 1.57E-02.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("RadiansPerSecond", 1.00E+00.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("TurnsPerSecond", 6.283185307.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("DegreesPerSecond", 1.75E-02.toDouble(), AngularVelocity),
        MetaUnitOfMeasure("Acres", 4.05E+03.toDouble(), Area),
        MetaUnitOfMeasure("Barnes", 1.00E-28.toDouble(), Area),
        MetaUnitOfMeasure("SquareCentimeters", 1.00E-04.toDouble(), Area),
        MetaUnitOfMeasure("SquareFeet", 9.29E-02.toDouble(), Area),
        MetaUnitOfMeasure("Hectares", 10000.toDouble(), Area),
        MetaUnitOfMeasure("SquareInches", 6.45E-04.toDouble(), Area),
        MetaUnitOfMeasure("SquareKilometers", 1.00E+06.toDouble(), Area),
        MetaUnitOfMeasure("SquareUsMiles", 2589988.11.toDouble(), Area),
        MetaUnitOfMeasure("SquareMeters", 1.toDouble(), Area),
        MetaUnitOfMeasure("SquareYards", 0.83612736.toDouble(), Area),
        MetaUnitOfMeasure("GramsPerSquareCentimeter", 10.toDouble(), AreaDensity),
        MetaUnitOfMeasure("KilogramsPerHectare", 1.00E-04.toDouble(), AreaDensity),
        MetaUnitOfMeasure("KilogramsPerSquareMeter", 1.00E+00.toDouble(), AreaDensity),
        MetaUnitOfMeasure("Farads", 1.00E+00.toDouble(), Capacitance),
        MetaUnitOfMeasure("Kilofarads", 1000.toDouble(), Capacitance),
        MetaUnitOfMeasure("Millifarads", 1.00E-03.toDouble(), Capacitance),
        MetaUnitOfMeasure("Nanofarads", 1.00E-09.toDouble(), Capacitance),
        MetaUnitOfMeasure("Picofarads", 1.00E-12.toDouble(), Capacitance),
        MetaUnitOfMeasure("Microfarads", 1.00E-06.toDouble(), Capacitance),
        MetaUnitOfMeasure("PoundMoles", 4.54E+02.toDouble(), AmountOfSubstance),
        MetaUnitOfMeasure("Moles", 1.toDouble(), AmountOfSubstance),
        MetaUnitOfMeasure("SiemensPerMeter", 1.00E+00.toDouble(), ElectricalConductivity),
//        MetaUnitOfMeasure("BytesPerSecond", 1.00E+00.toDouble(), DataRate),
//        MetaUnitOfMeasure("ExabytesPerSecond", 1.00E+18.toDouble(), DataRate),
//        MetaUnitOfMeasure("ExbibytesPerSecond", 1.15E+18.toDouble(), DataRate),
//        MetaUnitOfMeasure("GigabytesPerSecond", 1.00E+09.toDouble(), DataRate),
//        MetaUnitOfMeasure("GibibytesPerSecond", 1.07E+09.toDouble(), DataRate),
//        MetaUnitOfMeasure("KilobytesPerSecond", 1000.toDouble(), DataRate),
//        MetaUnitOfMeasure("KibibytesPerSecond", 1.02E+03.toDouble(), DataRate),
//        MetaUnitOfMeasure("MegabytesPerSecond", 1.00E+06.toDouble(), DataRate),
//        MetaUnitOfMeasure("MebibytesPerSecond", 1.05E+06.toDouble(), DataRate),
//        MetaUnitOfMeasure("PetabytesPerSecond", 1.00E+15.toDouble(), DataRate),
//        MetaUnitOfMeasure("PebibytesPerSecond", 1.13E+15.toDouble(), DataRate),
//        MetaUnitOfMeasure("TerabytesPerSecond", 1.00E+12.toDouble(), DataRate),
//        MetaUnitOfMeasure("TebibytesPerSecond", 1.10E+12.toDouble(), DataRate),
//        MetaUnitOfMeasure("YottabytesPerSecond", 1.00E+24.toDouble(), DataRate),
//        MetaUnitOfMeasure("YobibytesPerSecond", 1.21E+24.toDouble(), DataRate),
//        MetaUnitOfMeasure("ZettabytesPerSecond", 1.00E+21.toDouble(), DataRate),
//        MetaUnitOfMeasure("ZebibytesPerSecond", 1.18E+21.toDouble(), DataRate),
        MetaUnitOfMeasure("KilogramsPerCubicMeter", 1.00E+00.toDouble(), Density),
        MetaUnitOfMeasure("Percent", 1.00E-02.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Dozen", 1.20E+01.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Each", 1.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Gross", 1.44E+02.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("Score", 2.00E+01.toDouble(), MetaDimension()),
        MetaUnitOfMeasure("AmpereHours", 3.60E+03.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Coulombs", 1.00E+00.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Abcoulombs", 1.00E+01.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("MilliampereHours", 3.6.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("MilliampereSeconds", 1.00E-03.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Millicoulombs", 0.001.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Nanocoulombs", 1.00E-09.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Picocoulombs", 1.00E-12.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Microcoulombs", 1.00E-06.toDouble(), ElectricCharge),
        MetaUnitOfMeasure("Amperes", 1.00E+00.toDouble(), ElectricCurrent),
        MetaUnitOfMeasure("Milliamperes", 1.00E-03.toDouble(), ElectricCurrent),
        MetaUnitOfMeasure("Megavolts", 1000000.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Volts", 1.00E+00.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Kilovolts", 1.00E+03.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Millivolts", 1.00E-03.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Microvolts", 1.00E-06.toDouble(), ElectricPotential),
        MetaUnitOfMeasure("Siemens", 1.00E+00.toDouble(), ElectricalConductance),
        MetaUnitOfMeasure("Gigohms", 1.00E+09.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Megohms", 1.00E+06.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Kilohms", 1.00E+03.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Milliohms", 1.00E-03.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Nanohms", 1.00E-09.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Microohms", 1.00E-06.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("Ohms", 1.00E+00.toDouble(), ElectricalResistance),
        MetaUnitOfMeasure("BritishThermalUnits", 1.06E+03.toDouble(), Energy),
        MetaUnitOfMeasure("Gigajoules", 1.00E+09.toDouble(), Energy),
        MetaUnitOfMeasure("GigawattHours", 3.60E+12.toDouble(), Energy),
        MetaUnitOfMeasure("Joules", 1.00E+00.toDouble(), Energy),
        MetaUnitOfMeasure("MBtus", 1.06E+06.toDouble(), Energy),
        MetaUnitOfMeasure("Megajoules", 1.00E+06.toDouble(), Energy),
        MetaUnitOfMeasure("MMBtus", 1.06E+09.toDouble(), Energy),
        MetaUnitOfMeasure("MegawattHours", 3.60E+09.toDouble(), Energy),
        MetaUnitOfMeasure("Terajoules", 1.00E+12.toDouble(), Energy),
        MetaUnitOfMeasure("WattHours", 3.60E+03.toDouble(), Energy),
        MetaUnitOfMeasure("Ergs", 1.00E-07.toDouble(), Energy),
        MetaUnitOfMeasure("Kilojoules", 1.00E+03.toDouble(), Energy),
        MetaUnitOfMeasure("KilowattHours", 3.60E+06.toDouble(), Energy),
        MetaUnitOfMeasure("Millijoules", 1.00E-03.toDouble(), Energy),
        MetaUnitOfMeasure("Nanojoules", 1.00E-09.toDouble(), Energy),
        MetaUnitOfMeasure("Picojoules", 1.00E-12.toDouble(), Energy),
        MetaUnitOfMeasure("Microjoules", 1.00E-06.toDouble(), Energy),
        MetaUnitOfMeasure("JoulesPerCubicMeter", 1.00E+00.toDouble(), EnergyDensity),
        MetaUnitOfMeasure("Newtons", 1.00E+00.toDouble(), Force),
        MetaUnitOfMeasure("KilogramForce", 9.81E+00.toDouble(), Force),
        MetaUnitOfMeasure("PoundForce", 4.45E+00.toDouble(), Force),
        MetaUnitOfMeasure("Gigahertz", 1.00E+09.toDouble(), Frequency),
        MetaUnitOfMeasure("Hertz", 1.00E+00.toDouble(), Frequency),
        MetaUnitOfMeasure("Megahertz", 1.00E+06.toDouble(), Frequency),
        MetaUnitOfMeasure("Terahertz", 1.00E+12.toDouble(), Frequency),
        MetaUnitOfMeasure("Kilohertz", 1.00E+03.toDouble(), Frequency),
        MetaUnitOfMeasure("RevolutionsPerMinute", 1.67E-02.toDouble(), Frequency),
        MetaUnitOfMeasure("Lux", 1.00E+00.toDouble(), Illuminance),
        MetaUnitOfMeasure("Henry", 1.00E+00.toDouble(), Inductance),
//        MetaUnitOfMeasure("Bytes", 1.00E+00.toDouble(), Information),
//        MetaUnitOfMeasure("Exabytes", 1.00E+18.toDouble(), Information),
//        MetaUnitOfMeasure("Exbibytes", 1.15E+18.toDouble(), Information),
//        MetaUnitOfMeasure("Gigabytes", 1.00E+09.toDouble(), Information),
//        MetaUnitOfMeasure("Gibibytes", 1.07E+09.toDouble(), Information),
//        MetaUnitOfMeasure("Kilobytes", 1000.toDouble(), Information),
//        MetaUnitOfMeasure("Kibibytes", 1024.toDouble(), Information),
//        MetaUnitOfMeasure("Megabytes", 1000000.toDouble(), Information),
//        MetaUnitOfMeasure("Mebibytes", 1048576.toDouble(), Information),
//        MetaUnitOfMeasure("Petabytes", 1.00E+15.toDouble(), Information),
//        MetaUnitOfMeasure("Pebibytes", 1.13E+15.toDouble(), Information),
//        MetaUnitOfMeasure("Terabytes", 1.00E+12.toDouble(), Information),
//        MetaUnitOfMeasure("Tebibytes", 1.10E+12.toDouble(), Information),
//        MetaUnitOfMeasure("Yottabytes", 1.00E+24.toDouble(), Information),
//        MetaUnitOfMeasure("Yobibytes", 1.21E+24.toDouble(), Information),
//        MetaUnitOfMeasure("Zettabytes", 1.00E+21.toDouble(), Information),
//        MetaUnitOfMeasure("Zebibytes", 1.18E+21.toDouble(), Information),
        MetaUnitOfMeasure("WattsPerSquareMeter", 1.00E+00.toDouble(), Irradiance),
        MetaUnitOfMeasure("ErgsPerSecondPerSquareCentimeter", 1.00E-03.toDouble(), Irradiance),
        MetaUnitOfMeasure("FeetPerSecondCubed", 0.3048006096.toDouble(), Jerk),
        MetaUnitOfMeasure("MetersPerSecondCubed", 1.00E+00.toDouble(), Jerk),
        MetaUnitOfMeasure("NominalSolarRadii", 6.96E+08.toDouble(), Length),
        MetaUnitOfMeasure("SolarRadii", 6.96E+08.toDouble(), Length),
        MetaUnitOfMeasure("AstronomicalUnits", 1.50E+11.toDouble(), Length),
        MetaUnitOfMeasure("Centimeters", 0.01.toDouble(), Length),
        MetaUnitOfMeasure("Decameters", 10.toDouble(), Length),
        MetaUnitOfMeasure("Decimeters", 0.1.toDouble(), Length),
        MetaUnitOfMeasure("Feet", 0.3048006096.toDouble(), Length),
        MetaUnitOfMeasure("Hectometers", 100.toDouble(), Length),
        MetaUnitOfMeasure("Inches", 0.0254000508.toDouble(), Length),
        MetaUnitOfMeasure("Kilometers", 1000.toDouble(), Length),
        MetaUnitOfMeasure("LightYears", 9.46E+15.toDouble(), Length),
        MetaUnitOfMeasure("Meters", 1.toDouble(), Length),
        MetaUnitOfMeasure("UsMiles", 1609.347219.toDouble(), Length),
        MetaUnitOfMeasure("InternationalMiles", 1.61E+03.toDouble(), Length),
        MetaUnitOfMeasure("Millimeters", 0.001.toDouble(), Length),
        MetaUnitOfMeasure("Nanometers", 1.00E-09.toDouble(), Length),
        MetaUnitOfMeasure("NauticalMiles", 1852.toDouble(), Length),
        MetaUnitOfMeasure("Parsecs", 3.09E+16.toDouble(), Length),
        MetaUnitOfMeasure("Yards", 0.9144018288.toDouble(), Length),
        MetaUnitOfMeasure("Microns", 1.00E-06.toDouble(), Length),
        MetaUnitOfMeasure("Angstroms", 1.00E-10.toDouble(), Length),
        MetaUnitOfMeasure("CandelasPerSquareMeter", 1.00E+00.toDouble(), Luminance),
        MetaUnitOfMeasure("LumenSeconds", 1.00E+00.toDouble(), LuminousEnergy),
        MetaUnitOfMeasure("LuxSeconds", 1.toDouble(), LuminousExposure),
        MetaUnitOfMeasure("Lumens", 1.toDouble(), LuminousFlux),
        MetaUnitOfMeasure("Candelas", 1.toDouble(), LuminousIntensity),
        MetaUnitOfMeasure("Webers", 1.00E+00.toDouble(), MagneticFlux),
        MetaUnitOfMeasure("Gauss", 1.00E-04.toDouble(), MagneticFluxDensity),
        MetaUnitOfMeasure("Teslas", 1.00E+00.toDouble(), MagneticFluxDensity),
        MetaUnitOfMeasure("Megapounds", 453.59237.toDouble(), Mass),
        MetaUnitOfMeasure("SolarMasses", 1.99E+30.toDouble(), Mass),
        MetaUnitOfMeasure("Carats", 2.00E-04.toDouble(), Mass),
        MetaUnitOfMeasure("Pennyweights", 0.00155517384.toDouble(), Mass),
        MetaUnitOfMeasure("Grams", 0.001.toDouble(), Mass),
        MetaUnitOfMeasure("TroyGrains", 6.48E-05.toDouble(), Mass),
        MetaUnitOfMeasure("Kilograms", 1.toDouble(), Mass),
        MetaUnitOfMeasure("Kilopounds", 453.59237.toDouble(), Mass),
        MetaUnitOfMeasure("Pounds", 0.45359237.toDouble(), Mass),
        MetaUnitOfMeasure("TroyPounds", 3.73E-01.toDouble(), Mass),
        MetaUnitOfMeasure("Micrograms", 1.00E-09.toDouble(), Mass),
        MetaUnitOfMeasure("Milligrams", 1.00E-06.toDouble(), Mass),
        MetaUnitOfMeasure("Ounces", 2.83E-02.toDouble(), Mass),
        MetaUnitOfMeasure("TroyOunces", 3.11E-02.toDouble(), Mass),
        MetaUnitOfMeasure("Stone", 6.35029318.toDouble(), Mass),
        MetaUnitOfMeasure("Tonnes", 1000.toDouble(), Mass),
        MetaUnitOfMeasure("Tolas", 1.17E-02.toDouble(), Mass),
//        MetaUnitOfMeasure("MegapoundsPerHour", 1.26E+02.toDouble(), MassFlow),
//        MetaUnitOfMeasure("KilogramsPerSecond", 1.toDouble(), MassFlow),
//        MetaUnitOfMeasure("KilopoundsPerHour", 0.1259978806.toDouble(), MassFlow),
//        MetaUnitOfMeasure("PoundsPerHour", 1.26E-04.toDouble(), MassFlow),
//        MetaUnitOfMeasure("PoundsPerSecond", 4.54E-01.toDouble(), MassFlow),
        MetaUnitOfMeasure("KilogramsMetersSquared", 1.00E+00.toDouble(), MomentOfInertia),
        MetaUnitOfMeasure("PoundsSquareFeet", 4.21E+01.toDouble(), MomentOfInertia),
        MetaUnitOfMeasure("NewtonSeconds", 1.toDouble(), Momentum),
        MetaUnitOfMeasure("BtusPerHour", 0.2930710702.toDouble(), Power),
        MetaUnitOfMeasure("Gigawatts", 1.00E+09.toDouble(), Power),
        MetaUnitOfMeasure("SolarLuminosities", 3.83E+26.toDouble(), Power),
        MetaUnitOfMeasure("Megawatts", 1.00E+06.toDouble(), Power),
        MetaUnitOfMeasure("Watts", 1.00E+00.toDouble(), Power),
        MetaUnitOfMeasure("ErgsPerSecond", 1.00E-07.toDouble(), Power),
        MetaUnitOfMeasure("Kilowatts", 1000.toDouble(), Power),
        MetaUnitOfMeasure("Milliwatts", 1.00E-03.toDouble(), Power),
//        MetaUnitOfMeasure("GigawattsPerHour", 1.00E+09.toDouble(), PowerRamp),
//        MetaUnitOfMeasure("MegawattsPerHour", 1000000.toDouble(), PowerRamp),
//        MetaUnitOfMeasure("WattsPerHour", 1.00E+00.toDouble(), PowerRamp),
//        MetaUnitOfMeasure("WattsPerMinute", 1.67E-02.toDouble(), PowerRamp),
//        MetaUnitOfMeasure("KilowattsPerHour", 1000.toDouble(), PowerRamp),
//        MetaUnitOfMeasure("KilowattsPerMinute", 16.66666667.toDouble(), PowerRamp),
        MetaUnitOfMeasure("Pascals", 1.toDouble(), Pressure),
        MetaUnitOfMeasure("Torrs", 1.33E+02.toDouble(), Pressure),
        MetaUnitOfMeasure("StandardAtmospheres", 1.01E+05.toDouble(), Pressure),
        MetaUnitOfMeasure("Bars", 100000.toDouble(), Pressure),
        MetaUnitOfMeasure("MillimetersOfMercury", 1.33E+02.toDouble(), Pressure),
        MetaUnitOfMeasure("PoundsPerSquareInch", 6.89E+03.toDouble(), Pressure),
//        MetaUnitOfMeasure("PascalsPerSecond", 1.toDouble(), PressureChange),
//        MetaUnitOfMeasure("StandardAtmospheresPerSecond", 1.01E+05.toDouble(), PressureChange),
//        MetaUnitOfMeasure("BarsPerSecond", 1.00E+05.toDouble(), PressureChange),
//        MetaUnitOfMeasure("PoundsPerSquareInchPerSecond", 6894.757293.toDouble(), PressureChange),
        MetaUnitOfMeasure("WattsPerSteradianPerSquareMeter", 1.00E+00.toDouble(), Radiance),
        MetaUnitOfMeasure("WattsPerSteradian", 1.00E+00.toDouble(), RadiantIntensity),
        MetaUnitOfMeasure("OhmMeters", 1.00E+00.toDouble(), ElectricalResistivity),
        MetaUnitOfMeasure("SquaredRadians", 1.00E+00.toDouble(), SolidAngle),
        MetaUnitOfMeasure("Grays", 1.00E+00.toDouble(), SpecificEnergy),
        MetaUnitOfMeasure("WattsPerSteradianPerMeter", 1.00E+00.toDouble(), SpectralIntensity),
        MetaUnitOfMeasure("WattsPerSquareMeterPerNanometer", 1.00E+09.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerSquareMeterPerMicron", 1000000.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerCubicMeter", 1.00E+00.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("ErgsPerSecondPerSquareCentimeterPerAngstrom", 10000000.toDouble(), SpectralIrradiance),
        MetaUnitOfMeasure("WattsPerMeter", 1.toDouble(), SpectralFlux),
        MetaUnitOfMeasure("Celsius", 274.15.toDouble(), Temperature),
        MetaUnitOfMeasure("Fahrenheit", 255.9277778.toDouble(), Temperature),
        MetaUnitOfMeasure("Kelvin", 1.toDouble(), Temperature),
        MetaUnitOfMeasure("Rankine", 5.56E-01.toDouble(), Temperature),
        MetaUnitOfMeasure("JoulesPerKelvin", 1.00E+00.toDouble(), HeatCapacity),
        MetaUnitOfMeasure("Days", 8.64E+04.toDouble(), Time),
        MetaUnitOfMeasure("Hours", 3.60E+03.toDouble(), Time),
        MetaUnitOfMeasure("Minutes", 6.00E+01.toDouble(), Time),
        MetaUnitOfMeasure("Milliseconds", 1.00E-03.toDouble(), Time),
        MetaUnitOfMeasure("Nanoseconds", 1.00E-09.toDouble(), Time),
        MetaUnitOfMeasure("Seconds", 1.00E+00.toDouble(), Time),
        MetaUnitOfMeasure("Microseconds", 1.00E-06.toDouble(), Time),
        MetaUnitOfMeasure("NewtonMeters", 1.00E+00.toDouble(), Torque),
        MetaUnitOfMeasure("PoundFeet", 1.36E+00.toDouble(), Torque),
        MetaUnitOfMeasure("FeetPerSecond", 0.3048006096.toDouble(), Velocity),
        MetaUnitOfMeasure("InternationalMilesPerHour", 0.44704.toDouble(), Velocity),
        MetaUnitOfMeasure("KilometersPerHour", 2.78E-01.toDouble(), Velocity),
        MetaUnitOfMeasure("KilometersPerSecond", 1000.toDouble(), Velocity),
        MetaUnitOfMeasure("Knots", 5.14E-01.toDouble(), Velocity),
        MetaUnitOfMeasure("MetersPerSecond", 1.00E+00.toDouble(), Velocity),
        MetaUnitOfMeasure("UsMilesPerHour", 0.4470408941.toDouble(), Velocity),
        MetaUnitOfMeasure("Litres", 1.00E-03.toDouble(), Volume),
        MetaUnitOfMeasure("AcreFeet", 1.23E+03.toDouble(), Volume),
        MetaUnitOfMeasure("UsCups", 2.37E-04.toDouble(), Volume),
        MetaUnitOfMeasure("Centilitres", 1.00E-05.toDouble(), Volume),
        MetaUnitOfMeasure("Decilitres", 1.00E-04.toDouble(), Volume),
        MetaUnitOfMeasure("CubicFeet", 2.83E-02.toDouble(), Volume),
        MetaUnitOfMeasure("UsGallons", 3.79E-03.toDouble(), Volume),
        MetaUnitOfMeasure("Hectolitres", 1.00E-01.toDouble(), Volume),
        MetaUnitOfMeasure("CubicInches", 1.64E-05.toDouble(), Volume),
        MetaUnitOfMeasure("CubicUsMiles", 4.17E+09.toDouble(), Volume),
        MetaUnitOfMeasure("Millilitres", 1.00E-06.toDouble(), Volume),
        MetaUnitOfMeasure("CubicMeters", 1.toDouble(), Volume),
        MetaUnitOfMeasure("Nanolitres", 1.00E-12.toDouble(), Volume),
        MetaUnitOfMeasure("FluidOunces", 2.96E-05.toDouble(), Volume),
        MetaUnitOfMeasure("UsPints", 4.73E-04.toDouble(), Volume),
        MetaUnitOfMeasure("UsQuarts", 9.46E-04.toDouble(), Volume),
        MetaUnitOfMeasure("Tablespoons", 1.48E-05.toDouble(), Volume),
        MetaUnitOfMeasure("Teaspoons", 4.93E-06.toDouble(), Volume),
        MetaUnitOfMeasure("CubicYards", 7.65E-01.toDouble(), Volume),
        MetaUnitOfMeasure("Microlitres", 1.00E-09.toDouble(), Volume)
//        MetaUnitOfMeasure("GallonsPerDay", 4.38E-08.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("GallonsPerHour", 1.05E-06.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("GallonsPerMinute", 6.31E-05.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("GallonsPerSecond", 0.003785411784.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("CubicFeetPerHour", 7.87E-06.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("CubicMetersPerSecond", 1.toDouble(), VolumeFlow),
//        MetaUnitOfMeasure("NewtonsPerSecond", 1.00E+00.toDouble(), Yank)
)