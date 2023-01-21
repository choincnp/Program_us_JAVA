class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = -1;
        int count = 0;
        int column = -1;
        int row = 0;
        while(index != num_list.length - 1){
            index++;
            count++;
            column++;
            answer[row][column] = num_list[index];
            if(count == n){
                count = 0;
                column = -1;
                row += 1;
            }
        }
        return answer;
    }
}