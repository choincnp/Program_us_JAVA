class Solution {
    public long solution(int balls, int share) {
        int[] nP = new int[balls-share];
        int[] n_m = new int[balls-share];
        for (int i = 0; i < nP.length; i++) {     // m까지 약분
            nP[i] = i+share+1;
        }   // nP 배열

        for (int i = 0; i < n_m.length; i++) {
            n_m[i] = i+1;
        }   // n_m 배열

        for (int i = 0; i < n_m.length; i++) {
            for (int j = 0; j < nP.length; j++) {
                if(nP[j] % n_m[i] == 0){
                    nP[j] = nP[j] / n_m[i];
                    n_m[i] = 1;
                    break;
                }
            }
        }

        long answer = 1;
        for (int i : nP) {
            answer *= i;
        }
        System.out.println(answer);
        for (int i : n_m) {
            answer /= i;
        }
        return answer;
    }
}