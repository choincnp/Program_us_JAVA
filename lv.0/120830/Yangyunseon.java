public class Yangyunseon {
    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            answer = n*12000 - n/10*2000 + k*2000;
            return answer;
        }
    }
}
