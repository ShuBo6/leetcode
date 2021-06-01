package offer;

public class p16 {
    public double myPow(double x, int n) {
        double res = 1;

        if (n == 0|| x == 1.0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        
        long b=(long) n;
        if(b<0){
            b=-b;
            x=1/x;
        }
        while(b>0){
            if(b%2==1){res*=x;}
            x*=x;
            b>>=1;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new p16().myPow(2.0, 3));
        System.out.println(new p16().myPow(0, 0));
        System.out.println(new p16().myPow(0.00001, 2147483647));
        System.out.println(Math.pow(0, 0));

    }
}