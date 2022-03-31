//프로그래머스 문자열 내 p와 y의 개수

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        int pcount = 0;
        int ycount = 0;


        for(int i=0; i<arr.length;i++) {

            if(arr[i].equals("P")||arr[i].equals("p")) {
                pcount++;
            }
            else if(arr[i].equals("Y")||arr[i].equals("y")) {
                ycount++;
            }
            else 
                continue;
        }


        if(pcount==ycount) {
        }
        else {
            answer =false;
        }
        return answer;
    }
}
