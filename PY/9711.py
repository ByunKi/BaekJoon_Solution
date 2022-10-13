"""
 * 제출 번호: 50513940
 * ID: adviate
 * 문제: 9711
 * 결과: 맞았습니다!!
 * 메모리: 34396 KB
 * 시간: 116 ms
 * 언어: Python 3
 * 코드 길이: 293 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def init():
    l, a, b = [], 0, 1
    for _ in range(10001):
        a, b = b, a+b
        l.append(a)
    return l

l = init()
for i in range(int(ip())):
    p, q = map(int, ip().split())
    print(f'Case #{i+1}: {l[p-1]%q}')
