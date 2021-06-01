package Common;

import Sort.*;

import java.util.Arrays;
import java.util.Random;

import static Common.Utils.printArr;

public class DataChecker {
    public static int len=10;
    public static int[] generateRandomArr(){
        Random random=new Random();
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= random.nextInt(len);
        }
        return  arr;
    }
    static void check(){
        int[] arr=generateRandomArr();
        int[] arr1=new int[len];
        System.arraycopy(arr,0,arr1,0,len);//复制数组
        Arrays.sort(arr);
//        BubbleSort.sort1(arr1);
//        ShellSort.sort(arr1);
//        MergeSort.sort(arr1,0,len-1);
//        QuickSort.sort(arr1,0,len-1);
        CountSort.sort(arr1);
        if (len<20){
            printArr(arr);
            printArr(arr1);
        }
        boolean flag=true;
        for (int i = 0; i < len; i++) {
            if (arr[i]!=arr1[i]){
                flag=false;
            }
        }
        System.out.println(flag);

    }

    public static void main(String[] args) {
        check();
    }
}
