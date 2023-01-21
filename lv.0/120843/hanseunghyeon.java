class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        for (int i = 0; i < k-1; i++) {   // k - 1번 던짐
            index += 2;
            if(index > numbers.length - 1)
                index -= numbers.length;
        }
        return numbers[index];
    }
}