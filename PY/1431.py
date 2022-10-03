"""
 * 제출 번호: 50048209
 * ID: adviate
 * 문제: 1431
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 299 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def c(l):
    tmp = 0
    for i in l:
        if i.isdigit(): tmp += int(i)
    return tmp

l = []
for _ in range(int(ip())):
    s = ip()
    l.append((s, c(s)))

l.sort(key=lambda x: (len(x[0]), x[1], x[0]))
for i in l: print(i[0])
