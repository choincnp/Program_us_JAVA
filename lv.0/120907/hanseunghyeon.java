class NumberCalculation {
    int numSum(String num1, String operator, String num2){
        if(operator.equals("+"))    // 더하기 연산
            return plusMethod(num1, num2);
        return minusMethod(num1, num2);
    }
    int plusMethod(String num1, String num2){
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    int minusMethod(String num1, String num2){
        if(num2.contains("-"))
            num2 = num2.replace("-","");
        else
            num2 = "-" + num2;
        return plusMethod(num1, num2);
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int sumAnswer = 0;
        for (int i = 0; i < quiz.length; i++) {
            // 공백을 기준으로 분리
            String[] expression = quiz[i].split(" ");
            // 연산자에 따라 계산
            NumberCalculation result = new NumberCalculation();
            sumAnswer = result.numSum(expression[0],expression[1],expression[2]);
            // 결과와 값 일치 여부 확인
            answer[i] = sumAnswer == Integer.parseInt(expression[4]) ? "O" : "X";
            // 리턴
        }
        return answer;
    }
}