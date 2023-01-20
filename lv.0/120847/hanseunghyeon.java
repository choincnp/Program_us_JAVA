class Solution {
    public int solution(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}
