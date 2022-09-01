"""
 * 제출 번호: 48609196
 * ID: adviate
 * 문제: 12847
 * 결과: 맞았습니다!!
 * 메모리: 42240 KB
 * 시간: 132 ms
 * 언어: Python 3
 * 코드 길이: 227 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, m = map(int, ip().split())
l = [int(x) for x in ip().split()]
t = sum(l[:m])
a = t

for i in range(m, n):
    t += l[i] - l[i - m]
    a = max(a, t)

print(a)
