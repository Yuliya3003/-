package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(12,4));

        Comparator comparator = new Comparator();

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        System.out.println(comparator.compareArrays(arr1, arr2));

        Integer[] arr3 = {1, null, 3};
        Integer[] arr4 = {1, 2, 3};
        System.out.println(comparator.compareArrays(arr3, arr4));

        Pair pair = new Pair(1, 2.0);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}