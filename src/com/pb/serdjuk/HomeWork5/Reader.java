package com.pb.serdjuk.HomeWork5;

public class Reader {
    public String fio;
    public int number;
    public String faculty;
    public int birthday;
    public int tel;

    public Reader(String fio) {
        //this(title, String author, int year);
        this.fio = fio;
    }
   /* public void takeBook(int count) {
        System.out.println("Петров В.В. взял" + count + "книги");
    }
    public void takeBook(String fio, String title) {
        System.out.println(fio + "взял книги:" + title);
    }
    public void takeBook(String fio, String title, String author, int year) {
        System.out.println(fio + "взял книги:" + title + author + year);
    }

    public void returnBook(String fio) {
        System.out.println( fio + "вернул 3 книги");
    }
    public void returnBook(String fio, String title) {
        System.out.println(fio + "вернул книги:" + title);
    }
    public void returnBook(String fio, String title, String author, int year) {
        System.out.println(fio + "вернул книги:" + title + author + year);
    }*/
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
