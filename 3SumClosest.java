class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closesetSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currentSum) < Math.abs(target-closesetSum)){
                    closesetSum=currentSum;
                }
                if (currentSum < target) {
                    left++; // Sum badhao
                } else if (currentSum > target) {
                    right--; // Sum kam karo
                } else {
                    return currentSum; // Exact target mil gaya
                }
            }
        }
        return closesetSum;
    }
}
