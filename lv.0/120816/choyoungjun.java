class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        double pan = (double)n/slice;
        answer = (int)Math.ceil(pan);
        return answer;
    }
}