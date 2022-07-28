"""
 * 제출 번호: 46815192
 * ID: adviate
 * 문제: 25183
 * 결과: 맞았습니다!!
 * 메모리: 31620 KB
 * 시간: 92 ms
 * 언어: Python 3
 * 코드 길이: 293 B
"""

import sys
input = sys.stdin.readline

N, cnt = int(input()), 1
s = input().rstrip()
arr = [ord(i) for i in s]

for i in range(len(arr)-1):
    if abs(arr[i] - arr[i+1]) == 1:
        cnt += 1
        if cnt == 5:
            break
    else:
        cnt = 1

print('YES' if cnt == 5 else 'NO')
