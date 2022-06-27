"""
 * 제출 번호: 45113635
 * ID: adviate
 * 문제: 2309
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 294 B
"""

import sys

arr = [int(sys.stdin.readline()) for _ in range(9)]
for a in arr:
    for b in arr:
        if a == b:
            continue

        if sum(arr) - (a + b) == 100:
            arr.remove(a)
            arr.remove(b)
            break

arr.sort()
print("\n".join(str(i) for i in arr))
