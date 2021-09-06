"""
    ID: adviate
    문제번호: 15727
    결과: 맞았습니다!!
    메모리: 29200KB
    시간: 80ms
    언어: Python 3
    제출일시: 2021.09.06 23:00:28
"""

L = int(input())
speed = 5

if(L % speed == 0) :
    print(L//speed)
else :
    print((L//speed) + 1)
