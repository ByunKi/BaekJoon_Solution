"""
 * 제출 번호: 46335306
 * ID: adviate
 * 문제: 25325
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 359 B
"""

import sys
input = sys.stdin.readline

hashMap = {}
n = int(input())
names = list(input().split())

for i in names:
    hashMap[i] = 0

for i in range(n):
    names = list(input().split())
    for j in names:
        hashMap[j] = hashMap[j] + 1

hashMap = sorted(hashMap.items(), key=lambda x: x[1], reverse=True)
for i in hashMap:
    print(f"{i[0]} {i[1]}")
