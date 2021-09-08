"""
제출 번호: 33130121
아이디: adviate
문제: 2530
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 251B
제출한 시간: 2021.09.08 17:37:29
"""

"""
첫째 줄에는 현재 시각이 나온다.
현재 시각은 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어진다.

첫째 줄에 종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력한다.
(단, 시는 0부터 23까지의 정수이며, 분, 초는 0부터 59까지의 정수이다. 디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.)

"""

hour, minute, second = map(int, input().split())
cookingTime = int(input())

second += cookingTime
tmp = second // 60
second %= 60

minute += tmp
tmp = minute // 60
minute %= 60

hour += tmp
hour %= 24


print('{} {} {}'.format(hour, minute, second))
