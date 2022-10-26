"""
 * 제출 번호: 50747212
 * ID: adviate
 * 문제: 15232
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 166 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

R, C = int(ip()), int(ip())
for _ in range(R):
    for _ in range(C): print('*', end='')
    print()
