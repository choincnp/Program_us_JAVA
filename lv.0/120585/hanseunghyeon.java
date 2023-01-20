import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
             if(array[i]>height)
                 return array.length - i;
        }
        return 0;
    }
}