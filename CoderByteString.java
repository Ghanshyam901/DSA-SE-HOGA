import java.util.HashSet;
import java.util.Set;

public class CoderByteString {
    public static void main(String[] args) {

    }

    // https://coderbyte.com/editor/Find%20Intersection:Java
    public static String FindIntersection(String[] strArr) {
        Set<String> set = new HashSet();

        String st = strArr[0];
        String[] strarr = st.split("[, . ']+");
        for (int j = 0; j < strarr.length; j++) {
            set.add(strarr[j]);
        }

        StringBuilder sb = new StringBuilder();

        String st2 = strArr[1];
        String[] strar2 = st2.split("[, . ']+");
        for (int i = 0; i < strar2.length; i++) {
            if (set.contains(strar2[i])) {

                sb.append(strar2[i]);
                sb.append(",");
            }
        }

        String ans = sb.toString().substring(0, sb.length() - 1);
        return ans;
    }

    // https://coderbyte.com/editor/Questions%20Marks:Java
    public static String QuestionsMarks(String str) {

        int i = 0;
        while (i != str.length() - 1) {
            if (Character.isDigit(str.charAt(i))) {
                int val = str.charAt(i) - '0';
                // System.out.print(" val - "+ val);
                int count = 0;
                while (!Character.isDigit(str.charAt(i + 1))) {
                    if (str.charAt(i + 1) == '?') {
                        count++;
                    }
                    i++;
                }
                if (Character.isDigit(str.charAt(i + 1))) {
                    int val2 = str.charAt(i + 1) - '0';
                    // System.out.println(" val2 - "+ val2);
                    if (count == 3 && (val + val2) == 10) {
                        return "true";
                    }
                }

            }
            i++;

        }

        return "false";

    }
///https://coderbyte.com/editor/Longest%20Word:Java
    public static String LongestWord(String sen) {

        String ans = "";

        String[] str = sen.split(" ");
        for (int j = 0; j < str.length; j++) {
            String st = str[j];
            int i = 0;
            while (i < st.length()) {
                if (Character.isLetter(st.charAt(i)) || Character.isDigit(st.charAt(i))) {
                    i++;
                    continue;
                } else {
                    break;
                }

            }
            if (i == st.length() && ans.length() < st.length()) {
                ans = st;
            }
        }

        return ans;

    }
}
