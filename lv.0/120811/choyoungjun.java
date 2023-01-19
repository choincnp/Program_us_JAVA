class Solution {
    public int solution(int[] array) {
        int tmp = 0;
        for (int k=0;k<array.length-1;k++){
        for (int i=0;i<array.length-k-1;i++){
                if (array[i]>array[i+1]){
                    tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                }
        }
        }
        int answer = array[array.length/2];
        return answer;
    }
}