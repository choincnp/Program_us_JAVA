class Solution {
    public long solution(String numbers) {
        String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] numArr = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i = 0; i < strArr.length; i++) {
            numbers = numbers.replaceAll(strArr[i],numArr[i]);
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}