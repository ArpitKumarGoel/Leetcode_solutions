import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*n;i++){
            int arr=i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[arr]){
                int prev=st.pop();
                ans[prev]=nums[arr];
            }
            if(i<n){
                st.push(arr);
            }
        }
        return ans;
    }
}
