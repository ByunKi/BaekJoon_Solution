"""
 * 제출 번호: 48698480
 * ID: adviate
 * 문제: 14495
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 309 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def f(a, i):
    if a[i] != 0:
        return a[i]
    else:
        a[i] = f(a, i-1) + f(a, i-3)
        return a[i]

n = int(ip())
arr = [0] * n
if n >= 3:
    for i in range(3):
        arr[i] = 1
    print(f(arr, n - 1))
else:
    print(1)
