import java.util.*;

class Solution {
    public int[] solution(int n) {
        int num = 1;
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            num++;
            if(n % num == 0){   // 나누어 떨어짐
                n /= num;
                set.add(num);
                num = 1;
            }
        }
        Integer[] intArr = set.toArray(new Integer[0]);
        int[] answer = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            answer[i] = intArr[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}