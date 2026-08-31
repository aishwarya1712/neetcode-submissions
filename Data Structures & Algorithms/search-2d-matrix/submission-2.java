class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force: check every cell. how does that work?
        // first find the row it belongs to by doing binary search on the first column
        // for example: if the value is 8 - it's between 1 and 10, so first row

        // then find the column it belongs to by doing binary search on the row
        int row = bs_row(matrix, 0, matrix.length - 1, target);
        System.out.println("Answer is in row: " + row);
        if(row == -1){
            return false;
        }
        return bs_col(matrix, row, 0, matrix[0].length - 1, target);
    }

    public int bs_row(int[][] matrix, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int midRow = start + ((end - start)/2);
        if(target >= matrix[midRow][0] && target <= matrix[midRow][matrix[0].length - 1]){
            return midRow;
        }
        else if(target > matrix[midRow][matrix[0].length - 1]){
            return bs_row(matrix, midRow + 1, end, target);
        } else {
            return bs_row(matrix, start, midRow-1, target);
        }
    }

        private boolean bs_col(int[][] matrix, int row, int start, int end, int target){
            if(start > end){
                return false;
            }
            int midCol = start + ((end-start)/2);
            if(matrix[row][midCol] == target){
                return true;
            }
            else if(matrix[row][midCol] < target){
                return bs_col(matrix, row, midCol + 1, end, target);
            } else {
                return bs_col(matrix, row, start, midCol -1, target);
            }
        }

        
    }

