class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] aArr = A.toCharArray();
        char[] bArr = B.toCharArray();
        char tmp = ' ';
        for (int i = 0; i < aArr.length; i++) {
            for (int j = 0; j < bArr.length; j++) {
                if(aArr[j] != bArr[j]){
                    break;
                }
                if(j == bArr.length - 1)
                    return answer;
            }
            answer++;
            tmp = bArr[0];
            for (int j = 0; j < bArr.length; j++) {
                bArr[j] = j == bArr.length - 1 ? tmp : bArr[j+1];
            }
        }
        return -1;
    }
}