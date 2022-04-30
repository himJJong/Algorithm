SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)   뽑고자 하는 것 select, 뽑고자 하는것에 개수세기(count), 어디서부터(from)
FROM ANIMAL_INS                            
group by ANIMAL_TYPE                     뽑고자 하는 것 그룹으로 묶기
ORDER BY ANIMAL_TYPE                     순서대로 정렬

