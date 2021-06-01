package offer;

public class p56 {
    public int[] singleNumbers(int[] nums) {
        int x=0;
        for (int i : nums) {
            x^=i;
        }
        int div=1;
        while((div&x)==0){
            div<<=1;
        }
        int a=0,b=0;
        for (int i : nums) {
            if((div&i)!=0){
                a^=i;
            }else{
                b^=i;
            }
        }
        return new int[]{a,b};
    }
}