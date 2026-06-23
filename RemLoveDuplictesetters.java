import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        // 1. Saare characters ka count store karne ke liye
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // 2. Track karne ke liye ki character stack mein hai ya nahi
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Current character ka count decrease karein kyunki hum ise process kar rahe hain
            count[ch - 'a']--;
            
            // Agar character already stack mein hai, toh skip karein
            if (visited[ch - 'a']) {
                continue;
            }
            
            // Stack ke top elements ko pop karein agar woh current char se bade hain
            // aur aage string mein dobara mil sakte hain
            while (!stack.isEmpty() && stack.peek() > ch && count[stack.peek() - 'a'] > 0) {
                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }
            
            // Current character ko stack mein daalein
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        
        // Stack se string banayein
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
