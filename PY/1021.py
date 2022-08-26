"""
 * 제출 번호: 48349636
 * ID: adviate
 * 문제: 1021
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 394 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

N, M = map(int, ip().split())
a = list(map(int, ip().split()))
l, cnt = [i for i in range(1, N + 1)], 0

while a:
    m = len(l) // 2
    if l[0] == a[0]:
        a.pop(0)
        l.pop(0)
    else:
        if l.index(a[0]) > m:
            l.insert(0, l.pop())
        else:
            l.append(l.pop(0))
        cnt += 1

print(cnt)
