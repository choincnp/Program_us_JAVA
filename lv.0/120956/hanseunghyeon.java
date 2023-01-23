class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya","ye","woo","ma"};
        for (String bab : babbling) {
            String test = bab;
            for (String pos : possible) {
                test = test.replace(pos,"-");
            }
            test = test.replace("-","");
            answer += test.equals("") ? 1 : 0;
        }
        return answer;
    }
}