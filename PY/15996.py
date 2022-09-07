"""
 * 제출 번호: 48876871
 * ID: adviate
 * 문제: 15996
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 155 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, A = map(int, ip().split())
x, c = A, 0
while x <= N:
    c += N//x
    x *= A
print(c)
