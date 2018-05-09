package info.kunalsheth.units

import info.kunalsheth.units.data.Dimension
import info.kunalsheth.units.data.Quantity
import info.kunalsheth.units.data.UnitOfMeasure

val Length = Dimension(L = 1)
val Mass = Dimension(M = 1)
val Time = Dimension(T = 1)
val ElectricCurrent = Dimension(I = 1)
val Temperature = Dimension(Theta = 1)
val AmountOfSubstance = Dimension(N = 1)
val LuminousIntensity = Dimension(J = 1)
val Absement = Dimension(L = 1, T = 1)
val AbsorbedDoseRate = Dimension(L = 2, T = -3)
val Acceleration = Dimension(L = 1, T = -2)
val AngularAcceleration = Dimension(T = -2)
val AngularMomentum = Dimension(M = 1, L = 2, T = -1)
val AngularVelocity = Dimension(T = -1)
val Area = Dimension(L = 2)
val AreaDensity = Dimension(M = 1, L = -2)
val Capacitance = Dimension(M = -1, L = -2, T = 4, I = 2)
val CatalyticActivity = Dimension(T = -1, N = 1)
val CatalyticActivityConcentration = Dimension(L = -3, T = -1, N = 1)
val ChemicalPotential = Dimension(M = 1, L = 2, T = -2, N = -1)
val Crackle = Dimension(L = 1, T = -5)
val CurrentDensity = Dimension(L = -2, I = 1)
val DoseEquivalent = Dimension(L = 2, T = -2)
val DynamicViscosity = Dimension(M = 1, L = -1, T = -1)
val ElectricCharge = Dimension(T = 1, I = 1)
val ElectricChargeDensity = Dimension(L = -3, T = 1, I = 1)
val ElectricDisplacement = Dimension(L = -2, T = 1, I = 1)
val ElectricFieldStrength = Dimension(M = 1, L = 1, T = -3, I = -1)
val ElectricalConductance = Dimension(M = -1, L = -2, T = 3, I = 2)
val ElectricalConductivity = Dimension(M = -1, L = -3, T = 3, I = 2)
val ElectricPotential = Dimension(M = 1, L = 2, T = -3, I = -1)
val ElectricalResistance = Dimension(M = 1, L = 2, T = -3, I = -2)
val ElectricalResistivity = Dimension(M = 1, L = 3, T = -3, I = -2)
val Energy = Dimension(M = 1, L = 2, T = -2)
val EnergyDensity = Dimension(M = 1, L = -1, T = -2)
val Entropy = Dimension(M = 1, L = 2, T = -2, Theta = -1)
val Force = Dimension(M = 1, L = 1, T = -2)
val Frequency = Dimension(T = -1)
val FuelEfficiency = Dimension(L = -2)
val HalfLife = Dimension(T = 1)
val Heat = Dimension(M = 1, L = 2, T = -2)
val HeatCapacity = Dimension(M = 1, L = 2, T = -2, Theta = -1)
val HeatFluxDensity = Dimension(M = 1, T = -3)
val Illuminance = Dimension(L = -2, J = 1)
val Impedance = Dimension(M = 1, L = 2, T = -3, I = -2)
val Impulse = Dimension(M = 1, L = 1, T = -1)
val Inductance = Dimension(M = 1, L = 2, T = -2, I = -2)
val Irradiance = Dimension(M = 1, T = -3)
val Intensity = Dimension(M = 1, T = -3)
val Jerk = Dimension(L = 1, T = -3)
val Snap = Dimension(L = 1, T = -4)
val LinearDensity = Dimension(M = 1, L = -1)
val LuminousFlux = Dimension(J = 1)
val Mach = Dimension(1)
val MagneticFieldStrength = Dimension(L = -1, I = 1)
val MagneticFlux = Dimension(M = 1, L = 2, T = -2, I = -1)
val MagneticFluxDensity = Dimension(M = 1, T = -2, I = -1)
val Magnetization = Dimension(L = -1, I = 1)
val MassFraction = Dimension(1)
val Density = Dimension(M = 1, L = -3)
val MeanLifetime = Dimension(T = 1)
val MolarConcentration = Dimension(L = -3, N = 1)
val MolarEnergy = Dimension(M = 1, L = 2, T = -2, N = -1)
val MolarEntropy = Dimension(M = 1, L = 2, T = -2, Theta = -1, N = -1)
val MolarHeatCapacity = Dimension(M = 1, L = 2, T = -2, N = -1)
val MomentOfInertia = Dimension(M = 1, L = 2)
val Momentum = Dimension(M = 1, L = 1, T = -1)
val Permeability = Dimension(M = 1, L = 1, T = -2, I = -2)
val Permittivity = Dimension(M = -1, L = -3, T = 4, I = 2)
val PlaneAngle = Dimension(1)
val Power = Dimension(M = 1, L = 2, T = -3)
val Pressure = Dimension(M = 1, L = -1, T = -2)
val Pop = Dimension(L = 1, T = -6)
val RadioactiveActivity = Dimension(T = -1)
val RadioactiveDose = Dimension(L = 2, T = -2)
val Radiance = Dimension(M = 1, T = -3)
val RadiantIntensity = Dimension(M = 1, L = 2, T = -3)
val ReactionRate = Dimension(N = 1, L = -3, T = -1)
val RefractiveIndex = Dimension(1)
val SolidAngle = Dimension(1)
val Speed = Dimension(L = 1, T = -1)
val SpecificEnergy = Dimension(L = 2, T = -2)
val SpecificHeatCapacity = Dimension(L = 2, T = -2, Theta = -1)
val SpecificVolume = Dimension(M = -1, L = 3)
val Spin = Dimension(M = 1, L = 2, T = -1)
val Strain = Dimension(1)
val Stress = Dimension(M = 1, L = -1, T = -2)
val SurfaceTension = Dimension(M = 1, T = -2)
val ThermalConductivity = Dimension(M = 1, L = 1, T = -3, Theta = -1)
val Torque = Dimension(M = 1, L = 2, T = -2)
val Velocity = Dimension(L = 1, T = -1)
val Volume = Dimension(L = 3)
val Wavelength = Dimension(L = 1)
val Wavenumber = Dimension(L = -1)
val Wavevector = Dimension(L = -1)
val Weight = Dimension(M = 1, L = 1, T = -2)
val Work = Dimension(M = 1, L = 2, T = -2)
val YoungsModulus = Dimension(M = 1, L = -1, T = -2)
val LuminousEnergy = Dimension(T = 1, J = 1)
val Luminance = Dimension(L = -2, J = 1)
val LuminousEmittance = Dimension(L = -2, J = 1)
val LuminousExposure = Dimension(L = -2, T = 1, J = 1)
val LuminousEnergyDensity = Dimension(L = -3, T = 1, J = 1)
val LuminousEfficacy = Dimension(M = -1, L = -2, T = 3, J = 1)
val RadiantEnergy = Dimension(M = 1, L = 2, T = -2)
val RadiantEnergyDensity = Dimension(M = 1, L = -1, T = -2)
val RadiantFlux = Dimension(M = 1, L = 2, T = -3)
val SpectralFlux = Dimension(M = 1, L = 1, T = -3)
val SpectralIntensity = Dimension(M = 1, L = 1, T = -3)
val SpectralIrradiance = Dimension(M = 1, L = -1, T = -3)
val Radiosity = Dimension(M = 1, T = -3)
val RadiantExitance = Dimension(M = 1, T = -3)
val RadiantExposure = Dimension(M = 1, T = -2)

val commonQuantities = setOf(
        Quantity("Length", Length),
        Quantity("Mass", Mass),
        Quantity("Time", Time),
        Quantity("ElectricCurrent", ElectricCurrent),
        Quantity("Temperature", Temperature),
        Quantity("AmountOfSubstance", AmountOfSubstance),
        Quantity("LuminousIntensity", LuminousIntensity),
        Quantity("Absement", Absement),
        Quantity("AbsorbedDoseRate", AbsorbedDoseRate),
        Quantity("Acceleration", Acceleration),
        Quantity("AngularAcceleration", AngularAcceleration),
        Quantity("AngularMomentum", AngularMomentum),
        Quantity("AngularVelocity", AngularVelocity),
        Quantity("Area", Area),
        Quantity("AreaDensity", AreaDensity),
        Quantity("Capacitance", Capacitance),
        Quantity("CatalyticActivity", CatalyticActivity),
        Quantity("CatalyticActivityConcentration", CatalyticActivityConcentration),
        Quantity("ChemicalPotential", ChemicalPotential),
        Quantity("Crackle", Crackle),
        Quantity("CurrentDensity", CurrentDensity),
        Quantity("DoseEquivalent", DoseEquivalent),
        Quantity("DynamicViscosity", DynamicViscosity),
        Quantity("ElectricCharge", ElectricCharge),
        Quantity("ElectricChargeDensity", ElectricChargeDensity),
        Quantity("ElectricDisplacement", ElectricDisplacement),
        Quantity("ElectricFieldStrength", ElectricFieldStrength),
        Quantity("ElectricalConductance", ElectricalConductance),
        Quantity("ElectricalConductivity", ElectricalConductivity),
        Quantity("ElectricPotential", ElectricPotential),
        Quantity("ElectricalResistance", ElectricalResistance),
        Quantity("ElectricalResistivity", ElectricalResistivity),
        Quantity("Energy", Energy),
        Quantity("EnergyDensity", EnergyDensity),
        Quantity("Entropy", Entropy),
        Quantity("Force", Force),
        Quantity("Frequency", Frequency),
        Quantity("FuelEfficiency", FuelEfficiency),
        Quantity("HalfLife", HalfLife),
        Quantity("Heat", Heat),
        Quantity("HeatCapacity", HeatCapacity),
        Quantity("HeatFluxDensity", HeatFluxDensity),
        Quantity("Illuminance", Illuminance),
        Quantity("Impedance", Impedance),
        Quantity("Impulse", Impulse),
        Quantity("Inductance", Inductance),
        Quantity("Irradiance", Irradiance),
        Quantity("Intensity", Intensity),
        Quantity("Jerk", Jerk),
        Quantity("Snap", Snap),
        Quantity("LinearDensity", LinearDensity),
        Quantity("LuminousFlux", LuminousFlux),
        Quantity("Mach", Mach),
        Quantity("MagneticFieldStrength", MagneticFieldStrength),
        Quantity("MagneticFlux", MagneticFlux),
        Quantity("MagneticFluxDensity", MagneticFluxDensity),
        Quantity("Magnetization", Magnetization),
        Quantity("MassFraction", MassFraction),
        Quantity("Density", Density),
        Quantity("MeanLifetime", MeanLifetime),
        Quantity("MolarConcentration", MolarConcentration),
        Quantity("MolarEnergy", MolarEnergy),
        Quantity("MolarEntropy", MolarEntropy),
        Quantity("MolarHeatCapacity", MolarHeatCapacity),
        Quantity("MomentOfInertia", MomentOfInertia),
        Quantity("Momentum", Momentum),
        Quantity("Permeability", Permeability),
        Quantity("Permittivity", Permittivity),
        Quantity("PlaneAngle", PlaneAngle),
        Quantity("Power", Power),
        Quantity("Pressure", Pressure),
        Quantity("Pop", Pop),
        Quantity("RadioactiveActivity", RadioactiveActivity),
        Quantity("RadioactiveDose", RadioactiveDose),
        Quantity("Radiance", Radiance),
        Quantity("RadiantIntensity", RadiantIntensity),
        Quantity("ReactionRate", ReactionRate),
        Quantity("RefractiveIndex", RefractiveIndex),
        Quantity("SolidAngle", SolidAngle),
        Quantity("Speed", Speed),
        Quantity("SpecificEnergy", SpecificEnergy),
        Quantity("SpecificHeatCapacity", SpecificHeatCapacity),
        Quantity("SpecificVolume", SpecificVolume),
        Quantity("Spin", Spin),
        Quantity("Strain", Strain),
        Quantity("Stress", Stress),
        Quantity("SurfaceTension", SurfaceTension),
        Quantity("ThermalConductivity", ThermalConductivity),
        Quantity("Torque", Torque),
        Quantity("Velocity", Velocity),
        Quantity("Volume", Volume),
        Quantity("Wavelength", Wavelength),
        Quantity("Wavenumber", Wavenumber),
        Quantity("Wavevector", Wavevector),
        Quantity("Weight", Weight),
        Quantity("Work", Work),
        Quantity("YoungsModulus", YoungsModulus),
        Quantity("LuminousEnergy", LuminousEnergy),
        Quantity("Luminance", Luminance),
        Quantity("LuminousEmittance", LuminousEmittance),
        Quantity("LuminousExposure", LuminousExposure),
        Quantity("LuminousEnergyDensity", LuminousEnergyDensity),
        Quantity("LuminousEfficacy", LuminousEfficacy),
        Quantity("RadiantEnergy", RadiantEnergy),
        Quantity("RadiantEnergyDensity", RadiantEnergyDensity),
        Quantity("RadiantFlux", RadiantFlux),
        Quantity("SpectralFlux", SpectralFlux),
        Quantity("SpectralIntensity", SpectralIntensity),
        Quantity("SpectralIrradiance", SpectralIrradiance),
        Quantity("Radiosity", Radiosity),
        Quantity("RadiantExitance", RadiantExitance),
        Quantity("RadiantExposure", RadiantExposure)
)

val commonUnits = setOf(
        UnitOfMeasure("FeetPerSecondSquared", 0.3048006096.toDouble(), Acceleration),
        UnitOfMeasure("EarthGravities", 9.81E+00.toDouble(), Acceleration),
        UnitOfMeasure("MetersPerSecondSquared", 1.00E+00.toDouble(), Acceleration),
        UnitOfMeasure("UsMilesPerHourSquared", 1.24E-04.toDouble(), Acceleration),
        UnitOfMeasure("Arcminutes", 2.91E-04.toDouble(), PlaneAngle),
        UnitOfMeasure("Arcseconds", 4.85E-06.toDouble(), PlaneAngle),
        UnitOfMeasure("Gradians", 0.01570796327.toDouble(), PlaneAngle),
        UnitOfMeasure("Radians", 1.00E+00.toDouble(), PlaneAngle),
        UnitOfMeasure("Turns", 6.28E+00.toDouble(), PlaneAngle),
        UnitOfMeasure("Degrees", 1.75E-02.toDouble(), PlaneAngle),
        UnitOfMeasure("ArcminutesPerSecondSquared", 2.91E-04.toDouble(), AngularAcceleration),
        UnitOfMeasure("ArcsecondsPerSecondSquared", 4.85E-06.toDouble(), AngularAcceleration),
        UnitOfMeasure("GradiansPerSecondSquared", 0.01570796327.toDouble(), AngularAcceleration),
        UnitOfMeasure("RadiansPerSecondSquared", 1.00E+00.toDouble(), AngularAcceleration),
        UnitOfMeasure("TurnsPerSecondSquared", 6.28E+00.toDouble(), AngularAcceleration),
        UnitOfMeasure("DegreesPerSecondSquared", 1.75E-02.toDouble(), AngularAcceleration),
        UnitOfMeasure("GradiansPerSecond", 1.57E-02.toDouble(), AngularVelocity),
        UnitOfMeasure("RadiansPerSecond", 1.00E+00.toDouble(), AngularVelocity),
        UnitOfMeasure("TurnsPerSecond", 6.283185307.toDouble(), AngularVelocity),
        UnitOfMeasure("DegreesPerSecond", 1.75E-02.toDouble(), AngularVelocity),
        UnitOfMeasure("Acres", 4.05E+03.toDouble(), Area),
        UnitOfMeasure("Barnes", 1.00E-28.toDouble(), Area),
        UnitOfMeasure("SquareCentimeters", 1.00E-04.toDouble(), Area),
        UnitOfMeasure("SquareFeet", 9.29E-02.toDouble(), Area),
        UnitOfMeasure("Hectares", 10000.toDouble(), Area),
        UnitOfMeasure("SquareInches", 6.45E-04.toDouble(), Area),
        UnitOfMeasure("SquareKilometers", 1.00E+06.toDouble(), Area),
        UnitOfMeasure("SquareUsMiles", 2589988.11.toDouble(), Area),
        UnitOfMeasure("SquareMeters", 1.toDouble(), Area),
        UnitOfMeasure("SquareYards", 0.83612736.toDouble(), Area),
        UnitOfMeasure("GramsPerSquareCentimeter", 10.toDouble(), AreaDensity),
        UnitOfMeasure("KilogramsPerHectare", 1.00E-04.toDouble(), AreaDensity),
        UnitOfMeasure("KilogramsPerSquareMeter", 1.00E+00.toDouble(), AreaDensity),
        UnitOfMeasure("Farads", 1.00E+00.toDouble(), Capacitance),
        UnitOfMeasure("Kilofarads", 1000.toDouble(), Capacitance),
        UnitOfMeasure("Millifarads", 1.00E-03.toDouble(), Capacitance),
        UnitOfMeasure("Nanofarads", 1.00E-09.toDouble(), Capacitance),
        UnitOfMeasure("Picofarads", 1.00E-12.toDouble(), Capacitance),
        UnitOfMeasure("Microfarads", 1.00E-06.toDouble(), Capacitance),
        UnitOfMeasure("PoundMoles", 4.54E+02.toDouble(), AmountOfSubstance),
        UnitOfMeasure("Moles", 1.toDouble(), AmountOfSubstance),
        UnitOfMeasure("SiemensPerMeter", 1.00E+00.toDouble(), ElectricalConductivity),
//        UnitOfMeasure("BytesPerSecond", 1.00E+00.toDouble(), DataRate),
//        UnitOfMeasure("ExabytesPerSecond", 1.00E+18.toDouble(), DataRate),
//        UnitOfMeasure("ExbibytesPerSecond", 1.15E+18.toDouble(), DataRate),
//        UnitOfMeasure("GigabytesPerSecond", 1.00E+09.toDouble(), DataRate),
//        UnitOfMeasure("GibibytesPerSecond", 1.07E+09.toDouble(), DataRate),
//        UnitOfMeasure("KilobytesPerSecond", 1000.toDouble(), DataRate),
//        UnitOfMeasure("KibibytesPerSecond", 1.02E+03.toDouble(), DataRate),
//        UnitOfMeasure("MegabytesPerSecond", 1.00E+06.toDouble(), DataRate),
//        UnitOfMeasure("MebibytesPerSecond", 1.05E+06.toDouble(), DataRate),
//        UnitOfMeasure("PetabytesPerSecond", 1.00E+15.toDouble(), DataRate),
//        UnitOfMeasure("PebibytesPerSecond", 1.13E+15.toDouble(), DataRate),
//        UnitOfMeasure("TerabytesPerSecond", 1.00E+12.toDouble(), DataRate),
//        UnitOfMeasure("TebibytesPerSecond", 1.10E+12.toDouble(), DataRate),
//        UnitOfMeasure("YottabytesPerSecond", 1.00E+24.toDouble(), DataRate),
//        UnitOfMeasure("YobibytesPerSecond", 1.21E+24.toDouble(), DataRate),
//        UnitOfMeasure("ZettabytesPerSecond", 1.00E+21.toDouble(), DataRate),
//        UnitOfMeasure("ZebibytesPerSecond", 1.18E+21.toDouble(), DataRate),
        UnitOfMeasure("KilogramsPerCubicMeter", 1.00E+00.toDouble(), Density),
        UnitOfMeasure("Percent", 1.00E-02.toDouble(), Dimension()),
        UnitOfMeasure("Dozen", 1.20E+01.toDouble(), Dimension()),
        UnitOfMeasure("Each", 1.toDouble(), Dimension()),
        UnitOfMeasure("Gross", 1.44E+02.toDouble(), Dimension()),
        UnitOfMeasure("Score", 2.00E+01.toDouble(), Dimension()),
        UnitOfMeasure("AmpereHours", 3.60E+03.toDouble(), ElectricCharge),
        UnitOfMeasure("Coulombs", 1.00E+00.toDouble(), ElectricCharge),
        UnitOfMeasure("Abcoulombs", 1.00E+01.toDouble(), ElectricCharge),
        UnitOfMeasure("MilliampereHours", 3.6.toDouble(), ElectricCharge),
        UnitOfMeasure("MilliampereSeconds", 1.00E-03.toDouble(), ElectricCharge),
        UnitOfMeasure("Millicoulombs", 0.001.toDouble(), ElectricCharge),
        UnitOfMeasure("Nanocoulombs", 1.00E-09.toDouble(), ElectricCharge),
        UnitOfMeasure("Picocoulombs", 1.00E-12.toDouble(), ElectricCharge),
        UnitOfMeasure("Microcoulombs", 1.00E-06.toDouble(), ElectricCharge),
        UnitOfMeasure("Amperes", 1.00E+00.toDouble(), ElectricCurrent),
        UnitOfMeasure("Milliamperes", 1.00E-03.toDouble(), ElectricCurrent),
        UnitOfMeasure("Megavolts", 1000000.toDouble(), ElectricPotential),
        UnitOfMeasure("Volts", 1.00E+00.toDouble(), ElectricPotential),
        UnitOfMeasure("Kilovolts", 1.00E+03.toDouble(), ElectricPotential),
        UnitOfMeasure("Millivolts", 1.00E-03.toDouble(), ElectricPotential),
        UnitOfMeasure("Microvolts", 1.00E-06.toDouble(), ElectricPotential),
        UnitOfMeasure("Siemens", 1.00E+00.toDouble(), ElectricalConductance),
        UnitOfMeasure("Gigohms", 1.00E+09.toDouble(), ElectricalResistance),
        UnitOfMeasure("Megohms", 1.00E+06.toDouble(), ElectricalResistance),
        UnitOfMeasure("Kilohms", 1.00E+03.toDouble(), ElectricalResistance),
        UnitOfMeasure("Milliohms", 1.00E-03.toDouble(), ElectricalResistance),
        UnitOfMeasure("Nanohms", 1.00E-09.toDouble(), ElectricalResistance),
        UnitOfMeasure("Microohms", 1.00E-06.toDouble(), ElectricalResistance),
        UnitOfMeasure("Ohms", 1.00E+00.toDouble(), ElectricalResistance),
        UnitOfMeasure("BritishThermalUnits", 1.06E+03.toDouble(), Energy),
        UnitOfMeasure("Gigajoules", 1.00E+09.toDouble(), Energy),
        UnitOfMeasure("GigawattHours", 3.60E+12.toDouble(), Energy),
        UnitOfMeasure("Joules", 1.00E+00.toDouble(), Energy),
        UnitOfMeasure("MBtus", 1.06E+06.toDouble(), Energy),
        UnitOfMeasure("Megajoules", 1.00E+06.toDouble(), Energy),
        UnitOfMeasure("MMBtus", 1.06E+09.toDouble(), Energy),
        UnitOfMeasure("MegawattHours", 3.60E+09.toDouble(), Energy),
        UnitOfMeasure("Terajoules", 1.00E+12.toDouble(), Energy),
        UnitOfMeasure("WattHours", 3.60E+03.toDouble(), Energy),
        UnitOfMeasure("Ergs", 1.00E-07.toDouble(), Energy),
        UnitOfMeasure("Kilojoules", 1.00E+03.toDouble(), Energy),
        UnitOfMeasure("KilowattHours", 3.60E+06.toDouble(), Energy),
        UnitOfMeasure("Millijoules", 1.00E-03.toDouble(), Energy),
        UnitOfMeasure("Nanojoules", 1.00E-09.toDouble(), Energy),
        UnitOfMeasure("Picojoules", 1.00E-12.toDouble(), Energy),
        UnitOfMeasure("Microjoules", 1.00E-06.toDouble(), Energy),
        UnitOfMeasure("JoulesPerCubicMeter", 1.00E+00.toDouble(), EnergyDensity),
        UnitOfMeasure("Newtons", 1.00E+00.toDouble(), Force),
        UnitOfMeasure("KilogramForce", 9.81E+00.toDouble(), Force),
        UnitOfMeasure("PoundForce", 4.45E+00.toDouble(), Force),
        UnitOfMeasure("Gigahertz", 1.00E+09.toDouble(), Frequency),
        UnitOfMeasure("Hertz", 1.00E+00.toDouble(), Frequency),
        UnitOfMeasure("Megahertz", 1.00E+06.toDouble(), Frequency),
        UnitOfMeasure("Terahertz", 1.00E+12.toDouble(), Frequency),
        UnitOfMeasure("Kilohertz", 1.00E+03.toDouble(), Frequency),
        UnitOfMeasure("RevolutionsPerMinute", 1.67E-02.toDouble(), Frequency),
        UnitOfMeasure("Lux", 1.00E+00.toDouble(), Illuminance),
        UnitOfMeasure("Henry", 1.00E+00.toDouble(), Inductance),
//        UnitOfMeasure("Bytes", 1.00E+00.toDouble(), Information),
//        UnitOfMeasure("Exabytes", 1.00E+18.toDouble(), Information),
//        UnitOfMeasure("Exbibytes", 1.15E+18.toDouble(), Information),
//        UnitOfMeasure("Gigabytes", 1.00E+09.toDouble(), Information),
//        UnitOfMeasure("Gibibytes", 1.07E+09.toDouble(), Information),
//        UnitOfMeasure("Kilobytes", 1000.toDouble(), Information),
//        UnitOfMeasure("Kibibytes", 1024.toDouble(), Information),
//        UnitOfMeasure("Megabytes", 1000000.toDouble(), Information),
//        UnitOfMeasure("Mebibytes", 1048576.toDouble(), Information),
//        UnitOfMeasure("Petabytes", 1.00E+15.toDouble(), Information),
//        UnitOfMeasure("Pebibytes", 1.13E+15.toDouble(), Information),
//        UnitOfMeasure("Terabytes", 1.00E+12.toDouble(), Information),
//        UnitOfMeasure("Tebibytes", 1.10E+12.toDouble(), Information),
//        UnitOfMeasure("Yottabytes", 1.00E+24.toDouble(), Information),
//        UnitOfMeasure("Yobibytes", 1.21E+24.toDouble(), Information),
//        UnitOfMeasure("Zettabytes", 1.00E+21.toDouble(), Information),
//        UnitOfMeasure("Zebibytes", 1.18E+21.toDouble(), Information),
        UnitOfMeasure("WattsPerSquareMeter", 1.00E+00.toDouble(), Irradiance),
        UnitOfMeasure("ErgsPerSecondPerSquareCentimeter", 1.00E-03.toDouble(), Irradiance),
        UnitOfMeasure("FeetPerSecondCubed", 0.3048006096.toDouble(), Jerk),
        UnitOfMeasure("MetersPerSecondCubed", 1.00E+00.toDouble(), Jerk),
        UnitOfMeasure("NominalSolarRadii", 6.96E+08.toDouble(), Length),
        UnitOfMeasure("SolarRadii", 6.96E+08.toDouble(), Length),
        UnitOfMeasure("AstronomicalUnits", 1.50E+11.toDouble(), Length),
        UnitOfMeasure("Centimeters", 0.01.toDouble(), Length),
        UnitOfMeasure("Decameters", 10.toDouble(), Length),
        UnitOfMeasure("Decimeters", 0.1.toDouble(), Length),
        UnitOfMeasure("Feet", 0.3048006096.toDouble(), Length),
        UnitOfMeasure("Hectometers", 100.toDouble(), Length),
        UnitOfMeasure("Inches", 0.0254000508.toDouble(), Length),
        UnitOfMeasure("Kilometers", 1000.toDouble(), Length),
        UnitOfMeasure("LightYears", 9.46E+15.toDouble(), Length),
        UnitOfMeasure("Meters", 1.toDouble(), Length),
        UnitOfMeasure("UsMiles", 1609.347219.toDouble(), Length),
        UnitOfMeasure("InternationalMiles", 1.61E+03.toDouble(), Length),
        UnitOfMeasure("Millimeters", 0.001.toDouble(), Length),
        UnitOfMeasure("Nanometers", 1.00E-09.toDouble(), Length),
        UnitOfMeasure("NauticalMiles", 1852.toDouble(), Length),
        UnitOfMeasure("Parsecs", 3.09E+16.toDouble(), Length),
        UnitOfMeasure("Yards", 0.9144018288.toDouble(), Length),
        UnitOfMeasure("Microns", 1.00E-06.toDouble(), Length),
        UnitOfMeasure("Angstroms", 1.00E-10.toDouble(), Length),
        UnitOfMeasure("CandelasPerSquareMeter", 1.00E+00.toDouble(), Luminance),
        UnitOfMeasure("LumenSeconds", 1.00E+00.toDouble(), LuminousEnergy),
        UnitOfMeasure("LuxSeconds", 1.toDouble(), LuminousExposure),
        UnitOfMeasure("Lumens", 1.toDouble(), LuminousFlux),
        UnitOfMeasure("Candelas", 1.toDouble(), LuminousIntensity),
        UnitOfMeasure("Webers", 1.00E+00.toDouble(), MagneticFlux),
        UnitOfMeasure("Gauss", 1.00E-04.toDouble(), MagneticFluxDensity),
        UnitOfMeasure("Teslas", 1.00E+00.toDouble(), MagneticFluxDensity),
        UnitOfMeasure("Megapounds", 453.59237.toDouble(), Mass),
        UnitOfMeasure("SolarMasses", 1.99E+30.toDouble(), Mass),
        UnitOfMeasure("Carats", 2.00E-04.toDouble(), Mass),
        UnitOfMeasure("Pennyweights", 0.00155517384.toDouble(), Mass),
        UnitOfMeasure("Grams", 0.001.toDouble(), Mass),
        UnitOfMeasure("TroyGrains", 6.48E-05.toDouble(), Mass),
        UnitOfMeasure("Kilograms", 1.toDouble(), Mass),
        UnitOfMeasure("Kilopounds", 453.59237.toDouble(), Mass),
        UnitOfMeasure("Pounds", 0.45359237.toDouble(), Mass),
        UnitOfMeasure("TroyPounds", 3.73E-01.toDouble(), Mass),
        UnitOfMeasure("Micrograms", 1.00E-09.toDouble(), Mass),
        UnitOfMeasure("Milligrams", 1.00E-06.toDouble(), Mass),
        UnitOfMeasure("Ounces", 2.83E-02.toDouble(), Mass),
        UnitOfMeasure("TroyOunces", 3.11E-02.toDouble(), Mass),
        UnitOfMeasure("Stone", 6.35029318.toDouble(), Mass),
        UnitOfMeasure("Tonnes", 1000.toDouble(), Mass),
        UnitOfMeasure("Tolas", 1.17E-02.toDouble(), Mass),
//        UnitOfMeasure("MegapoundsPerHour", 1.26E+02.toDouble(), MassFlow),
//        UnitOfMeasure("KilogramsPerSecond", 1.toDouble(), MassFlow),
//        UnitOfMeasure("KilopoundsPerHour", 0.1259978806.toDouble(), MassFlow),
//        UnitOfMeasure("PoundsPerHour", 1.26E-04.toDouble(), MassFlow),
//        UnitOfMeasure("PoundsPerSecond", 4.54E-01.toDouble(), MassFlow),
        UnitOfMeasure("KilogramsMetersSquared", 1.00E+00.toDouble(), MomentOfInertia),
        UnitOfMeasure("PoundsSquareFeet", 4.21E+01.toDouble(), MomentOfInertia),
        UnitOfMeasure("NewtonSeconds", 1.toDouble(), Momentum),
        UnitOfMeasure("BtusPerHour", 0.2930710702.toDouble(), Power),
        UnitOfMeasure("Gigawatts", 1.00E+09.toDouble(), Power),
        UnitOfMeasure("SolarLuminosities", 3.83E+26.toDouble(), Power),
        UnitOfMeasure("Megawatts", 1.00E+06.toDouble(), Power),
        UnitOfMeasure("Watts", 1.00E+00.toDouble(), Power),
        UnitOfMeasure("ErgsPerSecond", 1.00E-07.toDouble(), Power),
        UnitOfMeasure("Kilowatts", 1000.toDouble(), Power),
        UnitOfMeasure("Milliwatts", 1.00E-03.toDouble(), Power),
//        UnitOfMeasure("GigawattsPerHour", 1.00E+09.toDouble(), PowerRamp),
//        UnitOfMeasure("MegawattsPerHour", 1000000.toDouble(), PowerRamp),
//        UnitOfMeasure("WattsPerHour", 1.00E+00.toDouble(), PowerRamp),
//        UnitOfMeasure("WattsPerMinute", 1.67E-02.toDouble(), PowerRamp),
//        UnitOfMeasure("KilowattsPerHour", 1000.toDouble(), PowerRamp),
//        UnitOfMeasure("KilowattsPerMinute", 16.66666667.toDouble(), PowerRamp),
        UnitOfMeasure("Pascals", 1.toDouble(), Pressure),
        UnitOfMeasure("Torrs", 1.33E+02.toDouble(), Pressure),
        UnitOfMeasure("StandardAtmospheres", 1.01E+05.toDouble(), Pressure),
        UnitOfMeasure("Bars", 100000.toDouble(), Pressure),
        UnitOfMeasure("MillimetersOfMercury", 1.33E+02.toDouble(), Pressure),
        UnitOfMeasure("PoundsPerSquareInch", 6.89E+03.toDouble(), Pressure),
//        UnitOfMeasure("PascalsPerSecond", 1.toDouble(), PressureChange),
//        UnitOfMeasure("StandardAtmospheresPerSecond", 1.01E+05.toDouble(), PressureChange),
//        UnitOfMeasure("BarsPerSecond", 1.00E+05.toDouble(), PressureChange),
//        UnitOfMeasure("PoundsPerSquareInchPerSecond", 6894.757293.toDouble(), PressureChange),
        UnitOfMeasure("WattsPerSteradianPerSquareMeter", 1.00E+00.toDouble(), Radiance),
        UnitOfMeasure("WattsPerSteradian", 1.00E+00.toDouble(), RadiantIntensity),
        UnitOfMeasure("OhmMeters", 1.00E+00.toDouble(), ElectricalResistivity),
        UnitOfMeasure("SquaredRadians", 1.00E+00.toDouble(), SolidAngle),
        UnitOfMeasure("Grays", 1.00E+00.toDouble(), SpecificEnergy),
        UnitOfMeasure("WattsPerSteradianPerMeter", 1.00E+00.toDouble(), SpectralIntensity),
        UnitOfMeasure("WattsPerSquareMeterPerNanometer", 1.00E+09.toDouble(), SpectralIrradiance),
        UnitOfMeasure("WattsPerSquareMeterPerMicron", 1000000.toDouble(), SpectralIrradiance),
        UnitOfMeasure("WattsPerCubicMeter", 1.00E+00.toDouble(), SpectralIrradiance),
        UnitOfMeasure("ErgsPerSecondPerSquareCentimeterPerAngstrom", 10000000.toDouble(), SpectralIrradiance),
        UnitOfMeasure("WattsPerMeter", 1.toDouble(), SpectralFlux),
        UnitOfMeasure("Celsius", 274.15.toDouble(), Temperature),
        UnitOfMeasure("Fahrenheit", 255.9277778.toDouble(), Temperature),
        UnitOfMeasure("Kelvin", 1.toDouble(), Temperature),
        UnitOfMeasure("Rankine", 5.56E-01.toDouble(), Temperature),
        UnitOfMeasure("JoulesPerKelvin", 1.00E+00.toDouble(), HeatCapacity),
        UnitOfMeasure("Days", 8.64E+04.toDouble(), Time),
        UnitOfMeasure("Hours", 3.60E+03.toDouble(), Time),
        UnitOfMeasure("Minutes", 6.00E+01.toDouble(), Time),
        UnitOfMeasure("Milliseconds", 1.00E-03.toDouble(), Time),
        UnitOfMeasure("Nanoseconds", 1.00E-09.toDouble(), Time),
        UnitOfMeasure("Seconds", 1.00E+00.toDouble(), Time),
        UnitOfMeasure("Microseconds", 1.00E-06.toDouble(), Time),
        UnitOfMeasure("NewtonMeters", 1.00E+00.toDouble(), Torque),
        UnitOfMeasure("PoundFeet", 1.36E+00.toDouble(), Torque),
        UnitOfMeasure("FeetPerSecond", 0.3048006096.toDouble(), Velocity),
        UnitOfMeasure("InternationalMilesPerHour", 0.44704.toDouble(), Velocity),
        UnitOfMeasure("KilometersPerHour", 2.78E-01.toDouble(), Velocity),
        UnitOfMeasure("KilometersPerSecond", 1000.toDouble(), Velocity),
        UnitOfMeasure("Knots", 5.14E-01.toDouble(), Velocity),
        UnitOfMeasure("MetersPerSecond", 1.00E+00.toDouble(), Velocity),
        UnitOfMeasure("UsMilesPerHour", 0.4470408941.toDouble(), Velocity),
        UnitOfMeasure("Litres", 1.00E-03.toDouble(), Volume),
        UnitOfMeasure("AcreFeet", 1.23E+03.toDouble(), Volume),
        UnitOfMeasure("UsCups", 2.37E-04.toDouble(), Volume),
        UnitOfMeasure("Centilitres", 1.00E-05.toDouble(), Volume),
        UnitOfMeasure("Decilitres", 1.00E-04.toDouble(), Volume),
        UnitOfMeasure("CubicFeet", 2.83E-02.toDouble(), Volume),
        UnitOfMeasure("UsGallons", 3.79E-03.toDouble(), Volume),
        UnitOfMeasure("Hectolitres", 1.00E-01.toDouble(), Volume),
        UnitOfMeasure("CubicInches", 1.64E-05.toDouble(), Volume),
        UnitOfMeasure("CubicUsMiles", 4.17E+09.toDouble(), Volume),
        UnitOfMeasure("Millilitres", 1.00E-06.toDouble(), Volume),
        UnitOfMeasure("CubicMeters", 1.toDouble(), Volume),
        UnitOfMeasure("Nanolitres", 1.00E-12.toDouble(), Volume),
        UnitOfMeasure("FluidOunces", 2.96E-05.toDouble(), Volume),
        UnitOfMeasure("UsPints", 4.73E-04.toDouble(), Volume),
        UnitOfMeasure("UsQuarts", 9.46E-04.toDouble(), Volume),
        UnitOfMeasure("Tablespoons", 1.48E-05.toDouble(), Volume),
        UnitOfMeasure("Teaspoons", 4.93E-06.toDouble(), Volume),
        UnitOfMeasure("CubicYards", 7.65E-01.toDouble(), Volume),
        UnitOfMeasure("Microlitres", 1.00E-09.toDouble(), Volume)
//        UnitOfMeasure("GallonsPerDay", 4.38E-08.toDouble(), VolumeFlow),
//        UnitOfMeasure("GallonsPerHour", 1.05E-06.toDouble(), VolumeFlow),
//        UnitOfMeasure("GallonsPerMinute", 6.31E-05.toDouble(), VolumeFlow),
//        UnitOfMeasure("GallonsPerSecond", 0.003785411784.toDouble(), VolumeFlow),
//        UnitOfMeasure("CubicFeetPerHour", 7.87E-06.toDouble(), VolumeFlow),
//        UnitOfMeasure("CubicMetersPerSecond", 1.toDouble(), VolumeFlow),
//        UnitOfMeasure("NewtonsPerSecond", 1.00E+00.toDouble(), Yank)
)