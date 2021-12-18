package com.pb.serdjuk.HomeWork11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String phone;
    private String adds;
    private LocalDateTime datetime;

    public Person(String next) {
    }

    public Person(List<Person> persons) {
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Person(String name, LocalDate dateOfBirth, String phone, String adds, LocalDateTime datetime) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.adds = adds;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", adds='" + adds + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
