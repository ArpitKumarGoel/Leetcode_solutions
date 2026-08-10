class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        
        for (int candy : aliceSizes) sumA += candy;
        for (int candy : bobSizes) sumB += candy;
        
        int delta = (sumB - sumA) / 2;
        
        Set<Integer> bobSet = new HashSet<>();
        for (int candy : bobSizes) {
            bobSet.add(candy);
        }
        
        for (int x : aliceSizes) {
            int targetY = x + delta;
            if (bobSet.contains(targetY)) {
                return new int[]{x, targetY};
            }
        }
        
        return new int[0];
    }
}
