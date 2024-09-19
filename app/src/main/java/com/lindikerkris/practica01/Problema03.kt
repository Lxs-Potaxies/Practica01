package com.lindikerkris.practica01

fun main(args: Array<String>) {
    // Definir dos números enteros positivos
    val num1 = 20
    val num2 = 10

    // Imprimir los dos números enteros
    println("Número 1: $num1")
    println("Número 2: $num2")

    // Encontrar el menor de los dos números usando métodos
    val menor1 = encontrarMenor(num1, num2)
    val menor2 = encontrarMenorMatematico(num1, num2)

    // Imprimir el menor de los dos números usando ambos métodos
    println("El menor usando el primer método es: $menor1")
    println("El menor usando el segundo método es: $menor2")
}

// Método 1: Usando el operador de resta y la función abs
fun encontrarMenor(a: Int, b: Int): Int {
    return a - (a - b) / (1 + ((a - b) shr 31)) // Método para encontrar el mínimo sin condiciones
}

// Método 2: Usando una fórmula matemática
fun encontrarMenorMatematico(a: Int, b: Int): Int {
    return (a + b - Math.abs(a - b)) / 2 // Fórmula matemática para encontrar el mínimo
}
