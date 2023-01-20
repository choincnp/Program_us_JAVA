class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i< n/2; i++){
            num += 2;
            answer += num;
        }
        return answer;
    }
}