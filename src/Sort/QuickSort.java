package Sort;

import java.util.Random;

import static Common.Utils.printArr;
import static Common.Utils.swap;

public class QuickSort {
    public static void sort(int[] a, int left, int right) {
        if (left < right) {
            int mid=partition(a,left,right );
            sort(a, left, mid - 1);
            sort(a, mid + 1, right);
        }
    }

    public static int partition(int[] a, int leftBound, int rightBound) {
        int p = a[rightBound];
        int left=leftBound;
        int right=rightBound-1;
        while (left <= right ) {
            while (left <= right && a[left] <= p) {
                left++;
            }
            while (left <= right  && a[right ] > p) {
                right--;
            }
            if (left<right){
                swap(a, left, right );
            }

        }
        swap(a, left, rightBound );

        return left;
    }

//    public static int partition(int[] a, int left, int right) {
//        int pivot=left;
//        int scanIndex=pivot+1;
//        for (int i = scanIndex; i <=right ; i++) {
//            if (a[i]<a[pivot]){
//                swap(a,i,scanIndex);
//                scanIndex++;
//            }
//        }
//        swap(a, pivot, scanIndex-1);

//        return scanIndex-1;
//    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[]{6, 7, 7, 19, 2, 3, 5};
        int[] arr2 = new int[]{8,6, 7, 3, 0, 6, 0, 1, 8, 9 };
        int[] arr3 = new int[]{0,8,6, 7, 3,  6,  1, 8, 9 };
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        printArr(arr1);
        sort(arr1, 0, arr1.length-1);
        printArr(arr1);

    }
}
