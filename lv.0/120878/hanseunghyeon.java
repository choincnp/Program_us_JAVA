class Solution {
    public int solution(int a, int b) {     // b가 분모
        int i = 1;
        while(true){
            i++;
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                i = 1;
                continue;
            }
            if(a < i && b < i)
                break;
        }
        while(true){
            if(b % 2 == 0){
                b /= 2;
                continue;
            }else if(b % 5 == 0){
                b /= 5;
                continue;
            }
            break;
        }

        return b == 1 ? 1 : 2;
    }
}