import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] distance = new int[numlist.length];
        Integer[] ans = new Integer[numlist.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            distance[i] = Math.abs(n - numlist[i]);
            list.add(distance[i]);
        }
        Arrays.sort(distance);
        for (int i = 0; i < answer.length; i++) {
            if(Arrays.asList(ans).contains(numlist[list.lastIndexOf(distance[i])])){
                answer[i] = numlist[list.indexOf(distance[i])];
                ans[i] = numlist[list.indexOf(distance[i])];
            }
            else{
                answer[i] = numlist[list.lastIndexOf(distance[i])];
                ans[i] = numlist[list.lastIndexOf(distance[i])];
            }
        }
        return answer;
    }
}