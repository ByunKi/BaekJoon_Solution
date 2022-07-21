"""
 * 제출 번호: 46446002
 * ID: adviate
 * 문제: 1417
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 299 B
"""

import sys
input = sys.stdin.readline

N, cnt = int(input()), 0
arr = [int(input()) for _ in range(N)]
maxValue = max(arr)

while arr[0] != maxValue or arr.count(maxValue) > 1:
    idx = arr[1:].index(max(arr[1:]))+1
    arr[0] += 1
    arr[idx] -= 1
    cnt += 1
    maxValue = max(arr)

print(cnt)
