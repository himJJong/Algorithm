// 1. 이런 for문 로직을 구현할 수 있을지 의문 ( 많이 문제 풀면서, 시야가 더 넓어지면 가능할 거 같음) 

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {  // 뽑는 요소 개수 만큼 앞,뒤 부분 잘라서
            max = 0;                                // max 값은 초기화
            for(int j = index; j<= k+i; j++) {      // 뽑은 인덱스 다음 ~ 뒷 부분 최소 필요한 개수 앞까지
                if(max < number.charAt(j)-'0') {    // 숫자 문자열을 정수로 비교
                    max = number.charAt(j)-'0';
                    index = j+1;                    // 다음 인덱스
                }
            }
            sb.append(max);                     //SpringBuilder append 활용
        }
        return sb.toString();
    }
}



// 2. 스택 사용 ( 그나마 이쪽이 구현해볼만하다고 느낌)

import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);                                      // c에 순차적으로 값 넣고
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {       // 스택의 top과 비교하여
                stack.pop();                                                // 새로 들어온 값이 더 작으면 버리고
            }
            stack.push(c);                                                  // 새로 들어온 값이 더 크면 스택에 넣는다
        }                                                                   // K-- > 0 이 될때까지
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}


