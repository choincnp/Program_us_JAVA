import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i : numlist) {
            if(i % n == 0)
                arrList.add(new Integer(i));
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = Integer.valueOf(arrList.get(i));
        }
        return answer;
    }
}