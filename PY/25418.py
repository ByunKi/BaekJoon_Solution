"""
 * 제출 번호: 51486433
 * ID: adviate
 * 문제: 25418
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 132 ms
 * 언어: Python 3
 * 코드 길이: 209 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

A, K = map(int, ip().split())
c = 0
while 1:
    if A == K: print(c); break
    if K % 2 == 0 and K >= A*2: K //= 2
    else: K -= 1
    c += 1
