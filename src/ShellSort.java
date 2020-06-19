import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                int newElement = arr[i];
                int j = i;

                while(j>=gap &&arr[j-gap]>newElement){
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=newElement;
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
