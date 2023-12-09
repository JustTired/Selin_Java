package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Trainee {
    /**
     * Задание 1
     * Составить алгоритм:
     * если введенное число больше 7, то вывести “Привет”
     **/
    private static void hi(long number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    /**
     * Задание 3
     * Составить алгоритм:
     * если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     **/
    private static void hello(String name) {
        if (name.contains("Вятчеслав")) {
            System.out.println("Привет, Вятчеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    /**
     * Задание 3
     * Составить алгоритм:
     * на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     **/
    private static void checkArray(String str) {
        String[] strings = str.replaceAll(" ", "").split(",");
        var list = new ArrayList<Long>();
        for (String s : strings) {
            list.add(Long.parseLong(s));
        }
        long[] array = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Arrays.stream(array)
                .filter(s -> s % 3 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        start();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String task = reader.readLine();
            switch (task) {
                case "1":
                    System.out.println("Введите число");
                    hi(Long.parseLong(reader.readLine()));
                    break;
                case "2":
                    System.out.println("Введите имя");
                    hello(reader.readLine());
                    break;
                case "3":
                    System.out.println("Введите данные массива через запятую");
                    checkArray(reader.readLine());
                    break;
                case "4":
                    System.out.println("Данное задание сделано в текстовом формате)");
                    break;
                default:
                    System.out.println("Такого задания нет");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void start() {
        System.out.println("Доброго времени суток! Введите номер задания, которое хотели бы проверить");
    }
}
