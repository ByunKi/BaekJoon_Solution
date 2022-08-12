"""
 * 제출 번호: 47590161
 * ID: adviate
 * 문제: 1049
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 563 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

n, m = map(int, ip().split())
answer = 0
price_list = []

for _ in range(m):
    price = tuple(map(int, ip().split()))
    price_list.append(price)

six_list = sorted(price_list, key=lambda x: x[0])
one_list = sorted(price_list, key=lambda x: x[1])

if six_list[0][0] <= one_list[0][1] * 6:
    answer = six_list[0][0] * (n // 6) + one_list[0][1] * (n % 6)
    if six_list[0][0] < one_list[0][1] * (n % 6):
        answer = six_list[0][0] * (n//6 + 1)
else:
    answer = one_list[0][1] * n

print(answer)
