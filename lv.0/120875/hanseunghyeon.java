class Solution {
    public int solution(int[][] dots) {
        // 기울기 저장 arr
        double[] arr1 = new double[3];
        double[] arr2 = new double[3];
        // [0,1] [0,2] [0,3] 기울기 저장
        for (int i = 1; i < 4; i++) {
            arr1[i-1] = (dots[0][1] - dots[i][1]) / (double)(dots[0][0] - dots[i][0]);
        }
        // [3,2] [3,1] [1,2] 기울기 저장
        arr2[0] = (dots[3][1] - dots[2][1]) / (double)(dots[3][0] - dots[2][0]);
        arr2[1] = (dots[3][1] - dots[1][1]) / (double)(dots[3][0] - dots[1][0]);
        arr2[2] = (dots[2][1] - dots[1][1]) / (double)(dots[2][0] - dots[1][0]);
        // 기울기 비교
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != 0 && arr1[i] == arr2[i]){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}