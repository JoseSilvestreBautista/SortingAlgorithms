package com.company;

public class Sort {

  private void merge(int[] array, int front, int middle, int rear) {
    int allo = middle - front + 1;
    int duo = rear - middle;
    int[] left = new int[allo + 1];
    int[] right = new int[duo + 1];
    for (int i = 0; i < allo; i++) {
      left[i] = array[front + i];
    }
    for (int j = 0; j < duo; j++) {
      right[j] = array[middle + j + 1];
    }
    left[allo] = 1000001;
    right[duo] = 1000001;
    int i = 0;
    int j = 0;
    for (int k = front; k < rear + 1; k++) {
      if (left[i] <= right[j]) {
        array[k] = left[i];
        i++;
      } else {
        array[k] = right[j];
        j++;
      }
    }

  }

  void mergeSort(int[] array, int front, int rear) {
    if (front < rear) {
      int middle = front + (rear - front) / 2;
      mergeSort(array, front, middle);
      mergeSort(array, middle + 1, rear);
      merge(array, front, middle, rear);
    }
  }

  void insertionSort(int[] array, int size) {
    for (int i = 1; i < size; i++) {
      int compare = array[i];
      int k = i - 1;
      while (k >= 0 && array[k] > compare) {
        array[k + 1] = array[k];
        k--;
      }
      array[k + 1] = compare;
    }

  }
}
