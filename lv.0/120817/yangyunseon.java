public class yangyunseon {
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            for(int i : numbers)
                answer +=i;
            answer = answer/numbers.length;
            return answer;
        }
    }
}
