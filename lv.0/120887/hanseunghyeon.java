class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] arr = new String[j-i+1];
        for (int l = i, c = 0; l < j+1; l++, c++) {
            arr[c] = "" + l;
        }

        for (String s : arr) {
            char[] chArr = s.toCharArray();
            for (int l = 0; l < chArr.length; l++) {
                if(chArr[l] == (char)(k + '0'))
                    answer += 1;
            }
        }
        return answer;
    }
}