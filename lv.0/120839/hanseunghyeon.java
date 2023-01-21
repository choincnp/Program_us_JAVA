class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            int ch = rsp.charAt(i);
            if(ch == '2')
                answer += 0;
            else if(ch == '0')
                answer += 5;
            else
                answer += 2;
        }
        return answer;
    }
}