"""
제출 번호: 33211961
아이디: adviate
문제: 2525
결과: 맞았습니다!!
메모리:	29200KB 
시간: 68ms
언어: Python 3
코드 길이: 684B
제출한 시간: 2021.09.10 19:32:21
"""

"""
* 첫째 줄에는 현재 시각이 나온다.
* 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
* 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
"""
hour, minute = map(int, input().split())
cookingTime = int(input())

minute += cookingTime
hour += (minute // 60)
minute %= 60


if(hour % 24 == 0 or hour > 24) :
    hour %= 24

print(hour, minute)
