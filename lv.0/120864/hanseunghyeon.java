class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int length = my_string.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            char ch = my_string.charAt(i);
            if('0' <= ch && ch <= '9') {        // number
                str += ch;
                if(i == length - 1 && str.length() != 0)
                    answer += Integer.parseInt(str);
                continue;
            }
            if(str.length() != 0){
                answer += Integer.parseInt(str);
                str = "";
            }
        }
        return answer;
    }
}