"""
 * 제출 번호: 50417664
 * ID: adviate
 * 문제: 16464
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 250 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

l = []
for _ in range(int(ip())):
    n = int(ip())
    while n != 1:
        if n % 2: l.append('Gazua'); break
        n /= 2
    if n == 1: l.append('GoHanGang')
print('\n'.join(l))
