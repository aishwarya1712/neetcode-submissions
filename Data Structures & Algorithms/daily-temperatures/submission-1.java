class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(stack.isEmpty() || stack.peek() == null || (stack.peek() != null && stack.peek()[0] >= temperatures[i])){
                stack.push(new int[]{temperatures[i], i});
            } else {
                // compare current element with last element in the stack
                while(!stack.isEmpty()){
                    if(temperatures[i] > stack.peek()[0]){
                        // then this is the next warmest day
                        int[] pair = stack.pop();
                        result[pair[1]] = i - pair[1];
                    } else {
                        break;
                    }
                }
                stack.push(new int[]{temperatures[i], i});
            }
        }
        return result;
    }
}
