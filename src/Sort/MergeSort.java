package Sort;

import java.util.Random;

import static Common.Utils.printArr;

public class MergeSort {

//递归调用归并，实现最终的排序。
    public static void sort(int[] arr,int left,int right){
        if (left==right) return;//递归退出的条件，即最小规模
        int mid=left+(right-left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    //    while循环实现的归并。
    public static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound) {
        int mid = rightPtr;
        int[] temp = new int[rightBound-leftPtr+1];
        int i = leftPtr, j = rightPtr+1, k = 0;
        while (i <= mid && j <= rightBound) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= rightBound) {
            temp[k++] = arr[j++];
        }
        //将每次的归并结果从temp数组保存到arr数组
        for(int m=0;m<temp.length;m++){
            arr[m+leftPtr]=temp[m];
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[] {1,4,6,7,10,2,3,5,8,9};
        int[] arr1=new int[] {1,4,7,10,1,2,5};
        merge(arr1,0,3,6);
//        int[] a = {9, 6, 1, 3, 5};
//        sort(a,0,a.length-1);

    }
}
