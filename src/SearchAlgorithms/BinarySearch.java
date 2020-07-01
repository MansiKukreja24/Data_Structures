package SearchAlgorithms;

import jdk.jshell.EvalException;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter element to be searched");
        int ele = sc.nextInt();
        System.out.println("Element is at index: "+iterBinarySearch(arr,ele));
        System.out.println("Element is at index: "+recurBinarySearch(arr,ele));
    }
    // Iterative Binary search

    public static int iterBinarySearch(int[] arr, int ele) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            System.out.println("mid: "+mid);
            if(arr[mid] == ele)
                return mid;
            else if(arr[mid]<ele){
                start = mid+1;
            }
            else
                end = mid;
        }
        return -1;
    }
    // Recursive binary search

    public static int recurBinarySearch(int[] arr,int ele){
        return recurBinarySearch(arr,0,arr.length,ele);
    }

    public static int recurBinarySearch(int[] arr,int start,int end,int ele){
        if(start>=end)
            return -1;
        int mid =(start+end)/2;
        System.out.println("mid: "+mid);
        if(arr[mid] == ele)
            return mid;
        else if(arr[mid]<=ele)
            return recurBinarySearch(arr,mid+1,end,ele);
        else
            return recurBinarySearch(arr,start,mid,ele);

    }
}
