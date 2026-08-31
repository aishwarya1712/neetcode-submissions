class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int startIndex = 0;
        int endIndex = (numRows * numCols) - 1;

        while(startIndex <= endIndex){
            int mid = startIndex + ((endIndex - startIndex)/2);

            int i = mid / numCols;
            int j = mid % numCols;

            if(matrix[i][j] == target){
                return true;
            } else if(matrix[i][j] > target){
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }

        }
        return false;
        
    }
}