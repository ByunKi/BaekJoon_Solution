"""
 * 제출 번호: 45758511
 * ID: adviate
 * 문제: 16208
 * 결과: 30점
 * 메모리: 68116 KB
 * 시간: 264 ms
 * 언어: Python 3
 * 코드 길이: 142 B
"""

n = int(input())
arr = list(map(int, input().split()))
total = sum(arr)
ans = 0

for i in arr:
    total -= i
    ans += i * total

print(ans)
