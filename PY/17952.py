"""
 * 제출 번호: 51131169
 * ID: adviate
 * 문제: 17952
 * 결과: 맞았습니다!!
 * 메모리: 87132 KB
 * 시간: 1704 ms
 * 언어: Python 3
 * 코드 길이: 339 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

score = 0
stack = []
for _ in range(int(ip())):
    t = list(map(int, ip().split()))
    if t[0] == 1: stack.append(t[1:])
    if len(stack) > 0:
        stack[-1][1] -= 1

        if stack[-1][1] == 0:
            score += stack[-1][0]
            stack.pop()
print(score)
