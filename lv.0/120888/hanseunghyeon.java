class Solution {
    public String solution(String my_string) {
        char[] chArr = my_string.toCharArray();
        String answer = "" + chArr[0];
        for (int i = 0; i < chArr.length; i++) {
            if(answer.indexOf(chArr[i]) == -1)
                answer += chArr[i];
        }
        return answer;
    }
}