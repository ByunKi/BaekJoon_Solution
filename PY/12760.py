"""
 * 제출 번호: 46176871
 * ID: adviate
 * 문제: 12760
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 512 B
"""

import sys
io = sys.stdin.readline

N, M = map(int, io().split())
arr = []
for _ in range(N):
    tmp = sorted(list(map(int, io().split())))
    arr.append(tmp)

ans = [0 for _ in range(N)]
for i in range(M):
    tmp = []
    for j in range(N):
        tmp.append(arr[j][i])

    maxValue = max(tmp)
    for j in range(N):
        if maxValue == tmp[j]:
            ans[j] += 1

playerScore = max(ans)
out = []
for i in range(N):
    if ans[i] == playerScore:
        out.append(str(i + 1))

print(' '.join(out))


