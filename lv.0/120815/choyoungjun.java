class Solution {
    public int solution(int n) {
        int answer = 0;
        int gcd = getGCD(n,6);
        answer = n/gcd;
        return answer;
    }
    public static int getGCD(int a, int b){
        while (b != 0)
        {int r = (int)a%b;
        a = b;
        b = r;}
        return a;                               
    }
}