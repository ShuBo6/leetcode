package Sort;

import static Common.Utils.swap;
import static Common.Utils.printArr;

//查找排序
public class SelectionSort {
    public static int[] sort1(int[] a){
        for (int i = 0; i < a.length-1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                printArr(a);
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
//            System.out.println(minIndex);
        }
        return a;
    }

    //每次同时查出最大值最小值
    public static int[] sort2(int[] a){
        for(int i=0;i< a.length/2;i++){
            int minIndex=i;
            int maxIndex=a.length-i-1;
            for(int j=i+1;j<a.length-i;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }

            }
            swap(a,i,minIndex);
            for(int j=i+1;j<a.length-i;j++){
                if (a[maxIndex]<a[j]){
                    maxIndex=j;
                }

            }

            swap(a,a.length-i-1,maxIndex);
            System.out.println("minIndex:"+minIndex);
            System.out.println("maxIndex:"+maxIndex);
            printArr(a);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {5, 6, 2, 1, 8,3};
        printArr(a);

//        sort1(a);
        sort2(a);
        printArr(a);



    }

}
