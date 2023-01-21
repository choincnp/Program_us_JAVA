import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedArr = Arrays.copyOf(emergency,emergency.length);
        HashMap<Integer,Integer> hash = new HashMap<>();
        Arrays.sort(sortedArr);

        for (int i = sortedArr.length, c=0; i > 0; i--, c++) {
            hash.put(sortedArr[c],i);
        }

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = hash.get(emergency[i]);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}