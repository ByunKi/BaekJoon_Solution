"""
 * 제출 번호: 49670944
 * ID: adviate
 * 문제: 6986
 * 결과: 맞았습니다!!
 * 메모리: 35476 KB
 * 시간: 124 ms
 * 언어: Python 3
 * 코드 길이: 278 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, K = map(int, ip().split())
l = sorted([float(ip()) for _ in range(N)])
tm = sum(l[K:N-K])/(N-K*2)
am = (l[K]*K + l[N-K-1]*K + sum(l[K:N-K])) / N
print("{:.2f}\n{:.2f}".format(tm + 0.00000001, am + 0.00000001))
