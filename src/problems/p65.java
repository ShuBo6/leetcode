package problems;

public class p65 {
    public int add(int a, int b) {
        if (b==0){
            return a;
        }
//        非进位和（异或运算）+进位（与运算进位）
        return add(a^b,(a&b)<<1);
    }
}
