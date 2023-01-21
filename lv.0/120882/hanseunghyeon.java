import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] mean = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            mean[i] = (score[i][0]+score[i][1])/2f;
        }
        double[] copyMean = Arrays.copyOf(mean, mean.length);
        Arrays.sort(copyMean);
        int rank = 0;
        HashMap<Double, Integer> hash = new HashMap<>();
        for (int i = copyMean.length - 1; i > -1 ; i--) {
            rank = i == copyMean.length - 1 ? 1 : (copyMean[i] == copyMean[i+1] ? rank : copyMean.length - i);
            hash.put(copyMean[i], rank);
        }
        for (int i = 0; i < mean.length; i++) {
            answer[i] = hash.get(mean[i]);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}