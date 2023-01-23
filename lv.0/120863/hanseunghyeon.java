class Solution {
    public String solution(String polynomial) {
        String[] splitString = polynomial.split(" ");
        String answer = "";
        int xSum = 0;
        int numSum = 0;
        for (int i = 0; i < splitString.length; i++) {
            if(splitString[i].contains("x"))
                xSum += splitString[i].equals("x") ? 1 : Integer.parseInt(splitString[i].replace("x", ""));
            else
                numSum += splitString[i].equals("+") ? 0 : Integer.parseInt(splitString[i]);
        }
        if(xSum != 0 && numSum != 0)
            answer = xSum == 1 ? "x " + "+ " + numSum : xSum + "x " + "+ " + numSum;
        else
            answer = numSum != 0 ? "" + numSum : (xSum == 1 ? "x" : xSum + "x");
        return answer;
    }
}