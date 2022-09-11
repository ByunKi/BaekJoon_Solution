"""
 * 제출 번호: 49029269
 * ID: adviate
 * 문제: 2870
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 328 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

nums = []
for _ in range(int(ip())):
    s = ip() + ' '
    t = ''
    for i in s:
        if i.isdigit():
            t += i
        else:
            if len(t) > 0:
                nums.append(int(t))
                t = ''

for i in sorted(nums):
    print(i)
