class Solution {
    public String[] solution(String my_str, int n) {
        int answerLength = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[answerLength];
        for (int i = 0, start = 0, end = n; i < answerLength; i++) {
            if(end > my_str.length())
                end = my_str.length();
            answer[i] = my_str.substring(start,end);
            start += n;
            end += n;
        }
        return answer;
    }

}