package com.pb.serdjuk.HomeWork5;

public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title) {
        //this(title, String author, int year);
        this.title = title;
    }

    public Book(String title, String author, int year) {
        //this(title, String author, int year);
        this(title);
        this.author = author;
        this.year = year;
        }

    public void takeBook(String fio) {
        System.out.println( fio + "взял 3 книги");
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
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}

