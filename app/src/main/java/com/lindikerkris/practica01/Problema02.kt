package com.lindikerkris.practica01

fun main(args: Array<String>) {

        // Fórmula para calcular los grados girados
        val gradosPorHora = 360 / 12  // Cada hora equivale a 30 grados
        val horasGiradas = 9 - 2      // Diferencia entre las 9 y las 2

        // Si está girando en sentido contrario, es la misma diferencia de horas
        val gradosGirados = horasGiradas * gradosPorHora

        // Imprimir la fórmula utilizada
        println("Fórmula aplicada: Grados = (horas giradas) * (grados por hora)")
        println("Grados por hora = $gradosPorHora, Horas giradas = $horasGiradas")

        // Imprimir la cantidad de grados girados
        println("La aguja giró $gradosGirados grados.")
}
