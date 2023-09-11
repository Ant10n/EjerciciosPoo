package com.campusdual.campusdual.ejercicio4;

import com.campusdual.campusdual.ejemplos.alimentos.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DietProgram {
    private List<Food> alimentos = new ArrayList<>();
    private Diet diet = new Diet();
    private Scanner teclado = new Scanner(System.in);
    private int opcion;
    private String opcion2;

    public static void main(String[] args) {
        DietProgram dietProgram = new DietProgram();
        dietProgram.ejecutarPrograma();
    }

    public void ejecutarPrograma() {
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear/reiniciar dieta");
            System.out.println("2. Mostrar información");
            System.out.println("3. Agregar alimento");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de dieta:");
                    System.out.println("1. Sin límite");
                    System.out.println("2. Por calorías");
                    System.out.println("3. Por macronutrientes");
                    System.out.println("4. Por datos personales");
                    System.out.println("5. Reiniciar dieta");
                    int tipoDieta = teclado.nextInt();
                    teclado.nextLine();

                    switch (tipoDieta) {
                        case 1:
                            diet = new Diet();
                            System.out.println("Has elegido dieta sin límite.");
                            break;
                        case 2:
                            System.out.print("Ingrese el límite de calorías diarias: ");
                            int limiteCalorias = teclado.nextInt();
                            teclado.nextLine();
                            diet = new Diet(limiteCalorias);
                            break;
                        case 3:
                            System.out.print("Ingrese los valores de proteínas, carbohidratos y grasas separados por espacios: ");
                            int proteina = teclado.nextInt();
                            int carbohidrato = teclado.nextInt();
                            int grasa = teclado.nextInt();
                            teclado.nextLine();
                            // Haz algo con los valores
                            break;
                        case 4:
                            System.out.print("Ingrese su peso en kg: ");
                            int peso = teclado.nextInt();
                            System.out.print("Ingrese su altura en cm: ");
                            int altura = teclado.nextInt();
                            System.out.print("Ingrese su edad: ");
                            int edad = teclado.nextInt();
                            System.out.print("Ingrese su nivel de actividad física (sedentario=1, ligero=2, moderado=3, activo=4, muy activo=5): ");
                            int actividad = teclado.nextInt();
                            teclado.nextLine();
                            // Haz algo con los valores
                            break;
                        case 5:
                            System.out.println("Se va a reiniciar la dieta");
                            diet.reiniciarDieta();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    diet.mostrarInformacion();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del alimento: ");
                    String nombreAlimento = teclado.nextLine();
                    System.out.print("Ingrese las proteínas (en gramos): ");
                    int proteina = teclado.nextInt();
                    System.out.print("Ingrese los carbohidratos (en gramos): ");
                    int carbohidrato = teclado.nextInt();
                    System.out.print("Ingrese las grasas (en gramos): ");
                    int grasa = teclado.nextInt();
                    teclado.nextLine();

                    Food nuevoAlimento = new Food(carbohidrato, grasa, proteina, nombreAlimento);
                    diet.agregarAlimento(nuevoAlimento);
                    System.out.println("Alimento agregado a la dieta.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);
    }

    public void agregarAlimento(Food alimento) {
        alimentos.add(alimento);
        name = alimento.getName();
        totalProteins += alimento.getProteins();
        totalCarbos += alimento.getCarbos();
        totalFats += alimento.getFats();
    }

    public void mostrarInformacion() {
        System.out.println("Información de la Dieta:");
        System.out.println("Nombre del Alimento: " +  name );
        System.out.println("Total de Proteínas: " + totalProteins + " gramos" + );
        System.out.println("Total de Carbohidratos: " + totalCarbos + " gramos");
        System.out.println("Total de Grasas: " + totalFats + " gramos");
    }

    public Diet reiniciarDieta() {
        alimentos.clear();
        set.totalProteins = 0;
        set.totalCarbos = 0;
        set.totalFats = 0;
    }
}


}
