package com.pb.serdjuk.HomeWork11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TelBook {
    private static final DateTimeFormatter CHANGE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final String DATA_FILE_PATH = "files/phone-book.json";

    private final Scanner scan = new Scanner(System.in);
    private final List<Person> persons = new ArrayList<>();
    private final ObjectMapper objectMapper;

    public TelBook() {
        objectMapper = new ObjectMapper();
        // pretty printing (json с отступами)
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        // для работы с полями типа LocalDate и LocalDateTime
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        objectMapper.registerModule(module);
    }

    /*public void addPerson() {
        System.out.println("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.println("Введите дату рождения (пример 2007-12-03): ");
        String dateOfBirthStr = scan.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        System.out.println("Добавление телефонных номеров");
        List<String> phones = inputPhones();
        System.out.println("Введите адрес: ");
        String address = scan.nextLine();
        int id = getNextId();
        Person person = new Person(id, name, dateOfBirth, numbers, adds);
        persons.add(person);*/

    }

