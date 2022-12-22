import java.util.Stack;

// https://leetcode.com/problemset/all/?difficulty=Easy

public class leetcodeEasy {
    public static void main(String[] args) {
        
    }
    // https://leetcode.com/problems/longest-common-prefix/description/
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int minLength = strs[0].length();
        for(int i=0; i<strs.length; i++){
            minLength = Math.min(minLength , strs[i].length());
        }

       for(int i=0; i<minLength; i++){
           char ch = strs[0].charAt(i);
        for(String str : strs){
            if(str.charAt(i) != ch){
                return sb.toString();
            }
         }
         sb.append(ch);
       }
       return sb.toString();
    }
    ///https://leetcode.com/problems/valid-parentheses/description/
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(')');
            }else if(s.charAt(i) == '{'){
                st.push('}');
            }else if(s.charAt(i) == '['){
                st.push(']');
            }else if(st.isEmpty() || st.pop() != s.charAt(i)){
                return false;
            }
        }
        return st.isEmpty();
    }
    // https://leetcode.com/problems/merge-two-sorted-lists/description/

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2= l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null){
            while(l1 != null){
                curr.next = l1;
                l1= l1.next;
                curr = curr.next;
            }
        }

        
        if(l2 != null){
            while(l2 != null){
                curr.next = l2;
                l2= l2.next;
                curr = curr.next;
            }
        }

        return dummyNode.next;
    }
    ///https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    //https://leetcode.com/problems/remove-element/description/

    public int removeElement(int[] nums, int val) {
        
        int i=0;
        for(int j=0; j<nums.length; j++){
           if(nums[j] != val){
               nums[i] = nums[j];
               i++;
           }
        }
        return i;
    }
    // https://leetcode.com/problems/length-of-last-word/description/
    public int lengthOfLastWord(String s) {
        String[] st = s.split("[, . ']+");
        return st[st.length-1].length();
    }
    //https://leetcode.com/problems/plus-one/description/

    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }

        int [] newArr = new int [digits.length+1];
        newArr[0] =1;
        return newArr;
    }

    
}
