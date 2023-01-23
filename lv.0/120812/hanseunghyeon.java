import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] countArr = new int[array.length];
        int firstNum = array[0];
        int count = 0;
        for (int i = 0, c = 0; i < array.length; i++) {
            if(array[i] == firstNum){
                count++;
            }else{
                firstNum = array[i];
                countArr[c++] = count;
                count = 1;
            }
            if(i == array.length - 1)
                countArr[c] = count;
        }
        int answer = 0;
        int state = 0;
        int index = 0;

        for (int i = 0; i < countArr.length; i++) {
            answer = Math.max(answer,countArr[i]);
        }

        for (int i = 0; i < countArr.length; i++) {
            state += answer == countArr[i] ? 1 : 0;
            index += state == 0 ? countArr[i] : 0;
        }

        return state == 1 ? array[index] : -1;
    }
}