class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double maxAverage=-Double.MAX_VALUE;
        int sum=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            if((end-start+1)==k){
                maxAverage=Math.max(maxAverage,((double)sum/k));
                sum-=nums[start];
                start++;
            }
        }
        return maxAverage;
    }
}
