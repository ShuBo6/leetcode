package Common;

public class Utils {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void printArr(int[] a){
        for (int x : a
        ) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
