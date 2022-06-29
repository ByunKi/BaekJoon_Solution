"""
 * 제출 번호: 45234356
 * ID: adviate
 * 문제: 8979
 * 결과: 100점
 * 메모리: 30840 KB
 * 시간: 116 ms
 * 언어: Python 3
 * 코드 길이: 318 B
"""

N, K = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
arr.sort(key=lambda x: (x[1], x[2], x[3]), reverse=True)

idx = 0
for i in range(N):
    if arr[i][0] == K:
        idx = i
        break

for i in range(N):
    if arr[idx][1:] == arr[i][1:]:
        print(i + 1)
        break
