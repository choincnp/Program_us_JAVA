public class yangyunseon {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = {};
            int a = numer1 * denom2 + numer2 * denom1;
            int b = denom1 * denom2;

            for (int j = a; j > 0; j--){
                if (a % j == 0 && b % j == 0) {
                    a = a / j;
                    b = b / j;
                }
            }
            answer = new int[]{a, b};
            return answer;
        }
    }
}