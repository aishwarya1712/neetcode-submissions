class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int startIndex, int endIndex){
        if(startIndex < 0 || endIndex > nums.length){
            return -1;
        }
        if(nums[startIndex] > target){
            return -1;
        }
        if(nums[endIndex] < target){
            return -1;
        }
        int middle = (startIndex + endIndex)/2;
        if(nums[middle] == target){
            return middle;
        } else if(nums[middle] < target){
            return binarySearch(nums, target, middle + 1, endIndex);
        } else if (nums[middle] > target){
            return binarySearch(nums, target, startIndex, middle - 1);
        }
        return -1;
        
    }
}
