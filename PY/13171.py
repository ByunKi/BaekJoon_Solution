"""
 * 제출 번호: 48667675
 * ID: adviate
 * 문제: 13171
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 214 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = 1000000007
A, X = int(ip()), int(ip())
a, c = 1, A

for i in bin(X)[2:][::-1]:
    if i == '1':
        a = (a*c) % N
    c = c**2 % N

print(a)
