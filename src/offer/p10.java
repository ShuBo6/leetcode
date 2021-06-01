package offer;

public class p10 {
    public int fib(int n) {
        if(n==0||n==1) {return n;}
        int a=0,b=1,sum;
        while(n>=1){
            sum =(a+b) % 1000000007;
            a=b;
            b=sum;
            n--;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(new p10().fib(100));
        System.out.println(new p10().fib(2));
        System.out.println(new p10().fib(5));
    }
}