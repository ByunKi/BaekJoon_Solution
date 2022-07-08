"""
 * 제출 번호: 45758528
 * ID: adviate
 * 문제: 11399
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 96 ms
 * 언어: Python 3
 * 코드 길이: 235 B
"""

def subSum(list, idx):
    rst = 0
    for s in range(idx):
        rst += list[s]
    return rst


N = int(input()) + 1
arr = list(map(int, input().split()))
arr.sort()

ans = 0
for i in range(N):
    ans += subSum(arr, i)

print(ans)
