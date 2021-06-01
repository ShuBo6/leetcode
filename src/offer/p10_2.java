package offer;

public class p10_2 {

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        } else if (n <= 2) {
            return n;
        }
        int a=0,b=1,sum;
        while(n>=1){
            sum =(a+b) % 1000000007;
            a=b;
            b=sum;
            n--;
        }
        return a;
        
        
    }

}