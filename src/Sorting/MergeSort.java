package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start < 2)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid])
            return;

        int i = start;
        int j = mid;
        int index = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[index++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i,arr, start + index, mid - i);
        System.arraycopy(temp, 0, arr,start, index);
    }
}















