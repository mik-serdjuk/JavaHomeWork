package com.pb.serdjuk.HomeWork11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private List<String> phone;
    private String adds;
    private LocalDateTime Ntime;

    public Person() {
    }

    public Person(int id, String name, LocalDate dateOfBirth, List<String> phone, String adds, LocalDateTime ntime) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.adds = adds;
        Ntime = ntime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public LocalDateTime getNtime() {
        return Ntime;
    }

    public void setNtime(LocalDateTime ntime) {
        Ntime = ntime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(phone, person.phone) && Objects.equals(adds, person.adds) && Objects.equals(Ntime, person.Ntime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, phone, adds, Ntime);
    }

}
