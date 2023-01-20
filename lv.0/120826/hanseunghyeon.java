class Solution {
    public String solution(String my_string, String letter) {
        char[] charArr = my_string.toCharArray();
        String answer = "";
        for (int i = 0; i < charArr.length; i++) {
            if((charArr[i] + "").equals(letter)){
                continue;
            }
            answer += "" + charArr[i];
        }
        return answer;
    }
}