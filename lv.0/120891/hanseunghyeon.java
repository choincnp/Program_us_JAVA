class Solution {
    public int solution(int order) {
        char[] chArr = String.valueOf(order).toCharArray();
        int answer = 0;
        for (char c : chArr) {
            if(c == '3' || c == '6' || c == '9')
                answer++;
        }
        return answer;
    }
}