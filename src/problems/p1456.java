package problems;

public class p1456 {

    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count = 0;
        while (right < s.length()) {
            char temp = s.charAt(right);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
            }
            right++;
            if (right - left == k) {
                max = Math.max(max, count);
                char c = s.charAt(left);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count--;
                }
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(new p1456().maxVowels(s, 3));

    }
}
