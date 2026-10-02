class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int vowels=0;
        int maxVowels=0;
        for(int end=0;end<s.length();end++){
        //Expand
            if(isVowel(s.charAt(end))){
                vowels++;
            }
            //Shrink
            if(end>=k-1){
                maxVowels=Math.max(maxVowels,vowels);
                if(isVowel(s.charAt(start))){
                    vowels--;
            }
            start++;
            }
        }
        return maxVowels;
    }
    private boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
