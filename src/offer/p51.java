package offer;

public class p51 {
    public int reversePairs(int[] nums) {
        int len=nums.length;
        if(len<=1){return 0;}
        int[]  temp=new int[len];
        return sort(nums,0,len-1,temp);
    }

    public int sort(int[] nums,int left,int right,int[] temp){
        if(left==right){return 0;}
        int mid=left+(right-left)/2;
        int leftPairs=sort(nums, left, mid, temp);
        int rightPairs=sort(nums,mid+1,right,temp);
        if(nums[mid]<=nums[mid+1]){return leftPairs+rightPairs;}
        int crossPairs=mergeAndCount(nums, left, mid, right, temp);
        return leftPairs+rightPairs+crossPairs;
    }
    public int mergeAndCount(int[] nums,int left,int mid,int right,int[] temp){
        
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int count=0;
        int i=left;
        int j=mid+1;
        for (int k = left; k <= right; k++) {
            if(i==mid+1){
                nums[k]=temp[j];
                j++;

            }else if(right+1==j){
                nums[k]=temp[i];
                i++;
            }else            if(temp[i]<=temp[j]){
                nums[k]=temp[i];
                i++;
            }else {
                nums[k]=temp[j];
                j++;
                count+=(mid-i+1);

            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(new p51().reversePairs(new int[]{7,5,6,4}));
        System.out.println(new p51().reversePairs(new int[]{1,3,4,2,5}));
        System.out.println(new p51().reversePairs(new int[]{5,4,3,2,1}));
    }
}