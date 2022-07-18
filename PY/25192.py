"""
 * 제출 번호: 46269210
 * ID: adviate
 * 문제: 25192
 * 결과: 맞았습니다!!
 * 메모리: 38520 KB
 * 시간: 116 ms
 * 언어: Python 3
 * 코드 길이: 280 B
"""

import sys
input = sys.stdin.readline

N, cnt = int(input()), 0
log = {}

for _ in range(N):
    chat = input().rstrip()
    if chat == 'ENTER':
        log = {}
        continue
    else:
        if not (chat in log):
            log[chat] = True
            cnt += 1

print(cnt)
