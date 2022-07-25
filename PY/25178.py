"""
 * 제출 번호: 46607126
 * ID: adviate
 * 문제: 25178
 * 결과: 맞았습니다!!
 * 메모리: 32404 KB
 * 시간: 116 ms
 * 언어: Python 3
 * 코드 길이: 463 B
"""

import sys
input = sys.stdin.readline

def func(string):
    rst = ''
    vowels = ['a', 'e', 'i', 'o', 'u']
    for i in string:
        if not (i in vowels):
            rst += i

    return rst

def check(s1, s2):
    if (s1[0] != s2[0] or s1[-1] != s2[-1]) or func(s1) != func(s2) \
            or sorted(s1) != sorted(s2):
        return False
    return True


N = int(input())
A, B = input().rstrip(), input().rstrip()
print("YES" if check(A, B) else "NO")
