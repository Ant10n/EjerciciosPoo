package com.campusdual.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Escriba número entre el 1 y el 20 para saber si es primo");
        Scanner teclado = new Scanner(System.in);
        Integer numero1  = teclado.nextInt();
        switch (numero1) {
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
                System.out.println(numero1 + " es primo.");
                break;
            default:
                System.out.println(numero1 + " no es primo o has metido un número que no toca...");
                break;
        }
    }
}
