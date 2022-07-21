"""
 * 제출 번호: 46447327
 * ID: adviate
 * 문제: 23056
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 590 B
"""

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
classes = [0 for _ in range(N)]
odd = []
even = []

while True:
    info = list(input().split())
    if info[0] == '0' and info[1] == '0':
        break

    if classes[int(info[0]) - 1] < M:
        classes[int(info[0]) - 1] += 1

        if int(info[0]) % 2:
            odd.append(info)
        else:
            even.append(info)

odd.sort(key=lambda x: (int(x[0]), len(x[1]), x[1]))
even.sort(key=lambda x: (int(x[0]), len(x[1]), x[1]))

for i in odd:
    print(' '.join(i))

for i in even:
    print(' '.join(i))
