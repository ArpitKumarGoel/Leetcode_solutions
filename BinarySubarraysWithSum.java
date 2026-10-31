class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    private int atMost(int[] nums,int k){
        if(k<0){
            return 0;
        }
        int start=0;
        int currentSum=0;
        int count=0;
        for(int end=0;end<nums.length;end++){
            currentSum+=nums[end];
            while(currentSum>k){
                currentSum-=nums[start];
                start++;
            }
         count+=(end-start+1);
        }
        return count;
    }
}
