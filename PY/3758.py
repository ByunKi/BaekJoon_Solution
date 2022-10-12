"""
 * 제출 번호: 50464905
 * ID: adviate
 * 문제: 3758
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 188 ms
 * 언어: Python 3
 * 코드 길이: 485 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    l = []
    n, k, t, m = map(int, ip().split())
    for e in range(n): l.append([e+1, [0]*k, 0, 0])
    for e in range(m):
        i, j, s = map(int, ip().split())
        l[i-1][1][j-1] = max(s, l[i-1][1][j-1])
        l[i-1][2] += 1
        l[i-1][3] = e
    l.sort(key=lambda x:(-sum(x[1]), x[2], x[3]))
    idx = 1
    for e in l:
       if e[0] == t: print(idx); break
       idx += 1
