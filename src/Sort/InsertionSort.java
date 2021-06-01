package Sort;

import static Common.Utils.printArr;
import static Common.Utils.swap;

public class InsertionSort {
    public static int[] sort(int[] arr){


//
//        for (int i = 0; i < arr.length; i++) {
//
//            for(int j=i+1;j< arr.length;j++){
//                printArr(arr);
//                if (arr[j]<arr[i]){
//                    swap(arr,i,j);
//                }
//
//            }
//        }

        for (int i = 1; i < arr.length; i++) {
            for (int j=i;j>0;j--){
                printArr(arr);
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);}
            }
        }
        
        return arr;
        
    }
    public static void main(String[] args) {
        int[] a = {9, 6, 1, 3, 5};
        printArr(sort(a));

    }

}
