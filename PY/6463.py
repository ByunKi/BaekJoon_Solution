"""
 * 제출 번호: 46132837
 * ID: adviate
 * 문제: 6463
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 732 ms
 * 언어: Python 3
 * 코드 길이: 348 B
"""

import sys
input = sys.stdin.readline

while True:
    rst = 1
    i = 0

    try:
        N = int(input())
        while i != N:
            i += 1
            rst *= i

        while True:
            check = rst % 10
            if check:
                break
            rst //= 10

        print(f"{N:5} -> {check}")
    except:
        break
