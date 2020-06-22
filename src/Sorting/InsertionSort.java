package Sorting;

import java.util.Scanner;

public class InsertionSort {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=1;i<n;i++){                    /* i = first unsorted index*/
                int newElement = arr[i];
                int j;
                for(j=i;j>0 && arr[j-1]>newElement;j--){
                    arr[j]=arr[j-1];
                }
                arr[i]=newElement;
            }
            for(int i=0;i<n;i++)
                System.out.println(arr[i]);


        }
    }


