"""
제출 번호: 34152249
아이디: adviate
문제: 21612
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 134B
제출한 시간: 2021.10.06 09:30:08


* De kommer överens om att de istället ska jämföra hur mycket de tjänat.
    Äpplen kostar 7 kronor styck och päron 13 kronor styck.
    
* En rad med två heltal A,P (0 <= A,P <= 1000), antalet äpplen Axel har lyckats sälja, och antalet päron Petra har lyckats sälja.

* Programmet ska skriva ut en rad med en sträng: den person som har tjänat mest, "Axel" eller "Petra". Om de sålt för lika mycket ska du skriva "lika".

"""

B = int(input())
P = (5 * B) - 400

print(P)

if(P < 100) :
    print(1)
    
elif (P == 100) :
    print(0)
    
else :
    print(-1)
