class Solution {
    public String solution(int age) {
        String strAge = "" + age;
        String answer = "";
        for (int i = 0; i < strAge.length(); i++) {
            answer += (char)(strAge.charAt(i) + 49);
        }
        return answer;
    }
}