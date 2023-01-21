class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 대소비교
        int maxValue = sides[0] == sides[1] ? sides[0] : Math.max(sides[0], sides[1]);
        int sum = sides[0] + sides[1];
        int minValue = sum - maxValue;
        // x가 제일 긴 변인 경우
        for (int i = maxValue; i < sum; i++) {
            answer += 1;
        }
        // 배열의 값이 가장 긴 경우 (maxValue)
        for (int i = maxValue - minValue + 1; i <= maxValue; i++) {
            answer += 1;
        }
        return --answer;
    }
}