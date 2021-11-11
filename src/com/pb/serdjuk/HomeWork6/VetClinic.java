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
        cat2.setLocation("Селе");

        Horse horse = new Horse("Ракета",88);
        horse.setFood("Сено");
        horse.setLocation("Конюшне");

        Dog dog = new Dog("Отто", "Немецкий Дог");
        dog.setFood("Мясо");
        dog.setLocation("Вольере во дворе дома");

        Dog dog2 = new Dog("Му-Му", "Дворняга");
        dog2.setFood("Мясо и кости");
        dog2.setLocation("у Немого");


         Class clazzCat = Cat.class;
         Class clazzDog = Dog.class;

         Animal[] animals = new Animal[] {cat, cat2, horse, dog, dog2};

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
         /*Class catClazz = Cat.class;
         Class catClazz2 = cat2.getClass();*/
     }
}




