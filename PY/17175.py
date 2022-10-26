"""
 * 제출 번호: 50847919
 * ID: adviate
 * 문제: 17175
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 195 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n = int(ip())
if n < 2: print(1)
else:
    a, b = 1, 1
    for i in range(n-1):
        a, b = a+b+1, a
    print(a % 1000000007)
