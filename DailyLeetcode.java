class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

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

    // 6-12-22

    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummyodd = new ListNode(-1);
        ListNode evenNode = new ListNode(-1);

        ListNode oddTail = dummyodd;
        ListNode evenTail = evenNode;

        ListNode curr = head;
        int i = 1;

        while(curr != null){
            if(i % 2 != 0){
                oddTail.next = curr;
                oddTail = oddTail.next;
            }else{
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
            curr = curr.next;
            i++;
        }

        oddTail.next = null;
        evenTail.next = null;
        oddTail.next = evenNode.next;

    return dummyodd.next;


    }

}
