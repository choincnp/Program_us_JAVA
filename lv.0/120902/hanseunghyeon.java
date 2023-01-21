class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = 0;
        int state = 0;
        while(state != strArr.length){
            if(state == 0){
                answer = strArr[1].equals("+") ? Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]) : Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
                state += 3;
                continue;
            }
            if(strArr[state].equals("+"))
                answer +=Integer.parseInt(strArr[state+1]);
            else
                answer -=Integer.parseInt(strArr[state+1]);
            state += 2;
        }
        return answer;
    }
}
