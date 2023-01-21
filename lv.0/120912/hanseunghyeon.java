class Solution {
    public int solution(int[] array) {
        String str = "";
        for (int i : array) {
            str += i;
        }
        String[] a = str.replaceAll("[0-6|8-9]"," ").trim().split(" ");

        int answer = 0;
        for (String s : a) {
            answer += s.length();
        }
        return answer;
    }
}