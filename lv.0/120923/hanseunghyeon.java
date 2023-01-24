class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // num이 홀순지 짝순지 판단
        if(num % 2 != 0){
            // 홀수면 처음값 구하고 나머지 대입
            int oddFirstNum = total / num - num / 2;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = oddFirstNum++;
            }
        }else{
            // 짝수면 처음값 구하고 나머지 대입
            int evenFirstNum = (total + num / 2) / num - num / 2;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = evenFirstNum++;
            }
        }
        return answer;
    }
}