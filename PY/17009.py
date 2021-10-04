"""
제출 번호: 34069190
아이디: adviate
문제: 17009
결과: 맞았습니다!!
메모리:	29200KB 
시간: 68ms
언어: Python 3
코드 길이: 269B
제출한 시간: 2021.10.05 08:45:51


* You record all of the scoring activity at a basketball game.
    Points are scored by a 3-point shot, a 2-point field goal, or a 1-point free throw.
    You know the number of each of these types of scoring for the two teams: the Apples and the Bananas.
    Your job is to determine which team won, or if the game ended in a tie.

* The first three lines of input describe the scoring of the Apples, and the next three lines of input describe the scoring of the Bananas.
    For each team, the first line contains the number of successful 3-point shots, the second line contains the number of successful 2-point field goals, and the third line contains the number of successful 1-point free throws.
    Each number will be an integer between 0 and 100, inclusive.
     
* The output will be a single character.
    If the Apples scored more points than the Bananas, output 'A'.
    If the Bananas scored more points than the Apples, output 'B'.
    Otherwise, output 'T', to indicate a tie.
"""

A3 = int(input())
A2 = int(input())
A1 = int(input())
scoreA = 3 * A3 + 2 * A2 + A1

B3 = int(input())
B2 = int(input())
B1 = int(input())
scoreB = 3 * B3 + 2 * B2 + B1

if(scoreA == scoreB) :
    print("T")
elif (scoreA > scoreB) :
    print("A")
else :
    print("B")
