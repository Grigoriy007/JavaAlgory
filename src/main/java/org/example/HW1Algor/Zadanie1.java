package org.example.HW1Algor;
import java.util.Arrays;




public class Zadanie1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 7, 15, 3, 6, 96, 5, 9};
        sorting(array);
        System.out.println(Arrays.toString(array));

    }


    public static void sorting(int[] array) {

        for (int i = array.length/2 -1 ; i >=0 ; i--) {
            heap(array, array.length, i);
        }

        for (int i = array.length-1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array,i,0);
        }
    }

    private static void heap (int[] array, int heapSize, int index){
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        if(largest != index){
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

            heap(array, heapSize, largest);
        }

    }

}
