"""
 * 제출 번호: 45758497
 * ID: adviate
 * 문제: 11047
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 195 B
"""

N, K = map(int, input().split())
arr = [int(input()) for _ in range(N)]
ans = 0

for i in range(N-1, -1, -1):
    if K >= arr[i]:
        ans += int(K / arr[i])
        K = K % arr[i]

print(ans)
