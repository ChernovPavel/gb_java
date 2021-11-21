package lesson_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, ArrayList<String>> bookMap = new HashMap<>();

    public Phonebook() {
        bookMap.put("Иван", new ArrayList<>(List.of("101")));
        bookMap.put("Роман", new ArrayList<>(List.of("201", "202")));
        bookMap.put("Павел", new ArrayList<>(List.of("301", "302", "303")));
    }

    public void add(String name, String phone) {
        bookMap.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

    public void get(String name) {
        if (bookMap.containsKey(name)) {
            ArrayList<String> list = bookMap.get(name);
            System.out.printf("По имени \"%s\" нашлись следующие номера:%n", name);
            list.forEach(s -> System.out.printf("%s %n", s));
        } else {
            System.out.printf("Имени \"%s\" нет в телефонной книге%n", name);
        }
    }


}
