"""
 * 제출 번호: 46446078
 * ID: adviate
 * 문제: 1246
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 152 ms
 * 언어: Python 3
 * 코드 길이: 353 B
"""

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
price, maxValue = 0, 0
arr = [int(input()) for _ in range(M)]

for i in arr:
    cnt = 0
    for j in arr:
        if i <= j:
            cnt += 1
    cnt = N if cnt > N else cnt

    if maxValue < cnt * i:
        maxValue = cnt * i
        price = i

print(f"{price} {maxValue}")
