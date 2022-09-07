"""
 * 제출 번호: 48844099
 * ID: adviate
 * 문제: 1015
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 258 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n = int(ip())
nums = list(map(int, ip().split()))
index = [-1] * n

for i in range(n):
    idx = nums.index(min(nums))
    index[idx] = i
    nums[idx] = 1001

print(' '.join(map(str, index)))
