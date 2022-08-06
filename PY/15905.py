"""
제출 번호: 47281181
아이디: adviate
문제: 15905
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 72 ms
언어: Python 3
코드 길이: 296 B
"""

import sys
input = sys.stdin.readline

arr = []
for _ in range(int(input())):
    arr.append(list(map(int, input().split())))
    
arr.sort(key = lambda x:(-x[0], x[1]))

cnt = 0
if len(arr) > 5:
    for i in range(5, len(arr)):
        if arr[4][0] == arr[i][0]:
            cnt += 1

print(cnt)
