public class yangyunseon {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for(int i = 0; i < strlist.length; i++){
                String[] arr = strlist[i].split("");
                answer[i] = arr.length;
            }
            return answer;
        }
    }
}
