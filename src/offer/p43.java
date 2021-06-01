package offer;

public class p43 {
    public int countDigitOne(int n) {
        int count=0;
        int numLen=0;
        while (n>0){
            n/=10;
            numLen++;
        }
        count= (int) (numLen*Math.pow(10,numLen-1));
//        1 1+10+1+8 1+10+1+8+100+10+1+80+8

        for (int i = 1; i <= n; i++) {
//             int curCount=0;
             int temp=i;
            while (temp>0){

                if (temp%10==1){
                    count++;
                }
//                count+=curCount;
                temp/=10;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new p43().countDigitOne(999));
        System.out.println(new p43().countDigitOne(9999));
        System.out.println(new p43().countDigitOne(99999));
        System.out.println(new p43().countDigitOne(999999));
        System.out.println(new p43().countDigitOne(9999999));
        System.out.println(new p43().countDigitOne(99));
//        System.out.println(new p43().countDigitOne(1234348489));
    }
}
