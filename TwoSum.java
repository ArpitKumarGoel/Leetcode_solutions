class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    ans=new int[]{i,j};
                    break;
                }
            }
        }
        return ans;
    }
}
