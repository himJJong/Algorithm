 # 프로그래머스 고득점 Kit _ Sort 1번문제 


def solution(array, commands):      
    answer = []
      
    for n in range(len(commands)):      # 변수 n이 commands 배열의 길이 만큼 for문 실행
        i = commands[n][0]              # i가 2차원 배열의 첫 변수 값
        j = commands[n][1]              # j가 2차원 배열의 두번 째 변수 값
        k = commands[n][2]              # k가 2차원 배열의 세번 쨰 변수 값
        
        arr = array[i - 1:j]            # arr라는 배열에 i,j의 사이 값을 저장하는 장소를 만들고
        arr.sort()                      # 파이썬 함수를 이용하여 정렬
        answer.append(arr[k - 1])       # 만든 arr배열의 k-1번째를 추가해주어 구한다.
    return answer                       # (k-1인 이유는 문제에서 배열 세는 순서가 1부터 시작이기 때문
    
    
    
 
"""
1) 내가 이끌어 낸 지점 :

- 문제 그대로 주어지는 변수에 대한 값 출력을 어떻게 해야할지 배열로 만들었고

- 새롭게 하나의 배열을 추가하여 풀어냈다.

# 프로그래머스 문제 링크 - https://programmers.co.kr/learn/courses/30/lessons/42748

"""
