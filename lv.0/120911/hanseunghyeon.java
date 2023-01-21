class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] chArr = answer.toCharArray();
        java.util.Arrays.sort(chArr);
        answer = String.valueOf(chArr);
        return answer;
    }
}