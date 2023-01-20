class Solution {
    public int[] solution(int n) {
        int[] answer = n % 2 == 0 ? new int[n/2] : new int[n/2 + 1];
        int i = 0;
        int num = 1;

        while(true){
            if(num > n){
                break;
            }
            answer[i] = num;
            i++;
            num += 2;
        }
        return answer;
    }
}
