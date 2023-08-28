package com.myapp.smartdevices

fun main() {
    temperatureConverter(28.0,"Celsius","Fahrenheit"){9.0/5.0*it+32}
}

fun temperatureConverter(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("The $initialMeasurement degree $initialUnit is $finalMeasurement degree $finalUnit")
}