class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            countMap.put(nums[right], countMap.getOrDefault(nums[right], 0) + 1);
            if (right - left + 1 > k) {
                currentSum -= nums[left];
                countMap.put(nums[left], countMap.get(nums[left]) - 1);
                if (countMap.get(nums[left]) == 0) {
                    countMap.remove(nums[left]);
                }
                left++;
            }
            if (right - left + 1 == k && countMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}
