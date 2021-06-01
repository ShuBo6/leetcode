package Sort;


import java.util.Arrays;

import static Common.Utils.printArr;

public class CountSort {

    public static void sort(int[] arr) {
        int maxNum = arr[0];
        for (int x : arr) {
            if (x > maxNum) {
                maxNum = x;
            }
        }
        int[] temp = new int[maxNum + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        printArr(temp);
        int[] result = new int[arr.length];
//        for (int i = 0, j = 0; i < temp.length; i++) {
//            while (temp[i]-- > 0) {
//                result[j++] = i;
//            }
//        }
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--temp[arr[i]]] = arr[i];
        }
        printArr(result);
    }

    public static void main(String[] args) {
        int[] arr2 = new int[]{8, 6, 7, 3, 0, 6, 0, 1, 8, 9};
        int[] arr = new int[]{6, 7, 7, 9, 2, 3, 5};
        int[] arr3 = new int[]{0,8,6, 7, 3,  6,  1, 8, 9 };
        printArr(arr2);
        sort(arr2);
        sort(arr);
        sort(arr3);
        System.out.println();
    }
    }
