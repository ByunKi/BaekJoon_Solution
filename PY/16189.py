"""
 * 제출 번호: 45235721
 * ID: adviate
 * 문제: 16189
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 143 B
"""

def is_Palindrome(parameter):
    return parameter == parameter[::-1]


s = input()
k = int(input())
print("YES" if is_Palindrome(s) else "NO")
