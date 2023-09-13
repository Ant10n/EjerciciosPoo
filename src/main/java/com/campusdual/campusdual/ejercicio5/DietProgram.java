package com.campusdual.campusdual.ejercicio5;

import com.campusdual.campusdual.ejercicio5.exceptions.MaxCaloriesReachedException;
import com.campusdual.campusdual.ejercicio5.exceptions.MaxCarbsReachedException;
import com.campusdual.campusdual.ejercicio5.exceptions.MaxFatsReachedException;
import com.campusdual.campusdual.ejercicio5.exceptions.MaxProteinsReachedException;

import java.util.*;

import static com.campusdual.campusdual.ejercicio5.Kb.getOption;

public class DietProgram {

    public static final String MAXCALORIES = "maxcalories";
    public static final String MAXCARBS = "maxcarbs";
    public static final String MAXFATS = "maxfats";
    public static final String MAXPROTEINS = "maxproteins";

    private List<Food> foodList;
    private HashMap<String, Diet> dietList;
    private List<Customer> customerList;

    public DietProgram() {
        foodList = new ArrayList<>();
        dietList = new HashMap<>();
        customerList = new ArrayList<>();
    }

    public void showMenuProgram() {
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        System.out.println("########################################################");
        Integer option;
        do {
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1-Gestion dietas");
            System.out.println("2-Gestion de pacientes");
            System.out.println("3-Salir del programa");
            option = getOption(1, 3);
            switch (option) {
                case 1:
                    dietManager();
                    break;
                case 2:
                    customerManager();
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa, hasta pronto :)");
                    break;
            }
        } while (option != 3);
    }

    private void customerManager() {
        System.out.println("########################################################");
        System.out.println("################# Gestión de Pacientes##################");
        System.out.println("########################################################");
        Integer option;
        do {
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1-Agregar un nuevo paciente");
            System.out.println("2-Detalles del pacientes y sus dietas");
            System.out.println("3-Asignar dieta a paciente");
            System.out.println("4-Eliminar paciente");
            option = getOption(1, 4);
            switch (option) {
                case 1:
                    addCostumer();
                    break;
                case 2:
                    patientDetails();
                    //todo selectpatient y luego un showpatientdetails
                    break;
                case 3:
                    asignDietToPatient();
                    break;
                case 4:
                    System.out.println("Saliendo de Gestión de pacientes");
                    break;
            }
        } while (option != 4);
    }

    private void addCostumer() {
        System.out.println("████████████████████████████████████");
        System.out.println("Datos de nuevo paciente");
        System.out.println("████████████████████████████████████");
        System.out.println("Nombre del paciente:");
        String name = Kb.nextLine("Nombre del paciente:");
        String surname = Kb.nextLine("Apellido del paciente:");
        Integer weight = Kb.forceNextInt("Peso(en kg):");
        Integer height = Kb.forceNextInt("Altura(en cm):");
        Integer age = Kb.forceNextInt("Edad:");
        String gender = Kb.nextLine("Género (mujer/hombre):");
        Customer newCustomer = new Customer(name, surname, weight, height, age, gender);
        customerList.add(newCustomer);
       //TODO es posible que rompa si meto el details aquí? no se si está ya añadido el customer a esta altura, entiendo que si, queda comentado el método
        System.out.println("Se ha creado el siguiente cliente:");
        System.out.println("Nombre del paciente: " + name);
        System.out.println("Apellido del paciente:" + surname);
        System.out.println("Peso(en kg):" + weight);
        System.out.println("Altura(en cm):" + height);
        System.out.println("Edad:" + age);
        System.out.println("Género (mujer/hombre):" + gender);
        Customer newCustomer = activeCustomer();
        activeCustomer()
        // llamar a un active clien todo el rato


    }

    private void patientDetails() {
        Customer.show

        ;
    }


    private Customer selectedPatient(Customer customers) {
        System.out.println("Lista de pacientes:");
        Integer i = 1;
        List<String> options = new ArrayList<>();

        for (Customer newcustomer : customers) {
            options.add(newcustomer.getName());
            System.out.println((i) + "-" + newcustomer.getName());
            i++;
        }
        System.out.println((i + 1) + "-Salir");

        Integer selected = getOption(1, i + 1);

        if (selected == i + 1) {
            return null;
        }
        return customers.get(selected - 1);
    }

    private void asignDietToPatient() {
        System.out.println("Se ha añadido una dieta al paciente");
    }

    private void dietManager() {
        System.out.println("########################################################");
        System.out.println("################# Gestión de dietas ###################");
        System.out.println("########################################################");
        Integer option;
        do {
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1-Agregar nueva dietas");
            System.out.println("2-Listar dietas");
            System.out.println("3-Eliminar dieta");
            option = getOption(1, 4);
            switch (option) {
                case 1:
                    createDiet();
                    break;
                case 2:
                    manageDiet();
                    break;
                case 3:
                    deleteDiet();
                    break;
            }
        } while (option != 3);
    }

    private void createDiet() {
        System.out.println("Indica los siguientes parámetros para realizar la dieta:");
        Diet diet = new Diet();
        Integer option = Kb.forceNextInt();
        do {
            showDetailsMenu(diet);
            System.out.println("1-Añadir Calorías máximas");
            System.out.println("2-Añadir Carbohidratos máximos");
            System.out.println("3-Añadir Grasas máximas");
            System.out.println("4-Añadir Proteinas máximas");
            System.out.println("5-Añadir alimento");
            System.out.println("6-Salir");
            switch (option) {
                case 1:
                    addFoodMenu(diet, MAXCALORIES);
                    break;
                case 2:
                    addFoodMenu(diet, MAXCARBS);
                    break;
                case 3:
                    addFoodMenu(diet, MAXFATS);
                    break;
                case 4:
                    addFoodMenu(diet, MAXFATS);
                    break;
                case 5:
                    addFoodMenu(diet);
                    //TODO hacer que el metodo addFoodMenu reciba por
                    // TODO parámetro una dieta aparte del o que ya recibe
                    break;
            }
            option = getOption(1, 6);
        } while (option != 6);
    }

    private void manageDiet() {
        System.out.println("Escoja una dieta a modificar:");
        String selected = getSelectedDiet();
        if (selected == null) {
            System.out.println("Operación cancelada");
        } else {
            Diet selectedDiet = dietList.get(selected);
            Integer option = null;
            do {
                showDetailsMenu(selectedDiet);
                System.out.println("1-Cambiar Calorías máximas");
                System.out.println("2-Cambiar Carbohidratos máximas");
                System.out.println("3-Cambiar Grasas máximas");
                System.out.println("4-Cambiar Proteinas máximas");
                System.out.println("5-Añadir alimento");
                System.out.println("6-Salir");
                switch (option) {
                    case 1:
                        updateDiet(selectedDiet, MAXCALORIES);
                        break;
                    case 2:
                        updateDiet(selectedDiet, MAXCARBS);
                        break;
                    case 3:
                        updateDiet(selectedDiet, MAXFATS);
                        break;
                    case 4:
                        updateDiet(selectedDiet, MAXPROTEINS);
                        break;
                    case 5:
                        addFoodMenu(selectedDiet);
                        //TODO hacer que el metodo addFoodMenu reciba por
                        // TODO parámetro una dieta aparte del o que ya recibe
                        break;
                }
                option = getOption(1, 6);
            } while (option != 6);
        }
    }

    private void updateDiet(Diet selectedDiet, String field) {
        System.out.println("Escriba un nuevo valor");
        Integer newValue = Kb.forceNextInt();
        if (MAXCALORIES.equalsIgnoreCase(field)) {
            selectedDiet.setMaxCalories(newValue);
        } else if (MAXFATS.equalsIgnoreCase(field)) {
            selectedDiet.setMaxFats(newValue);
        } else if (MAXCARBS.equalsIgnoreCase(field)) {
            selectedDiet.setMaxCarbs(newValue);
        } else if (MAXPROTEINS.equalsIgnoreCase(field))
            selectedDiet.setMaxProteins(newValue);
    }

    private void deleteDiet() {
        //TODO REVISAR QUE LA DIETA NO ESTÉ ASIGNADA A UN CLIENTE
        System.out.println("Escoja una dieta a eliminar");
        String selected = getSelectedDiet();
        if (selected == null) {
            System.out.println("Operación cancelada");
        } else {
            Diet deleted = dietList.remove(selected) {
                if (deleted == null) {
                    System.out.println(("Error - No se encontró el elemento"));
                }
            }
        }
    }

    private String getSelectedDiet() {
        System.out.println("lista de dietas:");
        Integer i = 1;
        List<String> options = new ArrayList<>();
        Set<String> keys = dietList.keySet();
        for (String key : keys) {
            options.add(key);
            System.out.println((i) + "-" + key);
            i++;
        }
        System.out.println((i + 1) + "-Salir");
        Integer selected = getOption(1, i + 1);
        if (selected == i + 1) {
            return null;
        }
        return options.get(selected - 1);
    }

    private void addFoodMenu(Diet selectedDiet) {
        if (selectedDiet == null) {
            System.out.println("Para agregar alimentos hace falta iniciar una dieta");
            return;
        }
        System.out.println("████████████████████████████████████");
        System.out.println("Agregar Alimentos a la dieta");
        System.out.println("████████████████████████████████████");
        System.out.println("Escriba una opción:");
        System.out.println("===================================");
        System.out.println("1-Agregar un nuevo alimento");
        System.out.println("2-Agregar un alimento ya existente");

        Integer option = getOption(1, 2);
        switch (option) {
            case 1:
                System.out.println("████████████████████████████████████");
                System.out.println("Datos de nuevo alimento");
                System.out.println("████████████████████████████████████");
                System.out.println("Nombre del alimento:");
                String name = Kb.nextLine();
                System.out.println("Carbohidratos:");
                Integer carbs = Kb.forceNextInt();
                System.out.println("Grasas:");
                Integer fats = Kb.forceNextInt();
                System.out.println("Proteínas:");
                Integer proteins = Kb.forceNextInt();
                System.out.println("Gramos:");
                Integer grams = Kb.forceNextInt();
                Food newFood = new Food(name, carbs, fats, proteins);
                //validateAndAddFoodToDiet(newFood, grams);
                foodList.add(newFood);
                break;
            case 2:
                if (foodList.size() == 0) {
                    System.out.println("Para agregar un alimento existente, tienen que existir alimentos previos");
                    return;
                }
                System.out.println("████████████████████████████████████");
                System.out.println("Escoja un alimento");
                System.out.println("████████████████████████████████████");
                Integer i = 1;
                for (Food food : foodList) {
                    System.out.println(i + "- " + food.getName());
                    i++;
                }
                System.out.println(i + "- Cancelar");
                Integer element = getOption(1, i);
                if (element == i) {
                    System.out.println("Cancelando alimento");
                    return;
                }
                Food storedFood = foodList.get(element - 1);
                System.out.println("indique el número de gramos de " + storedFood.getName());
                Integer foodGrams = Kb.forceNextInt();
                //validateAndAddFoodToDiet(storedFood, foodGrams);
                break;
        }
    }

    private void validateAndAddFoodToDiet(Food food, Integer grams) {
        try {
            this.diet.addFood(food, grams);
        } catch (MaxCaloriesReachedException ecal) {
            System.out.println("Se ha alcanzado el máximo valor de calorías permitido");
        } catch (MaxCarbsReachedException ecar) {
            System.out.println("Se ha alcanzado el máximo valor de carbohidratos permitido");
        } catch (MaxFatsReachedException efat) {
            System.out.println("Se ha alcanzado el máximo valor de grasas permitido");
        } catch (MaxProteinsReachedException epro) {
            System.out.println("Se ha alcanzado el máximo valor de proteínas permitido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void createMenu() {
        System.out.println("████████████████████████████████████");
        System.out.println("Crear dieta");
        System.out.println("████████████████████████████████████");
        System.out.println("Escriba un nombre para la dieta");
        String dietName = null;
        boolean dietExist = false;
        do {
            dietName = Kb.nextLine();
            dietExist = dietList.containsKey(dietName);
            if (dietExist) {
                System.out.println("El nombre de la dieta ya existe, escriba otro");
            }
        } while (dietExist);
        System.out.println("Escriba una opción:");
        System.out.println("===================================");
        System.out.println("1-Dieta sin límite");
        System.out.println("2-Dieta por calorías");
        System.out.println("3-Dieta por macronutrientes");
        System.out.println("4-Dieta por datos personales");
        Integer option = getOption(1, 4);
        switch (option) {
            case 1:
                dietList.put(dietName, new Diet());
                System.out.println("Se ha creado una dieta sin límites");
                break;
            case 2:
                System.out.println("████████████████████████████████████");
                System.out.println("Escriba número de calorias");
                System.out.println("████████████████████████████████████");
                Integer calories = Kb.forceNextInt();
                dietList.put(dietName, new Diet(calories);
                System.out.println("Se ha creado una dieta con " + calories + " calorías máximas");
                break;
            case 3:
                System.out.println("████████████████████████████████████");
                System.out.println("Escriba los macronutrientes");
                System.out.println("████████████████████████████████████");
                System.out.println("Carbohidratos:");
                Integer carbs = Kb.forceNextInt();
                System.out.println("Grasas:");
                Integer fats = Kb.forceNextInt();
                System.out.println("Proteínas:");
                Integer proteins = Kb.forceNextInt();
                dietList.put(dietName, new Diet(fats, carbs, proteins);

                System.out.println("Se ha creado una dieta con Carbohidratos:" + carbs + ", Grasas:" + fats + " ,Proteínas:" + proteins);
                break;
            case 4:
                System.out.println("████████████████████████████████████");
                System.out.println("Escriba los datos personales del paciente");
                System.out.println("████████████████████████████████████");
                System.out.println("Peso:");
                Integer weight = Kb.forceNextInt();
                System.out.println("Altura:");
                Integer height = Kb.forceNextInt();
                System.out.println("Edad:");
                Integer age = Kb.forceNextInt();
                System.out.println("Mujer u Hombre(m/h):");
                String sexCharacter = Kb.nextLine();
               /* //TODO integrar a los clientes
                this.diet = new Diet("m".equalsIgnoreCase(sexCharacter), age, height, weight);
                System.out.println("Se ha creado una dieta de " + this.diet.getMaxCalories() + " calorías máximas");
                break;*/
        }
    }

    private void showDetailsMenu(Diet showdiet) {
        if (showdiet != null) {
            System.out.println("████████████████████████████████████");
            System.out.println("Detalles de la dieta");
            System.out.println("████████████████████████████████████");
            if (showdiet.getMaxCalories() != null) {
                System.out.println("El número máximo de calorías es:" + showdiet.getMaxCalories());
            }
            if (showdiet.getMaxCarbs() != null || showdiet.getMaxFats() != null || showdiet.getMaxProteins() != null) {
                System.out.println("Los valores máximos de macronutrientes son: Carbohidratos:" + showdiet.getMaxCarbs() + " , Grasas:" + showdiet.getMaxFats() + " , Proteinas:" + showdiet.getMaxProteins());
            }
            System.out.println("Número de alimentos de la dieta:" + showdiet.getFoodNumber());
            System.out.println("Calorías:" + showdiet.getTotalCalories());
            System.out.println("Carbohidratos:" + showdiet.getTotalCarbs());
            System.out.println("Grasas:" + showdiet.getTotalFats());
            System.out.println("Proteínas:" + showdiet.getTotalProteins());
            System.out.println("Alimentos de la dieta:" + showdiet.getDietIntakes());
        } else {
            System.out.println("████████████████████████████████████");
            System.out.println("La dieta no esta iniciada");
            System.out.println("████████████████████████████████████");
        }
    }
}
