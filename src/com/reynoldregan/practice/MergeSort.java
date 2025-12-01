package com.reynoldregan.practice;

public class MergeSort {

    public static void main(String[] args) {

    }

    int[] merge(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;
        while (true){
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }

        }

    }


}
