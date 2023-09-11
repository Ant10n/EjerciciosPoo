package com.campusdual.campusdual.ejemplos.alimentos;

public class FoodUtility {
    public static void main(String[] args) {
        Food zanahoria = new Food(12,0,1,"zanahoria");
        System.out.println("Calorias de 100g de Zanahoria:"+zanahoria.getCalories(100));
    }
}
