class Solution {
    public String solution(String[] seoul) {

        String answer = "";
        int result = 0;
        for(int i=0; i<seoul.length;i++) {
            if(seoul[i].equals("Kim")) 
                answer = "김서방은 "+i+"에 있다";

        }return answer;
    }   
}

//프로그래머스 서울에서 김서방 찾기
// 문자열 비교는 == 말고 .equals 를 사용하자.
