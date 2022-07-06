"""
 * 제출 번호: 45588013
 * ID: adviate
 * 문제: 3711
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 892 ms
 * 언어: Python 3
 * 코드 길이: 233 B
"""

for _ in range(int(input())):
    m = 1
    G = int(input())
    arr = [int(input()) for _ in range(G)]

    while True:
        tmp = set([a % m for a in arr])
        if G == len(tmp):
            break
        m += 1

    print(m)
