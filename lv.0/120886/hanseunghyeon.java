class Solution {
    public int solution(String before, String after) {
        int[] state = new int[before.length()];
        for (int i = 0; i < before.length(); i++) {     // before 문자
            for (int j = 0; j < after.length(); j++) {      //   after 문자
                if(before.charAt(i) == after.charAt(j) && state[j] == 0){
                    state[j] = 1;
                    break;
                }
                if(j == after.length()-1)
                    return 0;
            }
        }
        return 1;
    }
}