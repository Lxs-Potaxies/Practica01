package com.lindikerkris.practica01

fun main(args: Array<String>) {
    // Definir dos números enteros
    val num1 = 15
    val num2 = 27

    // Imprimir los dos números enteros
    println("Número 1: $num1")
    println("Número 2: $num2")

    // Sumar los dos números utilizando el método bitwise
    val resultado = sumarSinSuma(num1, num2)

    // Imprimir el resultado de la suma
    println("La suma de $num1 y $num2 es: $resultado")
}

// Método para sumar dos números sin usar el operador de suma
fun sumarSinSuma(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val acarreo = x and y  // Paso 1: calcular el acarreo
        x = x xor y           // Paso 2: sumar sin acarreo
        y = acarreo shl 1     // Paso 3: preparar el acarreo para la siguiente posición
    }
    return x
}
