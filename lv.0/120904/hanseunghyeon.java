class Solution {
    public int solution(int num, int k) {
        String answer = "" + num;
        if(answer.indexOf(k + '0') == -1)
            return -1;
        else
            return answer.indexOf(k + '0') + 1;
    }
}