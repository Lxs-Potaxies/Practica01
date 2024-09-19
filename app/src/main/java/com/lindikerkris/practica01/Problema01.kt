package com.lindikerkris.practica01

fun main(args: Array<String>) {
    // Fórmula del problema
    println("Fórmula planteada: (((x + 9) * 3) - 5) / 4 = 7")

    // Fórmula para resolver el problema
    println("Fórmula para resolver: (((x + 9) * 3) - 5) / 4 = 7")

    // Proceso para encontrar el número
    val resultadoFinal = 7
    val paso1 = resultadoFinal * 4
    val paso2 = paso1 + 5
    val paso3 = paso2 / 3
    val numeroPensado = paso3 - 9

    // Imprimir el número pensado
    println("El número que se pensó al principio es: $numeroPensado")

}
