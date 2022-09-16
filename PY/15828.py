"""
 * 제출 번호: 49248960
 * ID: adviate
 * 문제: 15828
 * 결과: 100점
 * 메모리: 36060 KB
 * 시간: 960 ms
 * 언어: Python 3
 * 코드 길이: 286 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

b, s = [], 0
N = int(ip())
while 1:
    i = ip()
    if i == '-1': break
    if s < N and i != '0':
        s += 1
        b.append(i)
    if i == '0':
        del b[0]
        s -= 1
print(' '.join(b) if b else 'empty')
