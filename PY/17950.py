"""
 * 제출 번호: 45650957
 * ID: adviate
 * 문제: 17950
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 724 ms
 * 언어: Python 3
 * 코드 길이: 198 B
"""

import sys
input = sys.stdin.readline

ans = 0
H, x = map(int, input().split())
i = 1

for _ in range(H):
    i *= x
    i %= 1000000007
    ans += int(input()) * i
    ans %= 1000000007

print(ans)
