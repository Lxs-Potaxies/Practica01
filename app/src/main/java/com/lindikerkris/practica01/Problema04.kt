package com.lindikerkris.practica01

fun main(args: Array<String>) {
    // Definir dos números enteros
    val num1 = 5
    val num2 = 10

    // Imprimir los dos números enteros
    println("Número 1: $num1")
    println("Número 2: $num2")

    // Determinar si los dos números son iguales usando el operador XOR
    val sonIguales = determinarIgualdad(num1, num2)

    // Imprimir el resultado de la igualdad
    println("¿Los números son iguales? $sonIguales")
}

// Método para determinar si dos números son iguales usando XOR
fun determinarIgualdad(a: Int, b: Int): Boolean {
    return (a xor b) == 0
}
