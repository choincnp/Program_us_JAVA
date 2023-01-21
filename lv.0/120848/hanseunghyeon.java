class Solution {
    public int solution(int n) {
        int temp = 1;
        for (int i = 1; i < 11; i++) {  // 1 ~ 10
            for (int j = 1; j < i+1; j++) {     // 1 ~ i
                temp *= j;
            }       // i 팩토리얼 완성
            if(temp == n)
                return i;
            else if(temp > n)
                return i - 1;
            temp = 1;
        }
        return -1;
    }
}