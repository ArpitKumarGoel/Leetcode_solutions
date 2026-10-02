class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int windowSum=0;
        int minLength=Integer.MAX_VALUE;
        for(int high=0;high<nums.length;high++){
            windowSum+=nums[high];
            while(windowSum>=target){
                minLength=Math.min(minLength,high-low+1);
                windowSum-=nums[low];
                low++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0 : minLength; 
    }
}
