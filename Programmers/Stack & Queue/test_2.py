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
             
 
