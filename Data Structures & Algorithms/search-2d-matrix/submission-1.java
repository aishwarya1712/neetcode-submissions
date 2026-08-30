class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force: check every cell. how does that work?
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
