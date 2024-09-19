package com.lindikerkris.practica01

fun convertirTextoANumero(texto: String): Int {
    var numero = 0

    // Convertimos el texto a minúsculas para evitar problemas con mayúsculas
    val textoMinuscula = texto.toLowerCase().trim()
    println("Texto en minúsculas: $textoMinuscula")

    // Procesamos las centenas
    if (textoMinuscula.contains("cien") && !textoMinuscula.contains("ciento")) {
        numero += 100
    } else if (textoMinuscula.contains("ciento")) {
        numero += 100
    } else if (textoMinuscula.contains("doscientos")) {
        numero += 200
    } else if (textoMinuscula.contains("trescientos")) {
        numero += 300
    } else if (textoMinuscula.contains("cuatrocientos")) {
        numero += 400
    } else if (textoMinuscula.contains("quinientos")) {
        numero += 500
    } else if (textoMinuscula.contains("seiscientos")) {
        numero += 600
    } else if (textoMinuscula.contains("setecientos")) {
        numero += 700
    } else if (textoMinuscula.contains("ochocientos")) {
        numero += 800
    } else if (textoMinuscula.contains("novecientos")) {
        numero += 900
    }

    // Eliminar la parte de las centenas para procesar solo las decenas y unidades
    val textoRestante = textoMinuscula.replace(Regex("cien|ciento|doscientos|trescientos|cuatrocientos|quinientos|seiscientos|setecientos|ochocientos|novecientos"), "").trim()
    println("Texto restante después de procesar centenas: $textoRestante")

    // Procesamos las decenas y las unidades
    val partes = textoRestante.split(" y ")
    val decenasTexto = partes[0].trim()
    val unidadesTexto = if (partes.size > 1) partes[1].trim() else ""

    println("Decenas: $decenasTexto")
    println("Unidades: $unidadesTexto")

    // Procesamos las decenas
    when {
        decenasTexto.contains("veinte") -> numero += 20
        decenasTexto.contains("treinta") -> numero += 30
        decenasTexto.contains("cuarenta") -> numero += 40
        decenasTexto.contains("cincuenta") -> numero += 50
        decenasTexto.contains("sesenta") -> numero += 60
        decenasTexto.contains("setenta") -> numero += 70
        decenasTexto.contains("ochenta") -> numero += 80
        decenasTexto.contains("noventa") -> numero += 90
    }
    println("Número después de procesar decenas: $numero")

    // Procesamos las unidades
    when {
        unidadesTexto.contains("uno") -> numero += 1
        unidadesTexto.contains("dos") -> numero += 2
        unidadesTexto.contains("tres") -> numero += 3
        unidadesTexto.contains("cuatro") -> numero += 4
        unidadesTexto.contains("cinco") -> numero += 5
        unidadesTexto.contains("seis") -> numero += 6
        unidadesTexto.contains("siete") -> numero += 7
        unidadesTexto.contains("ocho") -> numero += 8
        unidadesTexto.contains("nueve") -> numero += 9
    }
    println("Número después de procesar unidades: $numero")

    return numero
}

fun main(args: Array<String>) {
    val texto = "quinientos treinta y siete"
    val numero = convertirTextoANumero(texto)
    println("El número es: $numero")
}
