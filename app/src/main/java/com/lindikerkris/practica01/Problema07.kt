package com.lindikerkris.practica01

import kotlin.math.sqrt
import kotlin.math.pow

fun calcularDistancia(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
}

fun main(args: Array<String>) {
    // Solicitar los valores al usuario
    println("Ingrese la coordenada x1:")
    val x1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la coordenada y1:")
    val y1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la coordenada x2:")
    val x2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la coordenada y2:")
    val y2 = readLine()?.toDoubleOrNull() ?: 0.0

    // Calcular la distancia
    val distancia = calcularDistancia(x1, y1, x2, y2)
    println("La distancia entre los dos puntos es: $distancia")
}
