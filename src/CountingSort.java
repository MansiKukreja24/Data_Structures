import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countSort(arr, 1,n );
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void countSort(int[] arr,int min,int max ){
        int[] countArray = new int[(max-min)+1];
        for(int i=0;i<arr.length;i++)
            countArray[arr[i]-min]++;

        int j=0;
        for(int i=min;i<=max;i++){
            while(countArray[i-min]>0){
                arr[j++]=i;
                countArray[i-min]--;
            }
        }
    }
}
