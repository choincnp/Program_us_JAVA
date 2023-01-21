class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        while(true){
            if(M == N){
                answer += M * M - 1;
                break;
            }
            int max = Math.max(M,N);
            int sum = M + N;
            int min = sum - max;
            answer += min * min;
            max -= min;
            M = max;
            N = min;
        }
        return answer;
    }
}