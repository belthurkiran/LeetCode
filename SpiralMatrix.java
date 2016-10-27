public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length;
        if(m<1){
            return result;
        }
        int n = matrix[0].length;
        int row =0;
        int col=0;
        int rowEnd=m;
        int colEnd=n;
        while(row<=rowEnd-1 && col <=colEnd-1){
            for(int j=col;j<colEnd;j++){
                result.add(matrix[row][j]);
            }
            row++;
            for(int i=row;i<rowEnd;i++){
                result.add(matrix[i][colEnd-1]);
            }
            colEnd--;
            if(row<=rowEnd-1){
            for(int j=colEnd-1;j>=col;j--){
                result.add(matrix[rowEnd-1][j]);
            }
            }
            rowEnd--;
            if(col<=colEnd-1){
            for(int i=rowEnd-1;i>=row;i--){
                result.add(matrix[i][col]);
            }
            }
            col++;
        }
        return result;
    }
}
