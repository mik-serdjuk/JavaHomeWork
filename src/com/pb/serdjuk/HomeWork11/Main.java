package com.pb.serdjuk.HomeWork11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.*;
/*import java.time.LocalDate;
import java.time.LocalDateTime;*/
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        // для работы с полями типа LocalDateTime
        module = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        Scanner scan = new Scanner(System.in);

        LocalDateTime today = LocalDateTime.now();

        List<Person> persons = Arrays.asList(
                new Person("Pit",
                        LocalDate.of(2000, 5, 2),
                        "099100000",
                        "Dnipro, st.Geroiv, 8/12",
                        today),
                new Person("Tom",
                LocalDate.of(2000, 1, 10),
                "099200000",
                "Dnipro, st.Geroiv, 8/15",
                today)
        );
        System.out.print(persons);
        System.out.print("\n" + "Выберите действие: " + "\n"+ "добавить контакт введите 1" + "\n" +
                         "удалить контакт введите 2" + "\n" + "поиск контакта введите 3" + "\n" +
                "отсортировать контакты введите 4" + "\n" + "редактировать контакт введите 5" + "\n" +
                "записать контакты в файл введите 5" + "\n" + "показать контакты из файла 6" + "\n");

        String sign = scan.next();

        switch (sign) {
            case "1":
                Person person = new Person();
                System.out.println("Введите имя абонента: ");
                String name = scan.nextLine();
                person.setName(name);
                System.out.println("Введите дату рождения: год, месяц, число: ");
                /*LocalDate dateOfBirth = scan.nextLine();
                person.setDateOfBirth(dateOfBirth);*/
                System.out.println("Введите телефон: ");
                String phone = scan.nextLine();
                person.setPhone(phone);
                System.out.println("Введите адрес: ");
                String adds = scan.nextLine();
                person.setAdds(adds);
                persons.add(person);
                System.out.println(persons);
                /*new persons(scan.next());
                System.out.print(persons);
                break;*/
            /*case "+":
                System.out.println(operand1 + operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 ==0) {
                    System.out.print("Ошибка");
                } else {
                    System.out.println(operand1 / operand2);
                }

            default:
                throw new IllegalStateException("Unexpected value: " + sign);*/
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
    }
}
