class Solution {
    public int solution(int n) {
        int answer = 0;
        int result =0;
        for(int i=1; i<n+1 ;i++) {
            if(n%i==0) {
                answer+=i;
            }
            else
                continue;
        }
        return answer;
    }
}

//프로그래머스 약수의 합 문제
