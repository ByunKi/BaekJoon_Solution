"""
 * 제출 번호: 45070476
 * ID: adviate
 * 문제: 25304
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 177 B
"""

import sys
input = sys.stdin.readline

X = int(input())
for _ in range(int(input())):
    a, b = list(map(int, input().split()))
    X -= a * b

print("Yes" if X == 0 else "No")
