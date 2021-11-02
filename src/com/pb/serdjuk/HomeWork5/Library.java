package com.pb.serdjuk.HomeWork5;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Book [] booktitle = new Book[3];
        booktitle[0] = new Book("Приключения", "Иванов И.И.", 2000 );
        booktitle[1] = new Book("Словарь", "Сидоров А.В.", 1980 );
        booktitle[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);

        for (int i = 0; i<3; i++){
            System.out.println("Книги:" + booktitle[i].title);
        }
        Reader [] readerfio = new Reader[3];
        readerfio[0] = new Reader("Петров В.В.");
        readerfio[1] = new Reader("Уткин Д.Д.");
        readerfio[2] = new Reader("Сидоров О.О.");
        for (int i = 0; i<3; i++){
            System.out.println("Читатель:" + readerfio[i].fio);
        }

        booktitle[0].takeBook("Петров В.В.");
        booktitle[0].takeBook("Петров В.В.", "Приключения, Словарь, Энциклопедия");
        booktitle[0].takeBook("Петров В.В.", "Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)");

        booktitle[0].returnBook("Петров В.В.");
        booktitle[0].returnBook("Петров В.В.", "Приключения, Словарь, Энциклопедия");
        booktitle[0].returnBook("Петров В.В.", "Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)");


    }
}
