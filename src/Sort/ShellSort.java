package Sort;

import static Common.Utils.printArr;
import static Common.Utils.swap;

public class ShellSort {
    public static int[] sort(int[] arr) {
        int h=1;
//        使用Knuth分隔序列，首先计算最大分隔数。
        while(h<=arr.length/3){
            h=3*h+1;
        }
        for(int gap=h;gap>0;gap=(gap-1)/3){
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap-1; j-=gap) {
//                    printArr(arr);
                    if (arr[j] < arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] a = {9, 6, 1, 3, 5};
        printArr(sort(a));

    }

}
