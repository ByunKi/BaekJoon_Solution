"""
 * 제출 번호: 45587865
 * ID: adviate
 * 문제: 1343
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 84 ms
 * 언어: Python 3
 * 코드 길이: 326 B
"""

s = input()
i = 0
ans = []
while i < len(s):
    if s[i:i+4] == "XXXX":
        ans.append("AAAA")
        i += 4
    elif s[i:i+2] == "XX":
        ans.append("BB")
        i += 2
    elif s[i] == ".":
        ans.append(".")
        i += 1
    else:
        break

ans = ''.join(ans)
print(ans if len(ans) == len(s) else -1)
