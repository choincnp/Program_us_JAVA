class Solution {
    public int solution(int n) {
        int i = 0;
        int ans = 0;
        while(i < n){
            i++;
            ans = i * i;
            if(ans == n)
                return 1;
        }
        return 2;
    }
}