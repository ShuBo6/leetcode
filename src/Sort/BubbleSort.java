package Sort;

import static Common.Utils.printArr;
import static Common.Utils.swap;

public class BubbleSort {
    //冒泡排序
    public static int[] sort1(int[] a) {

        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1-j; i++) {
                printArr(a);
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }


        return a;
    }

    public static void main(String[] args) {
        int[] a = {9, 6, 1, 3, 5};
        printArr(sort1(a));
    }
}
