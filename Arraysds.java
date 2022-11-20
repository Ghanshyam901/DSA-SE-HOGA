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
}