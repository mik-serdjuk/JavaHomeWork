package com.pb.serdjuk.HomeWork6;

public class Veterinarian {

    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public void treatAnimal(Animal animal) {
            System.out.println("Ветеринар " + name + " лечит животное " + animal.getName() +
                    " живет в " + animal.getLocation() + ", принимает в пищу " + animal.getFood());
        }
    }




