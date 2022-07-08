"""
 * 제출 번호: 45758490
 * ID: adviate
 * 문제: 1065
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 277 B
"""

def func(num):
    cnt = 0
    for i in range(1, num+1):
        if i < 100:
            cnt += 1
        else:
            tmp = list(map(int, str(i)))
            if tmp[0] - tmp[1] == tmp[1] - tmp[2]:
                cnt += 1
    return cnt


N = int(input())
print(func(N))
