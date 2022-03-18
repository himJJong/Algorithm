//프로그래머스 가운데 숫자 가져오기
class Solution {
    public String solution(String s) {

        String[] result = s.split("");
        String answer = "";

        if(s.length()%2==0) {
            answer = result[((int)s.length()/2)-1]+result[s.length()/2];
        }
        else {
            answer = result[((int)s.length()/2)];
        }
        return answer;
    }
}
