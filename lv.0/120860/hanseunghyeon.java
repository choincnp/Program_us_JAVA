class Solution {
    public int solution(int[][] dots) {
        int len1 = 0;
        int len2 = 0;
        for (int i = 0; i < 3; i++) {
            len1 = dots[i][0] - dots[i+1][0] == 0 ? len1 : Math.abs(dots[i][0] - dots[i+1][0]);
            len2 = dots[i][1] - dots[i+1][1] == 0 ? len1 : Math.abs(dots[i][1] - dots[i+1][1]);
        }
        return len1 * len2;
    }
}