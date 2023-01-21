class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        int before = 0;
        int answer = 0;
        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i].equals("Z") ? -1 * before : Integer.parseInt(strArr[i]);
            before = strArr[i].equals("Z") ? before  : Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}