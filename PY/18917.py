"""
 * 제출 번호: 49830557
 * ID: adviate
 * 문제: 18917
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 848 ms
 * 언어: Python 3
 * 코드 길이: 355 B
"""

from sys import stdin, stdout
def ip(): return stdin.readline().rstrip()
def write(n): return stdout.write(n + '\n')

a, s, x = [0], 0, 0
for _ in range(int(ip())):
    t = list(map(int, ip().split()))
    if t[0] == 1:
        s += t[1]; x ^= t[1]
    elif t[0] == 2:
        s -= t[1]; x ^= t[1]
    elif t[0] == 3: write(str(s))
    else: write(str(x))
