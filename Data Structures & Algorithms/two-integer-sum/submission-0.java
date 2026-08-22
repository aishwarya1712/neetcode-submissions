class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force - have two loops i and j, check nums[i] + nums[j] = target O(N^2)


        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
