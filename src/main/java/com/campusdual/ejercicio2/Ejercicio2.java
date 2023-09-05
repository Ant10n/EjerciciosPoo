package com.campusdual.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    static int numero;

    public static void main(String[] args) {
        calcularBisiesto(numero);
    }

    public static boolean calcularBisiesto(int numero) {
        System.out.println("Escriba un año para calcular si es bisiesto o no");
        Scanner teclado = new Scanner(System.in);
        numero  = teclado.nextInt();
        if (numero % 4 == 0) {
            if (numero % 100 != 0 || (numero % 100 == 0 && numero % 400 == 0)) {
                System.out.println("El año es bisiesto ");
                return true;
            } else System.out.println("el año no es bisiesto");
            return false;
        } else {
            System.out.println("el año no es bisiesto");
            return false;
        }
    }

}

