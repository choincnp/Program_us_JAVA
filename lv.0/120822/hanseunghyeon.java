class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        for (int i = len-1; i > -1 ; i--) {
            answer += my_string.charAt(i)+"";
        }
        return answer;
    }
}
