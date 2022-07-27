"""
 * 제출 번호: 46724797
 * ID: adviate
 * 문제: 2108
 * 결과: 맞았습니다!!
 * 메모리: 52260 KB
 * 시간: 484 ms
 * 언어: Python 3
 * 코드 길이: 379 B
"""

import sys
from collections import Counter
input = sys.stdin.readline

N = int(input())
arr = [int(input()) for _ in range(N)]
arr.sort()

print(round(sum(arr)/N))
print(arr[N//2])
arrC = Counter(arr).most_common()
if len(arrC) > 1:
    if arrC[0][1] == arrC[1][1]:
        print(arrC[1][0])
    else:
        print(arrC[0][0])
else:
    print(arrC[0][0])
print(arr[-1] - arr[0])
