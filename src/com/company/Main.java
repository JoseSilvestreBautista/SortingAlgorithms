package com.company;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
    Sort sort = new Sort();
    sort.mergeSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
    sort.insertionSort(array, array.length);
    System.out.println(Arrays.toString(array));
  }
}
