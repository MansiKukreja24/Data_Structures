import java.util.Scanner;

public class Insertionrecursive {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            insertionSort(arr,n);
            for (int i = 0; i < n; i++)
                System.out.println(arr[i]);
        }

        public static void insertionSort(int[] arr,int items) {
            if(items<2)
                return;

            insertionSort(arr,items-1);

                int newElement = arr[items-1];
                int j;

                for (j = items-1; j > 0 && arr[j - 1] > newElement; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[j] = newElement;
            }
        }





