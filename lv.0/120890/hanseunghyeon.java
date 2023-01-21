class Solution {
    public int solution(int[] array, int n) {
        int minus = 101;
        int answer = 0;
        java.util.Arrays.sort(array);
        for (int i : array) {
            if(Math.abs(n - i) < minus){
                minus = Math.abs(n - i);
                answer = i;
            }
        }
        return answer;
    }
}