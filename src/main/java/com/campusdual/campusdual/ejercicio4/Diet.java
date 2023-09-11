package com.campusdual.campusdual.ejercicio4;
/*
* Escribe una clase dieta, que teniendo en cuenta una serie de alimentos, vaya sumando cantidades en gramos y calcule cuentas calorías, carbohidratos, proteinas y grasas genera la ingesta
La clase dieta tiene que tener las siguientes funcionalidades:
	-Diet(): crea una dieta sin límite de calorías
	-Diet(Integer maxCalories): crea una dieta con un máximo de calorías, en cuanto se supera ese máximo cuando se adjunta un alimento se despliega un error
	-Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein): crea una dieta con un máximo de estos tres valores, si se supera alguno de ellos cuando se adjunta un alimento se indicara cual y desplegará un error
	-Diet(Boolean women, Integer age, Integer height, Integer weight): Calcula el metabolismo basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
			E = edad
			A = altura en centímetros
			P = peso en kilos

			Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
			Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
	-addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProtein(): devuelve el total de proteinas
*
* */
import com.campusdual.campusdual.ejemplos.alimentos.Food;
import java.util.List;

public class Diet {
    private Integer maxCalories;
    private Integer maxFats;
    private Integer maxCarbs;
    private Integer maxProtein;

    private List<Intake>;

    private List<avaliableFoods>;
    private String[] food;
    private String name;
    private int totalProteins;
    private int totalCarbos;
    private int totalFats;

    public Diet(){
        availableFoods = new ArrayList<>();
    }
    public Diet(Integer maxCalories) {
        this.maxCalories = maxCalories;
        System.out.println("maxCalories =" + this.maxCalories);
    }
    public Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein) {
        this.maxFats = maxFats;
        this.maxCarbs = maxCarbs;
        this.maxProtein = maxProtein;
    }
    public reiniciarDiet() {
        Diet diet= null;
    }
    public void agregarFood() {

    }
    public Integer getTotalCalories() {
        System.out.println("numero total de ");
        return 0;
    }
    public Integer getTotalCarbs() {
        System.out.println("numero total de ");
        return 0;
    }
    public Integer getTotalFats() {
        System.out.println("numero total de ");
        return 0;
    }
    public Integer getTotalProtein() {
        System.out.println("numero total de ");
        return 0;
    }
    public Integer getMaxCalories() {
        return maxCalories;
    }
    public void setMaxCalories(Integer maxCalories) {
        this.maxCalories = maxCalories;
    }
    public Integer getMaxFats() {
        return maxFats;
    }
    public void setMaxFats(Integer maxFats) {
        this.maxFats = maxFats;
    }
    public Integer getMaxCarbs() {
        return maxCarbs;
    }
    public void setMaxCarbs(Integer maxCarbs) {
        this.maxCarbs = maxCarbs;
    }
    public Integer getMaxProtein() {
        return maxProtein;
    }
    public void setMaxProtein(Integer maxProtein) {
        this.maxProtein = maxProtein;
    }
    public List<Food> getAlimentos() {
        return alimentos[];
    }
        public static void main(String[] args) {

    }

}

