import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        radixSort(arr,10,4);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void radixSort(int[] arr,int radix,int width){
        for(int i=0;i<width;i++)
            radixSingleSort(arr,i,radix);
    }

    public static void radixSingleSort(int[] arr,int position,int radix){
        int items = arr.length;
        int[] countArray =  new int[radix];
        for(int value:arr)
            countArray[getDigit(position,value,radix)]++;

        // Adjust the count array

        for(int j=1;j<radix;j++)
            countArray[j]+= countArray[j-1];


        int[] temp =new int[items];
        for(int index = items-1;index>=0;index--)
            temp[--countArray[getDigit(position,arr[index],radix)]] = arr[index];

        for(int index =0;index<items;index++)
            arr[index]=temp[index];
    }

    public static  int getDigit(int position,int value,int radix){
        return value/(int) Math.pow(radix,position) % radix;
    }
}
