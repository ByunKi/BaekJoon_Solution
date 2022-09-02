"""
제출 번호: 48477188
아이디: adviate
문제: 2407
결과: 맞았습니다!!
메모리: 32796 KB 
시간: 72 ms
언어: Python 3
코드 길이: 85 B
"""

from sys import stdin
from math import factorial as f
def ip(): return stdin.readline().rstrip()

n, m = map(int, ip().split())
print(f(n) // (f(n-m) * f(m)))
