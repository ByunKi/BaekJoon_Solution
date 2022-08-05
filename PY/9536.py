"""
제출 번호: 47228962
아이디: adviate
문제: 9536
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 76 ms
언어: Python 3
코드 길이: 384 B
"""

import sys
input = sys.stdin.readline

for _ in range(int(input())):
    sounds = list(input().split())

    while(True):
        s = input()
        if '?' in s:
            break

        sound = s.split()[-1]
        while(True):
            try:
                sounds.remove(sound)
            except ValueError:
                break
                
    print(' '.join(sounds))
