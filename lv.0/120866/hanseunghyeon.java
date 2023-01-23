class Solution {
    public int solution(int[][] board) {
        int length = board.length;;
        int[][] expandedBoard = new int[length+2][length+2];
        // 확장된 board 배열에 값 입력
        for (int i = 1; i < length+1; i++) {
            for (int j = 1; j < length+1; j++) {
                expandedBoard[i][j] = board[i-1][j-1];
            }
        }
        // 값 중에서 1을 찾고 찾으면 주위 값 2로 변경
        for (int i = 1; i < length+1; i++) {
            for (int j = 1; j < length+1; j++) {
                if(expandedBoard[i][j] == 1){
                    for (int k = i-1; k < i+2; k++) {
                        for (int l = j-1; l < j+2; l++) {
                            if(expandedBoard[k][l] == 0)
                                expandedBoard[k][l] = 2;
                        }
                    }
                }
            }
        }
        // 0 개수 반환
        int answer = 0;
        for (int i = 1; i < length+1; i++) {
            for (int j = 1; j < length+1; j++) {
                answer += expandedBoard[i][j] == 0 ? 1 : 0;
            }
        }
        return answer;
    }
}