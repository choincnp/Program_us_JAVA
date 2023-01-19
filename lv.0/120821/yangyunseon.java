public class yangyunseon {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = {};
            int temp = 0;
            for(int i = 0; i<num_list.length/2; i++){
                temp = num_list[i];
                num_list[i] = num_list[num_list.length-1-i];
                num_list[num_list.length-1-i] = temp;
            }
            answer = num_list;
            return answer;
        }
    }
}
