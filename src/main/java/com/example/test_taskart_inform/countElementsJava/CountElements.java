package com.example.test_taskart_inform.countElementsJava;

import java.util.*;

public class CountElements {

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int element : list) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> counts = countElements(list);

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}