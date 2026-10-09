class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}
/*
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if (nums[mid] > mid) {  
                high = mid; 
            } 
            else {
                low = mid + 1; 
            }
        }
        return low;
    }
}
*/
