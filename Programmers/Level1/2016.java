//프로그래머스 2016

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month ={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int total = 0;
        
        for (int i= 1; i<a; i++){
            total += month[i-1];
        }
        total += b-1;
        return days[(total+5)%7];
    }
}

// 참고 : https://mozzioi.tistory.com/42
