package com.pb.serdjuk.HomeWork6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetClinic {
     public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Веня", "Серий");
        cat.setFood("Молоко");
        cat.setLocation("Комнате");

         Cat cat2 = new Cat("Рыжик", "рыжий");
         cat2.setFood("Молоко и мясо");
         cat2.setLocation("Улица");

        Horse horse = new Horse("Ракета",88);
        horse.setFood("Сено");
        horse.setLocation("Конюшне");

        Dog dog = new Dog("Отто", "Немецкий");
        dog.setFood("Мясо");
        dog.setLocation("Вольере во дворе дома");


         Class clazzCat = Cat.class;
         Class clazzDog = Dog.class;

         Animal[] animals = new Animal[] {cat, horse, dog};

         Class clazz = Class.forName("com.pb.serdjuk.HomeWork6.Veterinarian");

         //Constructor constr = clazz.getConstructor();
         //Object vet = constr.newInstance();

         Constructor constr = clazz.getConstructor(String.class);
         Object vet = constr.newInstance("Скворцов");

         Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);

         for(Animal animal: animals) {
             treatAnimal.invoke(vet, animal);
         }

         //Veterinarian.class.newInstance().treatAnimal(cat);
         Class catClazz = Cat.class;
         Class catClazz2 = cat2.getClass();
     }
}




