class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            try {
                // every time you see a number, add it to the stack!
                Integer num = Integer.parseInt(tokens[i]);
                stack.push(num);
            } catch (NumberFormatException e){
                String operand = tokens[i];
                // If its not a number it's an operand.
                int num1 = stack.pop();
                int num2 = stack.pop();
                int res;
                if(operand.equals("*")){
                    res = num1 * num2;
                } else if(operand.equals("+")){
                    res = num1 + num2; 
                } else if(operand.equals("/")){
                    res = num2 / num1;
                } else {
                    // operand is "-"
                    res = num2 - num1;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
}
