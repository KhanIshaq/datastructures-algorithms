package com.ishaqkhan.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {9,3,6,1,10,4};

        int[] arr = {4,6,1,7,3,2,5};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        for(int i = arr.length - 1; i>0; i--) {
            for(int j = 0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
