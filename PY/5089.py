"""
제출 번호: 47431913
아이디: adviate
문제: 5089
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 254 B
"""

from sys import stdin
def input(): return stdin.readline().rstrip()

num = 1
while(True):
    n = int(input())
    if n == 0:
        break

    tmp = set()
    for i in range(n):
        tmp.add(input())

    print(f'Week {num} {len(tmp)}')
    num += 1
