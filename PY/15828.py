"""
 * 제출 번호: 49248896
 * ID: adviate
 * 문제: 15828
 * 결과: 100점
 * 메모리: 36060 KB
 * 시간: 976 ms
 * 언어: Python 3
 * 코드 길이: 239 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

b = []
N = int(ip())
while 1:
    i = ip()
    if i == '-1': break
    if len(b) < N and i != '0': b.append(i)
    if i == '0': b.pop(0)
print(' '.join(b) if b else 'empty')
