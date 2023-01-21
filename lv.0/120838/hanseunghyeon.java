class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] strArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : strArr) {
            for (int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])){
                    answer += (char)(i + 97);
                    break;
                }
            }
        }
        return answer;
    }
}