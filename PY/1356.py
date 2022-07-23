"""
 * 제출 번호: 46547431
 * ID: adviate
 * 문제: 1356
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 322 B
"""

import sys
input = sys.stdin.readline

N, flag = input().rstrip(), False
for i in range(len(N)-1):
    left, right = 1, 1

    for j in range(i+1):
        left *= int(N[j])
    for j in range(i+1, len(N)):
        right *= int(N[j])

    if left == right:
        flag = True
        break

print("YES" if flag else "NO")
