# 프로그래머스 고득점 Kit _ Sort 2번 문제


def solution(numbers):            
    numbers = list(map(str, numbers))              # numbers 배열을 str으로 변환 후 배열로 다시 return
    numbers.sort(key=lambda x: x*3, reverse=True)  
    return str(int(''.join(numbers)))
  
  
  
  
"""
이 코드를 해석해보면
  
문자열을 합칠 것이니 numbers 배열에 str으로 변환해주고,
x문자열을 3번 곱하면 3개를 나열하는 것과 같고, 정렬을 sort로 하게되고, reverse=True을 통해 단지 숫자
크기로만 정렬이 만들어짐.
''으로 된 문자열을 합치고, 오버플로우 방지를 위해 다시 str으로 변환
  
  
  
1) 내가 이끌어 낸 지점 : 

- 문제 이해 정도..?

2) 이끌어내지 못한 지점 :

- 이 문제는 풀면서 답답했다. 문제에 대한 이해는 됐는데 어떻게 구현해야 할지 몰랐기 때문이다. 위 코드는 
가장 칭찬이 많은 코드를 가져온 것인데 이런 문제를 풀면서 내가 과연 여기까지 생각할 수 있을지 의문이다. 이를 이해해서 이러한
비슷한 문제를 보면 가져다 쓰는 것도 좋은 스킬이라 생각되지만 옳은 방법일까 하는 고민거리가 생겼다.

 # 프로그래머스 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42746
 
"""
