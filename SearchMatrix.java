public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = findRow(matrix,0,n-1,target);
        boolean isPresent = findElementInRow(matrix,row,0,matrix[row].length-1,target);
        return isPresent;
        
    }
    private boolean findElementInRow(int[][] matrix,int row,int low,int high,int target){
        while(low<high){
            int mid=low+((high-low)/2);
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (matrix[row][low]==target);
    }
    private int findRow(int[][] matrix,int low,int high,int target){
        while(low<high){
            int mid=low+((high-low)/2);
            if(matrix[mid][0]==target){
                return mid;
            }
            if(matrix[mid][0]<target && matrix[mid+1][0]>target){
                return mid;
            }
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
