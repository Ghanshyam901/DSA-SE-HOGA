import java.util.HashSet;
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
}