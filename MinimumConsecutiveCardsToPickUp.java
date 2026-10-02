class Solution {
    public int minimumCardPickup(int[] cards) {
        int start=0;
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        int minLength=Integer.MAX_VALUE;
        for(int end=0;end<cards.length;end++){
            int curr=cards[end];
            frequencyMap.put(curr,frequencyMap.getOrDefault(curr,0)+1);
            while(frequencyMap.get(curr)==2){
                minLength=Math.min(minLength,end-start+1);
                frequencyMap.put(cards[start],frequencyMap.get(cards[start])-1);
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE ? -1 :minLength;
    }
}
