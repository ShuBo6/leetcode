package problems;

public class p63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int len=prices.length;
        int mid=(len-1)/2;
        int right=mid;
        int min=prices[mid];
        int max=prices[right];
        while (mid>=0){min=Math.min(min,prices[mid--]); }
        while (right<len){max=Math.max(max,prices[right++]);}
        return Math.max((max - min), 0);
    }

    public static void main(String[] args) {
        System.out.println(new p63().maxProfit(new int[]{2,1,2,1,0,0,1}));
    }
}
