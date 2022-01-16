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
1) 
"""
