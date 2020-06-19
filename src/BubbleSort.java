import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = n-1;i>0;i--){
            for(int j=0;j<n-1;j++)
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void swap(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
