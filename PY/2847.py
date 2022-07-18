"""
 * 제출 번호: 46220118
 * ID: adviate
 * 문제: 2847
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 160 ms
 * 언어: Python 3
 * 코드 길이: 214 B
"""

import sys
ip = sys.stdin.readline

N = int(ip())
arr = [int(ip()) for _ in range(N)]
arr.reverse()
cnt = 0

for o in range(N-1):
    while arr[o] <= arr[o + 1]:
        cnt += 1
        arr[o + 1] -= 1

print(cnt)
