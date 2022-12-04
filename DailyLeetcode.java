public class DailyLeetcode {
    public static void main(String[] args) {
        
    }
  /// 4-12-22  
    public int minimumAverageDifference(int[] nums) {
  
        int n = nums.length;
        long sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
           
        }
        
        int idx  = 0;
        long minabs = Integer.MAX_VALUE;
        long psum = 0;
        
        for(int i=0; i<n; i++){
            psum +=nums[i];
            long left = psum/(i+1);
            long right = i+1 == n ? 0 : (sum-psum)/(n-i-1);
            long diff = Math.abs(left-right);
            if(diff < minabs){
                minabs = diff;
                idx = i;
            }
        }
        
        return idx;
    }

}
