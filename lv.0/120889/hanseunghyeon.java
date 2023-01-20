class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max,sides[i]);
            sum += sides[i];
        }
        
        return 2 * max < sum ? 1 : 2;
    }
}