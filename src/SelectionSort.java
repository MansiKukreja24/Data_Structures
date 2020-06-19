import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j] > arr[max])
                    max = i;

            }
            swap(arr,max,i);
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }
    public static void swap(int[] arr,int max,int i){
        int temp = arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
    }
}
