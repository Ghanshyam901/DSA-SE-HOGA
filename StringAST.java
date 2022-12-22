import java.util.Scanner;
import java.util.Stack;

public class StringAST {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        String ans = Solution(num);
        System.out.println("ans- " + ans);

    }

    public static String Solution(int num) {
        StringBuilder sb = new StringBuilder();
        String st = String.valueOf(num);
        Stack<Integer> stack = new Stack<>();

        int num1 = st.charAt(0) - '0';

        for (int i = st.length() - 1; i > 0; i--) {
            stack.push(st.charAt(i) - '0');
        }
        sb.append(num1);
        if (stack.size() == 0) {
            return sb.toString();
        }
        int prev = num1;
        while (stack.size() != 0) {
            if (prev % 2 == 0 && stack.peek() % 2 == 0) { /// even
                sb.append("*");
            } else if (prev % 2 != 0 && stack.peek() % 2 != 0) { // odd
                sb.append("-");
            }
            prev = stack.pop();
            sb.append(prev);
        }

        return sb.toString();
    }
}
