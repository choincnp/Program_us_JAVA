class Solution {
    public int solution(int n) {
        int answer = 1;
        if (n % 6 == 0)
            return n / 6;
        else if(n < 6 && 6 % n == 0)
            return 1;
        while(true){
            answer++;
            if(6 * answer % n == 0)
                return answer;
        }
    }
}
