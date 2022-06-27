"""
 * 제출 번호: 45113396
 * ID: adviate
 * 문제: 1205
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 372 B
"""

# 1205
N, new_score, P = list(map(int, input().split()))

if N > 0:
    scores = list(map(int, input().split()))

    if len(scores) >= P and new_score <= scores[-1]:
        print(-1)
    else:
        if len(scores) == P:
            scores.pop()

        scores.append(new_score)
        scores.sort(reverse=True)
        print(scores.index(new_score) + 1)

else:
    print(1)
