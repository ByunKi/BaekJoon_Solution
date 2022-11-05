"""
 * 제출 번호: 51339608
 * ID: adviate
 * 문제: 4134
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 1496 ms
 * 언어: Python 3
 * 코드 길이: 321 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def is_prime(num):
    if num <= 1: return False
    for i in range(2, int(num**0.5)+1):
        if not num % i: return False
    return True

for _ in range(int(ip())):
    n = int(ip())
    while 1:
        if is_prime(n): print(n); break
        n += 1
