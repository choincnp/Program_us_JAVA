import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int num = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ('0' <= ch && ch <= '9')
                num += 1;
        }
        int[] answer = new int[num];
        for (int i = 0, c = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ('0' <= ch && ch <= '9')
                answer[c++] = ch - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}