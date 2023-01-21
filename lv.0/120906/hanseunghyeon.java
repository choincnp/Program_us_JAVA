class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n < 10)
            return n;
        while(n != 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}