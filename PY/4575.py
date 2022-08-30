"""
 * 제출 번호: 48499963
 * ID: adviate
 * 문제: 4575
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 327 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

r = []
while 1:
    s = ip()
    if s == 'END':
        break
    t, f = set(), False

    for i in s:
        if i in t:
            f = True
            break
        if not i == ' ':
            t.add(i)
    if not f:
        r.append(s)

print('\n'.join(r))
