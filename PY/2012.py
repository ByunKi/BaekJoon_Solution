"""
 * 제출 번호: 49636848
 * ID: adviate
 * 문제: 2012
 * 결과: 맞았습니다!!
 * 메모리: 56100 KB
 * 시간: 576 ms
 * 언어: Python 3
 * 코드 길이: 187 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, a = int(ip()), 0
expG = sorted([int(ip()) for _ in range(N)])
for i in range(1, N+1): a += abs(expG[i-1] - i)
print(a)
