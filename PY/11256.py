"""
 * 제출 번호: 46175853
 * ID: adviate
 * 문제: 11256
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 357 B
"""

import sys
input = sys.stdin.readline

for _ in range(int(input())):
    J, N = map(int, input().split())
    arr = []

    for _ in range(N):
        A, B = map(int, input().split())
        arr.append(A * B)

    arr.sort(reverse=True)
    cnt = 0

    for i in arr:
        cnt += 1
        if J - i <= 0:
            break
        J -= i

    print(cnt)
