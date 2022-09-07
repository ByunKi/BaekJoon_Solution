"""
 * 제출 번호: 48889181
 * ID: adviate
 * 문제: 11947
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 299 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def F(n):
    t = ['9'] * len(str(n))
    return int(''.join(t)) - int(n)

for _ in range(int(ip())):
    n = int(ip())
    t = 5 * (10 ** (len(str(n))-1)) - 1

    if n >= t:
        print(t * F(t))
    else:
        print(n * F(n))
