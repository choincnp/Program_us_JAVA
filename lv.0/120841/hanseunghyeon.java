class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer = 0;
        if(x > 0)
            return y > 0 ? 1 : 4;
        else
            return y > 0 ? 2 : 3;
    }
}