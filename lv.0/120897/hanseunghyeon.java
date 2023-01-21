class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += n % (i + 1) == 0 ? 1 : 0 ;
        }
        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < n; i++) {
            if(n % (i + 1) == 0){
                answer[count++] = i+1;
            }
        }
        return answer;
    }
}