package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Anime {
    String nombre;
    int episodios;
    String genero;

    Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }
}

class Videojuego {
    String titulo;
    String plataforma;
    String horasJugadas;

    Videojuego(String titulo, String plataforma, String horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que ejercicio quieres ver?");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.println("¿Cual es tu nombre?");
            String nombre = scanner.nextLine();
            System.out.println("Hola " + nombre + "!!");
        } else if (opcion == 2) {
            System.out.println("Escribe un numero");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numero " + numero + " es impar");
            }
        } else if (opcion == 3) {
            System.out.println("Cual es el area de tu circulo");
            int radio = scanner.nextInt();
            double area = 3.1456 * (radio * radio);
            System.out.println("El area es " + area);
        } else if (opcion == 4) {
            int c = 0;
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            while (true) {
                System.out.println("¿Que numero crees que es?");
                int numero = scanner.nextInt();
                c++;
                if (numero == randomNumber) {
                    System.out.println("Has adivinado el numero en " + c + " intentos");
                    break;
                } else if (numero < randomNumber) {
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println("El numero es menor");
                }
            }
        } else if (opcion == 5) {
            System.out.println("Inserte numero");
            int numero = scanner.nextInt();
            System.out.println("Tabla del " + numero + ":");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "*" + numero + "=" + (numero * i));
            }
        } else if (opcion == 6) {
            int sumatorio = 0;
            for (int i = 0; i <= 100; i++) {
                sumatorio += i;
            }
            System.out.println("La suma es de " + sumatorio);
        } else if (opcion == 7) {
            System.out.println("Escribe una cadena de palabras");
            String palabras = scanner.nextLine();
            System.out.println(new StringBuilder(palabras).reverse().toString());
        } else if (opcion == 8) {
            System.out.println("Escribe una cadena de palabras");
            String cadena = scanner.nextLine();
            int vocales = 0;
            for (char a : cadena.toCharArray()) {
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    vocales++;
                }
            }
            System.out.println("Tiene " + vocales + " vocales");
        } else if (opcion == 9) {
            System.out.println("Escribe un numero:");
            int num = scanner.nextInt();
            int div = 1;
            int c = 0;
            for (int i = 0; i <= num; i++) {
                if (num % div == 0) {
                    c++;
                }
                div++;
            }
            if (c == 2) {
                System.out.println("El numero es primo");
            } else if (c > 2) {
                System.out.println("El numero no es primo");
            } else {
                System.out.println("El numero 0 no se puede dividir");
            }
        } else if (opcion == 10) {
            System.out.println("Quieres pasar de C a F o de F a C");
            System.out.println("1 - De Celsius a Farenheit");
            System.out.println("2 - De Farenheit a Celsius");
            int opcionTemp = scanner.nextInt();
            int c = 0;
            int f = 0;

            if (opcionTemp == 1) {
                System.out.println("Inserte Celsius");
                c = scanner.nextInt();
                f = (c * 9 / 5) + 32;
                System.out.println("La temperatura de " + c + " Celsius pasada a Farenheit es de " + f + " Farenheit");
            } else if (opcionTemp == 2) {
                System.out.println("Inserte Farenheit");
                f = scanner.nextInt();
                c = (f - 32) * 5 / 9;
                System.out.println("La temperatura de " + f + " Farenheit pasada a Celsius es de " + c + " Celsius");
            }
        } else if (opcion == 11) {
            int num1 = 1;
            int num2 = 0;
            int contenedor;
            int c;

            System.out.println("¿Cuantos numeros de la serie Fibonacci quieres imprimir?");
            c = scanner.nextInt();

            for (int i = 0; i < c; i++) {
                System.out.println(num1);
                contenedor = num1 + num2;
                num2 = num1;
                num1 = contenedor;
            }
        } else if (opcion == 12) {
            System.out.println("Escribe una cadena de numeros");
            String numStr = scanner.nextLine();
            System.out.println(new StringBuilder(numStr).reverse().toString());
        } else if (opcion == 13) {
            System.out.println("Crea objeto anime:");
            System.out.println("Nombre del anime:");
            String nombreAnime = scanner.nextLine();
            System.out.println("Episodios del anime:");
            int episodios = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Genero del anime:");
            String genero = scanner.nextLine();

            Anime anime = new Anime(nombreAnime, episodios, genero);
            System.out.println("El anime " + nombreAnime + " con " + episodios + " episodios y del genero " + genero + " ha sido creado correctamente");
        } else if (opcion == 14) {
            List<Videojuego> inventario = new ArrayList<>();

            while (true) {
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1 - Añadir juego");
                System.out.println("2 - Eliminar juego");
                System.out.println("3 - Mostrar juegos");
                System.out.println("4 - Salir");
                int opcionJuego = scanner.nextInt();
                scanner.nextLine();

                if (opcionJuego == 1) {
                    System.out.println("Crea objeto Videojuego:");
                    System.out.println("Título:");
                    String titulo = scanner.nextLine();
                    System.out.println("Plataforma:");
                    String plataforma = scanner.nextLine();
                    System.out.println("Horas jugadas:");
                    String horas = scanner.nextLine();
                    Videojuego videojuego = new Videojuego(titulo, plataforma, horas);
                    inventario.add(videojuego);
                    System.out.println("Juego añadido: " + videojuego.titulo);
                } else if (opcionJuego == 2) {
                    System.out.println("Título del juego que quieres borrar:");
                    String titulo = scanner.nextLine();
                    Videojuego videojuegoAEliminar = null;
                    for (Videojuego juego : inventario) {
                        if (juego.titulo.equalsIgnoreCase(titulo)) {
                            videojuegoAEliminar = juego;
                            break;
                        }
                    }
                    if (videojuegoAEliminar != null) {
                        inventario.remove(videojuegoAEliminar);
                        System.out.println("Juego eliminado: " + videojuegoAEliminar.titulo);
                    } else {
                        System.out.println("No se encontró el juego con el título: " + titulo);
                    }
                } else if (opcionJuego == 3) {
                    if (inventario.isEmpty()) {
                        System.out.println("No hay videojuegos en el inventario.");
                    } else {
                        System.out.println("Inventario de Videojuegos:");
                        for (Videojuego juego : inventario) {
                            System.out.println(juego.titulo);
                        }
                    }
                } else if (opcionJuego == 4) {
                    System.out.println("Saliendo del programa...");
                    break;
                }
            }
        }
        scanner.close();
    }
}
