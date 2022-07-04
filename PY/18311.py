"""
 * 제출 번호: 45497109
 * ID: adviate
 * 문제: 18311
 * 결과: 맞았습니다!!
 * 메모리: 42132 KB
 * 시간: 124 ms
 * 언어: Python 3
 * 코드 길이: 276 B
"""

N, K = map(int, input().split())
arr = list(map(int, input().split()))

for i in range(N):
    K -= arr[i]
    if K < 0:
        print(i+1)
        break

if K > 0:
    for i in range(N-1, -1, -1):
        K -= arr[i]
        if K < 0:
            print(i+1)
            break
