package com.countofelements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Пример с тестами
        Main main = new Main();

        // Тест 1: Массив чисел
        Integer[] numbers = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Test 1: " + main.getCountOfElements(numbers));

        // Тест 2: Массив строк
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};
        System.out.println("Test 2: " + main.getCountOfElements(words));

        // Тест 3: Массив с одинаковыми элементами
        Integer[] sameNumbers = {5, 5, 5, 5};
        System.out.println("Test 3: " + main.getCountOfElements(sameNumbers));

        // Тест 4: Пустой массив
        Integer[] emptyArray = {};
        System.out.println("Test 4: " + main.getCountOfElements(emptyArray));
    }

    private <T> Map<T,Integer> getCountOfElements(T [] arr){
        Map<T, Integer> elementsCounts = new HashMap<>();
        Arrays.stream(arr).forEach(element -> elementsCounts.put(element, elementsCounts.getOrDefault(element, 0) + 1));
        return elementsCounts;
    }
}