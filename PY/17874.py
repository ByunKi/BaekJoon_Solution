"""
제출 번호: 34033442
아이디: adviate
문제: 17874
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 119B
제출한 시간: 2021.10.04 10:02:27
"""

"""
* It is Greg’s birthday! To celebrate, his friend Sam invites Greg and two other friends for a small party.
    Sam ordered a square cake. She makes a single horizontal cut and a single vertical cut.
    In her excitement to eat cake, Sam forgot to make these cuts through the middle of the cake.
    the biggest piece of cake should go to Greg since it is his birthday.
    Help Sam determine the volume of the biggest piece of cake that resulted from these two cuts.
    
* The input consists of a single line containing three integers n (2 ≤ n ≤ 10 000),
    the length of the sides of the square cake in centimeters, h (0 < h < n), the distance of the horizontal cut from the top edge of the cake in centimeters,
    and v (0 < v < n), the distance of the vertical cut from the left edge of the cake in centimeters. This is illustrated in the figure above.
    Each cake is 4 centimeters thick.
    
* Display the volume (in cubic centimeters) of the largest of the four pieces of cake after the horizontal and vertical cuts are made.
"""
N,H,V = map(int, input().split())
area = max((H*V), ((N - H) * (N - V)), ((N - H) * V), (H * (N - V)))

print(area * 4)
