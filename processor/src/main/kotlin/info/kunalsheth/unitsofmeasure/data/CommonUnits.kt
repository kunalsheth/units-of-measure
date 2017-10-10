package info.kunalsheth.unitsofmeasure.data

/**
 * Created by kunal on 8/6/17.
 */
val commonUnits = mapOf(
        "metre" to MetaUom(metre = 1),
        "kilogram" to MetaUom(kilogram = 1),
        "second" to MetaUom(second = 1),
        "ampere" to MetaUom(ampere = 1),
        "kelvin" to MetaUom(kelvin = 1),
        "mole" to MetaUom(mole = 1),
        "candela" to MetaUom(candela = 1),

        // https://en.wikipedia.org/wiki/SI_derived_unit
        "hertz" to MetaUom(/*s−1*/ second = -1),
        "radian" to MetaUom(/*1*/),
        "steradian" to MetaUom(/*1*/),
        "newton" to MetaUom(/*kg⋅m⋅s−2*/ kilogram = 1, metre = 1, second = -2),
        "pascal" to MetaUom(/*kg⋅m−1⋅s−2*/ kilogram = 1, metre = -1, second = -2),
        "joule" to MetaUom(/*kg⋅m2⋅s−2*/ kilogram = 1, metre = 2, second = -2),
        "watt" to MetaUom(/*kg⋅m2⋅s−3*/ kilogram = 1, metre = 2, second = -3),
        "coulomb" to MetaUom(/*s⋅A*/ second = 1, ampere = 1),
        "volt" to MetaUom(/*kg⋅m2⋅s−3⋅A−1*/ kilogram = 1, metre = 2, second = -3, ampere = -1),
        "farad" to MetaUom(/*kg−1⋅m−2⋅s4⋅A2*/ kilogram = -1, metre = -2, second = 4, ampere = 2),
        "ohm" to MetaUom(/*kg⋅m2⋅s−3⋅A−2*/ kilogram = 1, metre = 2, second = -3, ampere = -2),
        "siemens" to MetaUom(/*kg−1⋅m−2⋅s3⋅A2*/ kilogram = -1, metre = -2, second = 3, ampere = 2),
        "weber" to MetaUom(/*kg⋅m2⋅s−2⋅A−1*/ kilogram = 1, metre = 2, second = -2, ampere = -1),
        "tesla" to MetaUom(/*kg⋅s−2⋅A−1*/ kilogram = 1, second = -2, ampere = -1),
        "henry" to MetaUom(/*kg⋅m2⋅s−2⋅A−2*/ kilogram = 1, metre = 2, second = -2, ampere = -2),
        "celsius" to MetaUom(/*K*/ kelvin = 1),
        "lumen" to MetaUom(/*cd*/ candela = 1),
        "lux" to MetaUom(/*m−2⋅cd*/ metre = -2, candela = 1),
        "becquerel" to MetaUom(/*s−1*/ second = -1),
        "gray" to MetaUom(/*m2⋅s−2*/ metre = 2, second = -2),
        "sievert" to MetaUom(/*m2⋅s−2*/ metre = 2, second = -2),
        "katal" to MetaUom(/*s−1⋅mol*/ second = -1, mole = 1)
)
