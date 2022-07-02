"""
 * 제출 번호: 45358028
 * ID: adviate
 * 문제: 11257
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 251 B
"""

for _ in range(int(input())):
    name, *scores = list(map(int, input().split()))

    print("{} {} {}".format(name, sum(scores), "PASS" if sum(scores) >= 55 and
        (scores[0] >= 35 * 0.3 and scores[1] >= 25 * 0.3 and scores[2] >= 40 * 0.3) else "FAIL"))
