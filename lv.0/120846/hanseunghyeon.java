class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 2; j < i; j++) {// 1, 자신 제외
                if(i % j == 0){
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}