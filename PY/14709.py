"""
 * 제출 번호: 45065864
 * ID: adviate
 * 문제: 14709
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 380 B
"""

N = int(input())
if N != 3:
    print("Woof-meow-tweet-squeek")
else:
    cnt = 0
    for i in range(N):
        arr = list(map(int, input().split()))

        if arr == [1, 4] or arr == [4, 1] or arr == [3, 4] \
                or arr == [4, 3] or arr == [1, 3] or arr == [3, 1]:
            cnt += 1

    print("Wa-pa-pa-pa-pa-pa-pow!" if cnt == 3 else "Woof-meow-tweet-squeek")
