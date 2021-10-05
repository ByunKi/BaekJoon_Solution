"""
제출 번호: 34069424
아이디: adviate
문제: 20215
결과: 맞았습니다!!
메모리:	31312KB 
시간: 72ms
언어: Python 3
코드 길이: 108B
제출한 시간: 2021.10.05 09:09:12


* A few members loudly proclaim that cuts should be made diagonally, while other members say that cutting the corner out as a rectangle is the better option.
    Both parties claim their method is better.

* You decide to end this discussion once and for all, telling the rectangle-cutters that their method is slower.
    You set out to show them the following: given a piece of paper which has a W by H corner that is stained with coffee that needs to be to cut off,
    how much more effort is it to cut out the whole rectangle compared to cutting along the diagonal?
     
* The input consists of: A line containing two integers 
    W and H (1 <= W,H <= 100), representing the width and height of the corner respectively.
"""

import math

W, H = map(float,input().split())
# W,H 한번씩만 계속 자른다면 직사각형 형태로 잘라진다. (W + H)
# 정상적인 직각삼각형의 경우, 대각선의 길이가 두변의 합보다 작기 때문에 무조건 양수
# 따라서 직사각형 자르기 - 피타고라스 공식에서 대각선을 구해 이 것의 차를 출력하면 되는거 아닌가?

ans = (W + H) - math.sqrt((W**2) + (H**2))

print(ans)
