package problems;

public class p509 {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(new p509().fib(1));
        System.out.println(new p509().fib(3));
        System.out.println(new p509().fib(4));
        System.out.println(new p509().fib(0));
    }
}