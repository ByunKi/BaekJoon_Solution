"""
제출 번호: 47286340
아이디: adviate
문제: 3036
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 275 B
"""

import sys
input = sys.stdin.readline

def GCD(a, b):
    if a % b == 0:
        return b
    return GCD(b, a % b)

_ = input()
arr = list(map(int, input().split()))

for i in range(1, len(arr)):
    num = GCD(arr[0], arr[i])
    print(f'{int(arr[0]/num)}/{int(arr[i]/num)}')
