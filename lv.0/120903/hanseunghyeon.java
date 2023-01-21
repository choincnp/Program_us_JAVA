class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String s3 : s2) {
                if(s.equals(s3)){
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}