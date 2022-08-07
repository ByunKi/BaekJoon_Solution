"""
제출 번호: 47313273
아이디: adviate
문제: 1813
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 68 ms
언어: Python 3
코드 길이: 267 B
"""

import sys
input = sys.stdin.readline

N = int(input())
arr = [0] * 51
nums = list(map(int, input().split()))

for i in range(N):
    arr[nums[i]] += 1

maxValue = -1
for i in range(len(arr)):
    if arr[i] == i and maxValue < i:
        maxValue = i

print(maxValue)
