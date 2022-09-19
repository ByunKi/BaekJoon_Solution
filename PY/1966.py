"""
 * 제출 번호: 49387594
 * ID: adviate
 * 문제: 1966
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 424 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    c = 1
    N, M = map(int, ip().split())
    l = [int(x) for x in ip().split()]
    q = [(i, n) for i, n in enumerate(l)]
    l.sort(reverse=True)

    while 1:
        if l[0] > q[0][1]:
            q.append(q.pop(0))
        else:
            if M == q[0][0]: break
            del (l[0], q[0])
            c += 1
    print(c)
