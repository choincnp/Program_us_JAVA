import java.util.*;

class Solution {
    public int solution(int n) {
        List<String> list = new ArrayList<>();
        String[] numList = new String[200];
        for (int i = 1; i < numList.length; i++) {
            numList[i] = "" + i;
        }
        for (int i = 1; i < numList.length; i++) {
            if(i % 3 == 0 || numList[i].contains("3"))
                continue;
            list.add(numList[i]);
        }
        int answer = Integer.parseInt(list.get(n-1));
        return answer;
    }
}