"""
제출 번호: 33930460
아이디: adviate
문제: 16199
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 490B
제출한 시간: 2021.10.01 11:20:10
"""

"""
* 만 나이: 국제적인 표준 방법이다. 한국에서도 법에서는 만 나이만을 사용한다.
    세는 나이: 한국에서 보통 나이를 물어보면 세는 나이를 의미한다.
    연 나이: 법률에서 일괄적으로 사람을 구분하기 위해서 사용하는 나이이다.

* 첫째 줄에 어떤 사람이 태어난 연도, 월, 일이 주어진다. 생년월일은 공백으로 구분되어져 있고, 항상 올바른 날짜만 주어진다.
    둘째 줄에 기준 날짜가 주어진다. 기준 날짜도 공백으로 구분되어져 있으며, 올바른 날짜만 주어진다.
    입력으로 주어지는 생년월일은 기준 날짜와 같거나 그 이전이다.
    입력으로 주어지는 연도는 1900년보다 크거나 같고, 2100년보다 작거나 같다.


* 첫째 줄에 만 나이, 둘째 줄에 세는 나이, 셋째 줄에 연 나이를 출력한다.
"""
birthYear, birthMonth, birthDay = map(int, input().split()) # 생일
basisYear, basisMonth, basisDay = map(int, input().split()) # 기준일자 (현)
# 기준일자 - 생일

age1 = 0

if(basisMonth > birthMonth) :
    age1 = basisYear - birthYear
    
elif(basisMonth == birthMonth and birthDay <= basisDay) :
    age1 = basisYear - birthYear
    
else :
    age1= basisYear - birthYear -1

age2 = basisYear - birthYear + 1
age3 = basisYear - birthYear

print(age1)
print(age2)
print(age3)

    

