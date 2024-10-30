package org.example

import kotlin.random.Random
import java.util.random.RandomGenerator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("¿Que ejercicio quieres ver?")
    var opcion = readLine()!!.toInt()

    if (opcion == 1) {
        println("¿Cual es tu nombre?")
        var nombre = readLine()!!
        println("Hola " + nombre + "!!")
    } else if (opcion == 2) {
        println("Escribe un numero")
        var numero = readLine()!!.toInt()
        if (numero % 2 == 0) {
            println("El numero $numero es par")
        } else {
            println("El numero $numero es impar")
        }
    } else if (opcion == 3) {
        println("Cual es el area de tu circulo")
        val radio = readLine()!!.toInt()
        val area = 3.1456 * (radio * radio)
        println("El area es $area")
    } else if (opcion == 4) {
        var c: Int = 0
        val random = Random.nextInt(0, 100)
        while (opcion != random) {
            println("¿Que numero crees que es?")
            var numero = readLine()!!.toInt()

            if (numero == random) {
                println("Has adivinado el numero en $c intentos")
            } else if (numero < random) {
                println("El numero es mayor")
            } else if (numero > random) {
                println("El numero es menor")
            }
            c = c + 1
        }
    } else if (opcion == 5) {
        println("Inserte numero")
        var numero = readLine()!!.toInt()
        println("Tabla del $numero:")

        for (i in 0 until 10) {
            println("$i*$numero=${numero * i}")
        }
    } else if (opcion == 6) {
        var sumatorio: Int = 0
        for (i in 0..100) {
            sumatorio = sumatorio + i
        }
        println("La suma es de $sumatorio")
    } else if (opcion == 7) {
        println("Escribe una cadena de palabras")
        var palabras = readLine()!!

        println(palabras.reversed())
    } else if (opcion == 8) {
        println("Escribe una cadena de palabras")
        var cadena = readLine()!!

        var vocales = 0
        for (a in cadena) {
            if (a.toString() == "a") {
                vocales = vocales + 1
            }
            if (a.toString() == "e") {
                vocales = vocales + 1
            }
            if (a.toString() == "i") {
                vocales = vocales + 1
            }
            if (a.toString() == "o") {
                vocales = vocales + 1
            }
            if (a.toString() == "u") {
                vocales = vocales + 1
            }

        }
        println("Tiene $vocales vocales")
    } else if (opcion == 11) {
        var num1: Int = 1
        var num2: Int = 0
        var contenedor:Int=0
        var c: Int = 0

        println("¿Cuantos numeros de la serie Fibonacci quieres imprimir?")
        c=readLine()!!.toInt()

        for (i in 0..c){
            println(num1)
            contenedor=num1+num2
            num2=num1
            num1=contenedor
        }

    } else if (opcion == 9) {
    println("Ecribe un numero:")
        var num= readLine()!!.toInt()
        var div:Int=1
        var c:Int=0

        for (i in 0..num){
            if (num%div==0){
                c=c+1

        }
            div=div+1
        }
        if (c==2){
            println("El numero es primo")
        } else if (c>2){
            println("El numero no es primo")
        } else if (num==0){
            println("El numero 0 no se puede divir")
        }
    } else if (opcion == 10) {
        println("Quieres pasar de C a F o de F a C")
        println("1- De Celsius a Farenheit")
        println("2- De Farenheit a Celsius")
        var opcion= readLine()!!.toInt()
        var c=0
        var f=0

        if (opcion == 1) {
            println("Inserte Celsius")
             c= readLine()!!.toInt()
            f = (c * 9/5) + 32
            println("La temperatura de $c Celsius pasada a Farenheit es de $f Farenheit")
        }else if (opcion==2){
            println("Inserte Farenheit")
             f= readLine()!!.toInt()
            c = (f - 32) * 5/9
            println("La temperatura de $f Farenheit pasada a Celsius es de $c Celsius")
        }
    }else if (opcion == 12){
        println("Escribe una cadena de numeros")
        var num= readLine()!!.toInt()

        println(num.toString().reversed())

    }else if (opcion == 13){
        class anime (var nombre:String, var episodios:Int, var genero:String){}

        println("Crea objeto anime:")

            println("Nombre del anime:")
            var nombre:String = readLine()!!
            println("Espisodios del anime:")
            var episodios:Int = readLine()!!.toInt()
            println("Genero del anime:")
            var genero:String = readLine()!!

            val a:anime=anime(nombre,episodios,genero)

            println("El anime $nombre con $episodios episodios y del genero $genero ha sido creado correctamente")



    } else if (opcion == 14){
        class Videojuego(var titulo: String, var plataforma: String, var horasJugadas: String)

         val inventario: MutableList<Videojuego> = mutableListOf()

            while (true) {
                println("¿Qué quieres hacer?")
                println("1 - Añadir juego")
                println("2 - Eliminar juego")
                println("3 - Mostrar juegos")
                println("4 - Salir")
                val opcion: Int = readLine()!!.toInt()

                if (opcion == 1) {
                    println("Crea objeto Videojuego:")
                    println("Título:")
                    val titulo = readLine()!!
                    println("Plataforma:")
                    val plataforma = readLine()!!
                    println("Horas jugadas:")
                    val horas = readLine()!!
                    val videojuego = Videojuego(titulo, plataforma, horas)
                    inventario.add(videojuego)
                    println("Juego añadido: ${videojuego.titulo}")
                } else if (opcion == 2) {
                    println("Título del juego que quieres borrar:")
                    val titulo = readLine()!!
                    val videojuegoAEliminar = inventario.find { it.titulo.equals(titulo) }
                    if (videojuegoAEliminar != null) {
                        inventario.remove(videojuegoAEliminar)
                        println("Juego eliminado: ${videojuegoAEliminar.titulo}")
                    } else {
                        println("No se encontró el juego con el título: $titulo")
                    }
                } else if (opcion == 3) {
                    if (inventario.isEmpty()) {
                        println("No hay videojuegos en el inventario.")
                    } else {
                        println("Inventario de Videojuegos:")
                        inventario.forEach { println(it.titulo) }
                    }
                } else if (opcion == 4) {
                    break
            }
        }
}}
