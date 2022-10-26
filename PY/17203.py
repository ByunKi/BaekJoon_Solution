"""
 * 제출 번호: 50892943
 * ID: adviate
 * 문제: 17203
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 80 ms
 * 언어: Python 3
 * 코드 길이: 266 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, Q = map(int, ip().split())
A = list(map(int, ip().split()))
TA = [0]
for i in range(1, N): TA.append(abs(A[i] - A[i-1]))
for _ in range(Q):
    L, R = map(int, ip().split())
    print(sum(TA[L:R]))
