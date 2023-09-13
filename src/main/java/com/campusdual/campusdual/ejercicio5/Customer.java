//    -Las personas podrán tener asignadas una lista de dietas que se catalogarán de lunes a domingo sacadas de la lista de dietas anterior.

package com.campusdual.campusdual.ejercicio5;

public class Customer {
    private String name;
    private String surname;
    private Integer weight;
    private Integer height;
    private Integer age;
    private String gender;

    public Customer() {
    }

    public Customer(String name, String surname, Integer weight, Integer height, Integer age, String gender) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }
    public void showPatientsDetails() {
        Customer customer = null;
        System.out.println("Nombre: " + customer.getName());
        System.out.println("Apellido: " + customer.getSurname());
        System.out.println("Peso: " + customer.getWeight() + " kg");
        System.out.println("Altura: " + customer.getHeight() + " cm");
        System.out.println("Edad: " + customer.getAge() + " años");
        System.out.println("Género: " + customer.getGender());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeigth(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
