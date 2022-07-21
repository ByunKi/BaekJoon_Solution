"""
 * 제출 번호: 46445898
 * ID: adviate
 * 문제: 25206
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 579 B
"""

import sys
input = sys.stdin.readline

cnt, total = 0, 0
for _ in range(20):
    name, credit, grade = input().split()

    if grade != 'P':
        cnt += float(credit)

    tmp = 0
    if grade == 'A+':
        tmp = 4.5
    elif grade == 'A0':
        tmp = 4
    elif grade == 'B+':
        tmp = 3.5
    elif grade == 'B0':
        tmp = 3
    elif grade == 'C+':
        tmp = 2.5
    elif grade == 'C0':
        tmp = 2
    elif grade == 'D+':
        tmp = 1.5
    elif grade == 'D0':
        tmp = 1

    total += tmp * float(credit)

print("{:.6f}".format(total / cnt))
