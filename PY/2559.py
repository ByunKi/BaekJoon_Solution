"""
 * 제출 번호: 49959827
 * ID: adviate
 * 문제: 2559
 * 결과: 맞았습니다!!
 * 메모리: 39572 KB
 * 시간: 136 ms
 * 언어: Python 3
 * 코드 길이: 249 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, K = map(int, ip().split())
l = [int(x) for x in ip().split()]+[0]*K
s = sum(l[:K])
t = [s]
for i in range(1, N):
    s = s - l[i-1] + l[i+K-1]
    t.append(s)
print(max(t[:N-K+1]))
