class Solution {
    public int solution(int[][] lines) {
        int start = Math.min(lines[0][0],Math.min(lines[1][0],lines[2][0]));
        int end = Math.max(lines[0][1],Math.max(lines[1][1],lines[2][1]));
        int height = 0;
        int answer = 0;
        for (int i = start - 1; i < end + 1; i++) {
            // i 값과 lines[i][0](start)이 일치하면 height + 1
            for (int j = 0; j < lines.length; j++) {
                if(lines[j][0] == i)
                    height++;
            }
            // i 값과 lines[i][1](end)이 일치하면 height - 1
            for (int k = 0; k < lines.length; k++) {
                if(lines[k][1] == i)
                    height--;
            }
            if(height > 1)
                answer++;
            // height가 1보다 크면 길이 +1
        }
        return answer;
    }
}