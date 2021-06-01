package offer;

public class p15 {
    // you need to treat n as an unsigned value

    // 位运算
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(new
        // p15().hammingWeight(0b00000000000000000000000000001011));
        System.out.println(new p15().hammingWeight(0b00000000000000000000000010000000));
        System.out.println(new p15().hammingWeight(0b11111111111111111111111111111101));
    }
}