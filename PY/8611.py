"""
 * 제출 번호: 45022644
 * ID: adviate
 * 문제: 8611
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 92 ms
 * 언어: Python 3
 * 코드 길이: 433 B
"""

import sys


def is_palindrome(parameter):
    return parameter == parameter[::-1]


N = int(sys.stdin.readline())
flag = False

for i in range(2, 10):
    num = N
    S = ""
    while num != 0:
        S += str(num % i)
        num = num // i

    if is_palindrome(S):
        print("{} {}".format(i, S))
        flag = True

if is_palindrome(str(N)):
    print("{} {}".format(10, N))
    flag = True
elif not flag:
    print("NIE")

