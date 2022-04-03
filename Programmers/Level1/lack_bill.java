// 프로그래머스 부족한 금액 계산하기

class Solution {
    public long solution(int price, int money, int count) {


        long result = 0;
        long answer = 0;

        for(int i=1; i<count+1; i++) {
            result+=i;
        }

        long total = result*price;
        long sum = money-total;

        if(sum>=0) {
            return answer;
        }
        else {
            answer = -sum;
            return answer;
        }     
      }
}
