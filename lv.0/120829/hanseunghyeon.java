class Solution {
    public int solution(int angle) {
        int answer = angle == 90 ? 2 : (angle == 180 ? 4 : (0 < angle && angle < 90 ? 1 : 3));
        return answer;
    }
}