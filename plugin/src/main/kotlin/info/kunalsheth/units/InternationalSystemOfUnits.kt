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
import info.kunalsheth.units.data.UnitOfMeasure

object InternationalSystemOfUnits {
    private val Length = Dimension(L = 1)
    private val Mass = Dimension(M = 1)
    private val Time = Dimension(T = 1)
    private val ElectricCurrent = Dimension(I = 1)
    private val Temperature = Dimension(Theta = 1)
    private val AmountOfSubstance = Dimension(N = 1)
    private val LuminousIntensity = Dimension(J = 1)

    private val Frequency = Dimension(T = -1)
    private val Angle = Dimension(A = 1)
    private val SolidAngle = Dimension(A = 2)
    private val Force = Dimension(M = 1, L = 1, T = -2)
    private val Weight = Dimension(M = 1, L = 1, T = -2)
    private val Pressure = Dimension(M = 1, L = -1, T = -2)
    private val Stress = Dimension(M = 1, L = -1, T = -2)
    private val Energy = Dimension(M = 1, L = 2, T = -2)
    private val Work = Dimension(M = 1, L = 2, T = -2)
    private val Heat = Dimension(M = 1, L = 2, T = -2)
    private val Power = Dimension(M = 1, L = 2, T = -3)
    private val RadiantFlux = Dimension(M = 1, L = 2, T = -3)
    private val ElectricCharge = Dimension(T = 1, I = 1)
    private val ElectricalPotential = Dimension(M = 1, L = 2, T = -3, I = -1)
    private val ElectricalCapacitance = Dimension(M = -1, L = -2, T = 4, I = 2)
    private val ElectricalResistance = Dimension(M = 1, L = 2, T = -3, I = -2)
    private val Impedance = Dimension(M = 1, L = 2, T = -3, I = -2)
    private val Reactance = Dimension(M = 1, L = 2, T = -3, I = -2)
    private val ElectricalConductance = Dimension(M = -1, L = -2, T = 3, I = 2)
    private val MagneticFlux = Dimension(M = 1, L = 2, T = -2, I = -1)
    private val MagneticFieldStrength = Dimension(M = 1, T = -2, I = -1)
    private val MagneticFluxDensity = Dimension(M = 1, T = -2, I = -1)
    private val ElectricalInductance = Dimension(M = 1, L = 2, T = -2, I = -2)
    private val LuminousFlux = Dimension(A = 2, J = 1)
    private val Illuminance = Dimension(L = -2, J = 1)
    private val Radioactivity = Dimension(T = -1)
    private val AbsorbedDose = Dimension(L = 2, T = -2)
    private val EquivalentDose = Dimension(L = 2, T = -2)
    private val CatalyticActivity = Dimension(T = -1, N = 1)

    private val Area = Dimension(L = 2)
    private val Volume = Dimension(L = 3)
    private val Speed = Dimension(L = 1, T = -1)
    private val Velocity = Dimension(L = 1, T = -1)
    private val VolumetricFlow = Dimension(L = 3, T = -1)
    private val Acceleration = Dimension(L = 1, T = -2)
    private val Jerk = Dimension(L = 1, T = -3)
    private val Jolt = Dimension(L = 1, T = -3)
    private val Snap = Dimension(L = 1, T = -4)
    private val Jounce = Dimension(L = 1, T = -4)
    private val AngularVelocity = Dimension(A = 1, T = -1)
    private val AngularAcceleration = Dimension(A = 1, T = -2)
    private val Momentum = Dimension(L = 1, M = 1, T = -1)
    private val Impulse = Dimension(L = 1, M = 1, T = -1)
    private val AngularMomentum = Dimension(L = 2, M = 1, T = -1)
    private val Torque = Dimension(A = -1, L = 2, M = 1, T = -2)
    private val MomentOfForce = Dimension(L = 2, M = 1, T = -2)
    private val Yank = Dimension(L = 1, M = 1, T = -3)
    private val Wavenumber = Dimension(L = -1)
    private val OpticalPower = Dimension(L = -1)
    private val Curvature = Dimension(L = -1)
    private val SpatialFrequency = Dimension(L = -1)
    private val AreaDensity = Dimension(L = -2, M = 1)
    private val Density = Dimension(L = -3, M = 1)
    private val MassDensity = Dimension(L = -3, M = 1)
    private val SpecificVolume = Dimension(L = 3, M = -1)
    private val Molarity = Dimension(L = -3, N = 1)
    private val AmountOfSubstanceConcentration = Dimension(L = -3, N = 1)
    private val MolarVolume = Dimension(L = 3, N = -1)
    private val Action = Dimension(L = 2, M = 1, T = -1)
    private val HeatCapacity = Dimension(L = 2, M = 1, T = -2, Theta = -1)
    private val Entropy = Dimension(L = 2, M = 1, T = -2, Theta = -1)
    private val MolarHeatCapacity = Dimension(L = 2, M = 1, T = -2, Theta = -1, N = -1)
    private val MolarEntropy = Dimension(L = 2, M = 1, T = -2, Theta = -1, N = -1)
    private val SpecificHeatCapacity = Dimension(L = 2, T = -2, Theta = -1)
    private val SpecificEntropy = Dimension(L = 2, T = -2, Theta = -1)
    private val MolarEnergy = Dimension(L = 2, M = 1, T = -2, N = -1)
    private val SpecificEnergy = Dimension(L = 2, T = -2)
    private val EnergyDensity = Dimension(L = -1, M = 1, T = -2)
    private val SurfaceTension = Dimension(M = 1, T = -2)
    private val Stiffness = Dimension(M = 1, T = -2)
    private val HeatFluxDensity = Dimension(M = 1, T = -3)
    private val Irradiance = Dimension(M = 1, T = -3)
    private val ThermalConductivity = Dimension(L = 1, M = 1, T = -3, Theta = -1)
    private val KinematicViscosity = Dimension(L = 2, T = -1)
    private val ThermalDiffusivity = Dimension(L = 2, T = -1)
    private val DiffusionCoefficient = Dimension(L = 2, T = -1)
    private val DynamicViscosity = Dimension(L = -1, M = 1, T = -1)
    private val ElectricDisplacementField = Dimension(L = -2, T = 1, I = 1)
    private val PolarizationDensity = Dimension(L = -2, T = 1, I = 1)
    private val ElectricChargeDensity = Dimension(L = -3, T = 1, I = 1)
    private val ElectricCurrentDensity = Dimension(L = -2, I = 1)
    private val ElectricalConductivity = Dimension(L = -3, M = -1, T = 3, I = 2)
    private val MolarConductivity = Dimension(M = -1, T = 3, I = 2, N = -1)
    private val Permittivity = Dimension(L = -3, M = -1, T = 4, I = 2)
    private val MagneticPermeability = Dimension(L = 1, M = 1, T = -2, I = -2)
    private val ElectricFieldStrength = Dimension(L = 1, M = 1, T = -3, I = -1)
    private val Magnetization = Dimension(L = -1, I = 1)
    private val Luminance = Dimension(L = -2, J = 1)
    private val LuminousEnergy = Dimension(T = 1, J = 1)
    private val LuminousExposure = Dimension(L = -2, T = 1, J = 1)
    private val Exposure = Dimension(M = -1, T = 1, I = 1)
    private val AbsorbedDoseRate = Dimension(L = 2, T = -3)
    private val Resistivity = Dimension(L = 3, M = 1, T = -3, I = -2)
    private val LinearMassDensity = Dimension(L = -1, M = 1)
    private val LinearChargeDensity = Dimension(L = -1, T = 1, I = 1)
    private val Molality = Dimension(M = -1, N = 1)
    private val MolarMass = Dimension(M = 1, N = -1)
    private val FuelEfficiency = Dimension(L = -2)
    private val MassFlowRate = Dimension(M = 1, T = -1)
    private val MagneticDipoleMoment = Dimension(L = 2, I = 1)
    private val SpectralIrradiance = Dimension(L = -1, M = 1, T = -3)
    private val PowerDensity = Dimension(L = -1, M = 1, T = -3)
    private val ThermalResistance = Dimension(L = -2, M = -1, T = 3, Theta = 1)
    private val ThermalExpansionCoefficient = Dimension(Theta = -1)
    private val TemperatureGradient = Dimension(L = -1, Theta = 1)
    private val ElectronMobility = Dimension(M = -1, T = 2, I = 1)
    private val EnergyFluxDensity = Dimension(M = 1, T = -3)
    private val Compressibility = Dimension(L = 1, M = -1, T = 2)
    private val MagneticReluctance = Dimension(L = -2, M = -1, T = 2, I = 2)
    private val MagneticVectorPotential = Dimension(L = 1, M = 1, T = -2, I = -1)
    private val MagneticMoment = Dimension(L = 3, M = 1, T = -2, I = -1)
    private val MagneticRigidity = Dimension(L = 1, M = 1, T = -2, I = -1)
    private val RadiantExposure = Dimension(M = 1, T = -2)
    private val CatalyticEfficiency = Dimension(L = 3, T = -1, N = -1)
    private val MomentOfInertia = Dimension(L = 2, M = 1)
    private val SpecificAngularMomentum = Dimension(L = 2, T = -1)
    private val FrequencyDrift = Dimension(T = -2)
    private val LuminousEfficacy = Dimension(L = -2, M = -1, T = 3, J = 1)
    private val MagnetomotiveForce = Dimension(A = 1, I = 1)
    private val MagneticSusceptibility = Dimension(L = -1, M = -1, T = 2, I = 2)
    private val RadiantIntensity = Dimension(A = -2, L = 2, M = 1, T = -3)
    private val SpectralIntensity = Dimension(A = -2, L = 1, M = 1, T = -3)
    private val Radiance = Dimension(A = -2, M = 1, T = -3)
    private val SpectralRadiance = Dimension(A = -2, L = -1, M = 1, T = -3)
    private val SpectralPower = Dimension(L = 1, M = 1, T = -3)

    val quantities = setOf(
            Quantity("Length", Length),
            Quantity("Mass", Mass),
            Quantity("Time", Time),
            Quantity("ElectricCurrent", ElectricCurrent),
            Quantity("Temperature", Temperature),
            Quantity("AmountOfSubstance", AmountOfSubstance),
            Quantity("LuminousIntensity", LuminousIntensity),

            Quantity("Frequency", Frequency),
            Quantity("Angle", Angle),
            Quantity("SolidAngle", SolidAngle),
            Quantity("Force", Force),
            Quantity("Weight", Weight),
            Quantity("Pressure", Pressure),
            Quantity("Stress", Stress),
            Quantity("Energy", Energy),
            Quantity("Work", Work),
            Quantity("Heat", Heat),
            Quantity("Power", Power),
            Quantity("RadiantFlux", RadiantFlux),
            Quantity("ElectricCharge", ElectricCharge),
            Quantity("ElectricalPotential", ElectricalPotential),
            Quantity("ElectricalCapacitance", ElectricalCapacitance),
            Quantity("ElectricalResistance", ElectricalResistance),
            Quantity("Impedance", Impedance),
            Quantity("Reactance", Reactance),
            Quantity("ElectricalConductance", ElectricalConductance),
            Quantity("MagneticFlux", MagneticFlux),
            Quantity("MagneticFieldStrength", MagneticFieldStrength),
            Quantity("MagneticFluxDensity", MagneticFluxDensity),
            Quantity("ElectricalInductance", ElectricalInductance),
            Quantity("LuminousFlux", LuminousFlux),
            Quantity("Illuminance", Illuminance),
            Quantity("Radioactivity", Radioactivity),
            Quantity("AbsorbedDose", AbsorbedDose),
            Quantity("EquivalentDose", EquivalentDose),
            Quantity("CatalyticActivity", CatalyticActivity),

            Quantity("Area", Area),
            Quantity("Volume", Volume),
            Quantity("Speed", Speed),
            Quantity("Velocity", Velocity),
            Quantity("VolumetricFlow", VolumetricFlow),
            Quantity("Acceleration", Acceleration),
            Quantity("Jerk", Jerk),
            Quantity("Jolt", Jolt),
            Quantity("Snap", Snap),
            Quantity("Jounce", Jounce),
            Quantity("AngularVelocity", AngularVelocity),
            Quantity("AngularAcceleration", AngularAcceleration),
            Quantity("Momentum", Momentum),
            Quantity("Impulse", Impulse),
            Quantity("AngularMomentum", AngularMomentum),
            Quantity("Torque", Torque),
            Quantity("MomentOfForce", MomentOfForce),
            Quantity("Yank", Yank),
            Quantity("Wavenumber", Wavenumber),
            Quantity("OpticalPower", OpticalPower),
            Quantity("Curvature", Curvature),
            Quantity("SpatialFrequency", SpatialFrequency),
            Quantity("AreaDensity", AreaDensity),
            Quantity("Density", Density),
            Quantity("MassDensity", MassDensity),
            Quantity("SpecificVolume", SpecificVolume),
            Quantity("Molarity", Molarity),
            Quantity("AmountOfSubstanceConcentration", AmountOfSubstanceConcentration),
            Quantity("MolarVolume", MolarVolume),
            Quantity("Action", Action),
            Quantity("HeatCapacity", HeatCapacity),
            Quantity("Entropy", Entropy),
            Quantity("MolarHeatCapacity", MolarHeatCapacity),
            Quantity("MolarEntropy", MolarEntropy),
            Quantity("SpecificHeatCapacity", SpecificHeatCapacity),
            Quantity("SpecificEntropy", SpecificEntropy),
            Quantity("MolarEnergy", MolarEnergy),
            Quantity("SpecificEnergy", SpecificEnergy),
            Quantity("EnergyDensity", EnergyDensity),
            Quantity("SurfaceTension", SurfaceTension),
            Quantity("Stiffness", Stiffness),
            Quantity("HeatFluxDensity", HeatFluxDensity),
            Quantity("Irradiance", Irradiance),
            Quantity("ThermalConductivity", ThermalConductivity),
            Quantity("KinematicViscosity", KinematicViscosity),
            Quantity("ThermalDiffusivity", ThermalDiffusivity),
            Quantity("DiffusionCoefficient", DiffusionCoefficient),
            Quantity("DynamicViscosity", DynamicViscosity),
            Quantity("ElectricDisplacementField", ElectricDisplacementField),
            Quantity("PolarizationDensity", PolarizationDensity),
            Quantity("ElectricChargeDensity", ElectricChargeDensity),
            Quantity("ElectricCurrentDensity", ElectricCurrentDensity),
            Quantity("ElectricalConductivity", ElectricalConductivity),
            Quantity("MolarConductivity", MolarConductivity),
            Quantity("Permittivity", Permittivity),
            Quantity("MagneticPermeability", MagneticPermeability),
            Quantity("ElectricFieldStrength", ElectricFieldStrength),
            Quantity("Magnetization", Magnetization),
            Quantity("Luminance", Luminance),
            Quantity("LuminousEnergy", LuminousEnergy),
            Quantity("LuminousExposure", LuminousExposure),
            Quantity("Exposure", Exposure),
            Quantity("AbsorbedDoseRate", AbsorbedDoseRate),
            Quantity("Resistivity", Resistivity),
            Quantity("LinearMassDensity", LinearMassDensity),
            Quantity("LinearChargeDensity", LinearChargeDensity),
            Quantity("Molality", Molality),
            Quantity("MolarMass", MolarMass),
            Quantity("FuelEfficiency", FuelEfficiency),
            Quantity("MassFlowRate", MassFlowRate),
            Quantity("MagneticDipoleMoment", MagneticDipoleMoment),
            Quantity("SpectralIrradiance", SpectralIrradiance),
            Quantity("PowerDensity", PowerDensity),
            Quantity("ThermalResistance", ThermalResistance),
            Quantity("ThermalExpansionCoefficient", ThermalExpansionCoefficient),
            Quantity("TemperatureGradient", TemperatureGradient),
            Quantity("ElectronMobility", ElectronMobility),
            Quantity("EnergyFluxDensity", EnergyFluxDensity),
            Quantity("Compressibility", Compressibility),
            Quantity("MagneticReluctance", MagneticReluctance),
            Quantity("MagneticVectorPotential", MagneticVectorPotential),
            Quantity("MagneticMoment", MagneticMoment),
            Quantity("MagneticRigidity", MagneticRigidity),
            Quantity("RadiantExposure", RadiantExposure),
            Quantity("CatalyticEfficiency", CatalyticEfficiency),
            Quantity("MomentOfInertia", MomentOfInertia),
            Quantity("SpecificAngularMomentum", SpecificAngularMomentum),
            Quantity("FrequencyDrift", FrequencyDrift),
            Quantity("LuminousEfficacy", LuminousEfficacy),
            Quantity("MagnetomotiveForce", MagnetomotiveForce),
            Quantity("MagneticSusceptibility", MagneticSusceptibility),
            Quantity("RadiantIntensity", RadiantIntensity),
            Quantity("SpectralIntensity", SpectralIntensity),
            Quantity("Radiance", Radiance),
            Quantity("SpectralRadiance", SpectralRadiance),
            Quantity("SpectralPower", SpectralPower)
    )

    val units = setOf(
            UnitOfMeasure("Metre", 1.0, Length),
            UnitOfMeasure("Kilogram", 1.0, Mass),
            UnitOfMeasure("Second", 1.0, Time),
            UnitOfMeasure("Ampere", 1.0, ElectricCurrent),
            UnitOfMeasure("Kelvin", 1.0, Temperature),
            UnitOfMeasure("Mole", 1.0, AmountOfSubstance),
            UnitOfMeasure("Candela", 1.0, LuminousIntensity),

            UnitOfMeasure("Hertz", 1.0, Frequency),
            UnitOfMeasure("Radian", 1.0, Angle),
            UnitOfMeasure("Steradian", 1.0, SolidAngle),
            UnitOfMeasure("Newton", 1.0, Force),
//            UnitOfMeasure("Newton", 1.0, Weight),
            UnitOfMeasure("Pascal", 1.0, Pressure),
//            UnitOfMeasure("Pascal", 1.0, Stress),
            UnitOfMeasure("Joule", 1.0, Energy),
//            UnitOfMeasure("Joule", 1.0, Work),
//            UnitOfMeasure("Joule", 1.0, Heat),
            UnitOfMeasure("Watt", 1.0, Power),
//            UnitOfMeasure("Watt", 1.0, RadiantFlux),
            UnitOfMeasure("Coulomb", 1.0, ElectricCharge),
            UnitOfMeasure("Volt", 1.0, ElectricalPotential),
            UnitOfMeasure("Farad", 1.0, ElectricalCapacitance),
            UnitOfMeasure("Ohm", 1.0, ElectricalResistance),
//            UnitOfMeasure("Ohm", 1.0, Impedance),
//            UnitOfMeasure("Ohm", 1.0, Reactance),
            UnitOfMeasure("Siemens", 1.0, ElectricalConductance),
            UnitOfMeasure("Weber", 1.0, MagneticFlux),
            UnitOfMeasure("Tesla", 1.0, MagneticFieldStrength),
//            UnitOfMeasure("Tesla", 1.0, MagneticFluxDensity),
            UnitOfMeasure("Henry", 1.0, ElectricalInductance),
            UnitOfMeasure("Lumen", 1.0, LuminousFlux),
            UnitOfMeasure("Lux", 1.0, Illuminance),
            UnitOfMeasure("Becquerel", 1.0, Radioactivity),
            UnitOfMeasure("Gray", 1.0, AbsorbedDose),
            UnitOfMeasure("Sievert", 1.0, EquivalentDose),
            UnitOfMeasure("Katal", 1.0, CatalyticActivity)
    )
}