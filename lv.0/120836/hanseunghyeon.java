class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            answer += n % i == 0 ? 1 : 0;
        }
        return answer;
    }
}