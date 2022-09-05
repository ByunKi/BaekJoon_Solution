"""
 * 제출 번호: 48796207
 * ID: adviate
 * 문제: 13417
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 108 ms
 * 언어: Python 3
 * 코드 길이: 318 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    n = int(ip())
    l = ip().split()
    t, e = [l[0]], l[0]
    for i in range(1, n):
        if l[i] <= e:
            t.insert(0, l[i])
            e = l[i]
        else:
            t.append(l[i])

    print(''.join(t))
