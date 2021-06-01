package offer;

public class p14_1 {
    public int cuttingRope(int n) {
        // 1、所有绳子的长度相等时，乘积最大 2、最优绳长为3，先按3分段，即n=3*a+b,则b=0,1,2.
        // b=0则直接返回3^a取余; b=1,将一个1+3换成2+2，即返回(3^(a-1)*4)取余; b=2,则返回(3^a*2)取余
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        long res = 1;
        while (n > 4) {
            res = res * 3;
            res = res % 1000000007;
            n = n - 3;// 每次去掉3
        }
        // 出来循环只有三种情况，分别是n=2、3、4,每种正好分成2、3、4
        return (int) ((res * n) % 1000000007);
    }

    public static void main(String[] args) {
        // System.out.println(new p14_1().cuttingRope(2));
        // System.out.println(new p14_1().cuttingRope(5));
        // System.out.println(new p14_1().cuttingRope(8));
        // System.out.println(new p14_1().cuttingRope(10));
        // System.out.println(new p14_1().cuttingRope(11));
        // System.out.println(new p14_1().cuttingRope(12));
        // System.out.println(new p14_1().cuttingRope(13));
        System.out.println(new p14_1().cuttingRope(999));
        // System.out.println(Math.pow(1000000008, 1.0 / 3));

    }
}