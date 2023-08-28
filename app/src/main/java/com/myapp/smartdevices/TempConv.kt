package com.myapp.smartdevices

enum class TempScale {
    C, F, K
}

fun main() {

}

fun convert(current: Double, currentScale: TempScale, finalScale: TempScale): Double {


    return when (currentScale) {
        TempScale.C -> when (finalScale) {
            // celsius to celsius
            TempScale.C -> current
            // celsius to Fahrenheit
            TempScale.F -> celsiusToFahrenheit(current)
            // celsius to Fahrenheit to Kelvin
            TempScale.K -> fahrenheitToKelvin(celsiusToFahrenheit(current))
        }

        TempScale.F -> when(finalScale) {
            TempScale.C -> TOD
            TempScale.F -> current
            TempScale.K -> TODO()
        }
        TempScale.K -> TODO()
    }

}

// Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
// Kelvin to Celsius: ° C = K - 273.15
// Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

fun celsiusToFahrenheit(value: Double): Double {
    return ((9f * value) / 5) + 32
}

fun kelvinToCelsius(value: Double): Double {
    return value - 273.15
}

fun fahrenheitToKelvin(value: Double): Double {
    return (5f * (value - 32)) / 9f + 273.15
}