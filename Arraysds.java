import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Arraysds{
    public static void main(String[] args) {
        
    }
    // https://leetcode.com/problems/longest-consecutive-sequence/solution/

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return 1;
        
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        
        int ans = 1;
        int count = 1;
        
        for(int num : set){
            if(!set.contains(num-1)){
                count = 1;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
        
    }

    // https://leetcode.com/problems/set-matrix-zeroes/submissions/
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int [] dr = new int [n];
        int [] dc = new int[m];
        // Arrays.fill(dr,-1);
        // Arrays.fill(dc,-1);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    dr[i] = -1;
                    dc[j] = -1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dr[i] == -1 || dc[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
                
    }

    //  https://leetcode.com/problems/rotate-image/submissions/

    public void rotate(int[][] matrix) {
        
        // transpose
        for(int i=0; i<matrix.length; i++){
            for(int j =i; j<matrix[0].length; j++){
                // int temp = 0;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // reverse each row
        int n = matrix.length;
        
        for(int i=0; i<matrix.length; i++)// transpose{
            for(int j=0; j<matrix.length/2; j++){
                 int temp=0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }



        //https://leetcode.com/problems/spiral-matrix/submissions/

        public List<Integer> spiralOrder(int[][] matrix) {
        
            List<Integer> list = new ArrayList<>();
            int row = matrix.length;
            int col = matrix[0].length;
            
            int left =0;
            int right =col-1;
            int top =0;
            int bottom = row-1;
            
            while(left <= right && top <=bottom){
                
                for(int i = left; i<=right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
                
                for(int i = top; i<=bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
                
                if(top <= bottom){
                    for(int i=right; i>=left; i--){
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(left <= right){
                    for(int i=bottom; i>=top; i--){
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return list;
        }

        //https://leetcode.com/problems/pascals-triangle/submissions/

        public List<List<Integer>> generate(int n) {
        
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> row = null;
            List<Integer> prev = null;
            
            for(int i=0; i<n; i++){
                row = new ArrayList<>();
                for(int j=0; j<=i; j++){
                    if(j == 0 || j == i){
                        row.add(1);
                    }else{
                       row.add(prev.get(j-1)+prev.get(j));
                    }
                }
                
                prev =row;
                list.add(row);
            }
            return list;
            
        }
    }
