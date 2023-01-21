class Solution {
    public int solution(int n, int t) {
        while(t != 0){
            t--;
            n *= 2;
        }
        return n;
    }
}