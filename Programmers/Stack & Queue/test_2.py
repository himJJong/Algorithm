# 프로그래머스 고득점 Kit _ Stack & Queue 2번문제


def solution(priorities, location):
    answer = 0
   
    while True:
        max_num = max(priorities)           # 리스트에서 max값 추출        
        for i in range(len(priorities)):    # i=0 부터 리스트 길이까지 확인
            if max_num == priorities[i]:    # 리스트의 max값과 리스트 요소가 일치하면
                answer += 1                 # answer에 +1
                priorities[i] = 0           # 뽑아낸 요소는 0으로 초기화
                max_num = max(priorities)   # 리스트의 가장 큰값을 다시 넣고
                if i == location:           # i와 location이 같다면 
                    return answer           # answer 값 반환
                
                
                
"""

이 코드를 가져온 이유는 여러 해답을 찾아본 코드 중 글쓴이와 가장 비슷하게 풀이했고 때문

1) 내가 이끌어 낸 지점 : 

- priorities의 중요도에 대한 max값, 이 max값에 대한 index와 location을 사용한다는 생각
- for문을 통해 i가 <max의 인덱스 값 +1 ~ priorities의 길이-1 까지> , <그리고 i가 0부터 max인덱스 -1까지>
- 위 for문을 통해 max값을 구하고, 같은 값이 존재하면 앞에서 뽑아낸 뒤의 인덱스부터 차례로 뽑게 한다는 생각

2) 이끌어내지 못한 지점 :

- 뽑아낼 max값의 초기화, 또는 다른 코드에서는 pop() 함수와 append 함수를 사용한 점

3) 느낀점 :

- 뭔가 계속 어렵게 생각하는 것 같다. 많이 풀고 공부하다 보면 쉬워질 것 같다는 느낌



 # 프로그래머스 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42587
 
"""



             
 
