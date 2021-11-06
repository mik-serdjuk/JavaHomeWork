package com.pb.serdjuk.HomeWork6;

public class Veterinarian {
    public Veterinarian() {
    }

    public static void main(String[] args) {

            Animal food = new Animal();
            food.setFood("Кот ест рыбу");
            food.fd();
            Animal location = new Animal();
            location.setLocation("Днепр");
            location.ad();


    }
}

    /*public static void treatAnimal(Animal animal) {
        Animal food = new Animal();
        food.setFood("рыба");
        food.fd();
        Animal location = new Animal();
        location.setLocation("Днепр");
        location.ad();

        switch (animal) {
            case "Кот":
                Animal food = new Animal();
                food.setFood("рыба");
                food.fd();
                Animal location = new Animal();
                location.setLocation("Днепр");
                location.ad();
            case "Собака":
                Animal food = new Animal();
                food.setFood("мясо+кости");
                food.fd();
                Animal location = new Animal();
                location.setLocation("с.Соленое");
                location.ad();
            case "Конь":
                Animal food = new Animal();
                food.setFood("трава");
                food.fd();
                Animal location = new Animal();
                location.setLocation("пгт.Петриковка");
                location.ad();
                break;


        }
    }*/



