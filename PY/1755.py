"""
 * 제출 번호: 49060812
 * ID: adviate
 * 문제: 1755
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 462 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def f(n):
    a = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    t = ''
    while n != 0:
        t = (a[n % 10] + ' ') + t
        n //= 10
    return t.rstrip()

dic = {}
M, N = map(int, ip().split())
for i in range(M, N+1): dic[i] = f(i)

for i, n in enumerate(sorted(dic.items(), key=lambda x: x[1])):
    print(n[0], end=' ')
    if i % 10 == 9: print()
