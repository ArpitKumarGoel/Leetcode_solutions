class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int currentNumber=0;
        char operation='+';
        int len=s.length();

        for(int i=0;i<len;i++){
            char currentChar=s.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNumber=(currentNumber*10)+(currentChar-'0');
            }
            if (!Character.isDigit(currentChar) && currentChar != ' ' || i == len - 1){
                if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}
