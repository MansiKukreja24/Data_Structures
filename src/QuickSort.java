import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


    public static void quickSort(int[] arr,int start,int end){
        if((end-start)<2)
                return;

        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex);
        quickSort(arr,pivotIndex+1,end);
    }


    public static  int partition(int[] arr,int start,int end){
        int pivot = arr[start];
        int i=start;
        int j=end;

        while(i<j) {
            while (i < j && arr[--j] >= pivot) ;    /* EMPTY LOOP   */
            if (i < j)
                arr[i] = arr[j];
            while (i < j && arr[++i] <= pivot) ;
            if (i < j)
                arr[j] = arr[i];
        }

        arr[j]=pivot;
        return j;



    }
}
