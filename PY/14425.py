"""
 * 제출 번호: 50198781
 * ID: adviate
 * 문제: 14425
 * 결과: 맞았습니다!!
 * 메모리: 36004 KB
 * 시간: 148 ms
 * 언어: Python 3
 * 코드 길이: 186 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

c = 0
N, M = map(int, ip().split())
s = set(ip() for _ in range(N))
for _ in range(M):
    if ip() in s: c += 1
print(c)
