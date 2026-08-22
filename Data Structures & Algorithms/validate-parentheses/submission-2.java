class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                switch(c) {
                    case ')':
                        if (stack.size() == 0 || stack.pop() != '('){
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.size() == 0  || stack.pop() != '{'){
                            return false;
                        } 
                        break;
                    case ']':
                        if (stack.size() == 0 || stack.pop() != '['){
                            return false;
                        }
                        break;
                    default:
                        break;
                }
            }
            
            
        System.out.println("Current stack is: " + stack.toString());
        }
        System.out.println("Stack is: " + stack.toString());
        return stack.size() == 0;
    }
}
