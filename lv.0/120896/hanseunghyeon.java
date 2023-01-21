class Solution {
    public String solution(String s) {
        String answer = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if(s.indexOf(i) == -1 || s.indexOf(i) != s.lastIndexOf(i))   // 미포함 || 문자 두 개이상
                continue;
            else
                answer += i;
        };
        return answer;
    }
}