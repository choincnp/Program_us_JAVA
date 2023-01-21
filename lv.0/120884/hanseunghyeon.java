class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while(true){
            chicken = coupon / 10;
            if(chicken == 0)
                break;
            coupon = coupon % 10;
            answer += chicken;
            coupon += chicken;
        }
        return answer;
    }
}