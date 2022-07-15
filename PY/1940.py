"""
 * 제출 번호: 46132986
 * ID: adviate
 * 문제: 1940
 * 결과: 맞았습니다!!
 * 메모리: 31860 KB
 * 시간: 80 ms
 * 언어: Python 3
 * 코드 길이: 317 B
"""

import sys
input = sys.stdin.readline

N, M = int(input()), int(input())
arr = list(map(int, input().split()))
arr.sort()
cnt, i, j = 0, 0, N - 1

while i < j:
    if arr[i] + arr[j] == M:
        cnt += 1
        i += 1
        j -= 1
    elif arr[i] + arr[j] < M:
        i += 1
    else:
        j -= 1

print(cnt)
