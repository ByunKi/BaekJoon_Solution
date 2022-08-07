"""
제출 번호: 47313912
아이디: adviate
문제: 14194
결과: 맞았습니다!!
메모리: 35200 KB 
시간: 136 ms
언어: Python 3
코드 길이: 257 B
"""

import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))

    arr.sort()
    if(abs((sum(arr) / n) - (arr[n-1] + arr[0]) / 2) < 1):
        print('Yes')
    else:
        print('No')
