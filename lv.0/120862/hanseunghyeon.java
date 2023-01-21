class Solution {
    public int solution(int[] numbers) {
        int leng = numbers.length;
        java.util.Arrays.sort(numbers);

        return numbers[0] * numbers[1] > numbers[leng-1] * numbers[leng-2] ? numbers[0] * numbers[1] : numbers[leng-1] * numbers[leng-2];
    }
}