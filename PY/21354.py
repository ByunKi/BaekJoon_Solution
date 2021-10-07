"""
제출 번호: 34152082
아이디: adviate
문제: 21354
결과: 맞았습니다!!
메모리:	29200KB 
시간: 68ms
언어: Python 3
코드 길이: 193B
제출한 시간: 2021.10.06 09:21:51


* De kommer överens om att de istället ska jämföra hur mycket de tjänat.
    Äpplen kostar 7 kronor styck och päron 13 kronor styck.
    
* En rad med två heltal A,P (0 <= A,P <= 1000), antalet äpplen Axel har lyckats sälja, och antalet päron Petra har lyckats sälja.

* Programmet ska skriva ut en rad med en sträng: den person som har tjänat mest, "Axel" eller "Petra". Om de sålt för lika mycket ska du skriva "lika".

"""

A,P = map(int, input().split())
priceA = 7
priceP = 13

if(A *  priceA > priceP * P) :
    print("Axel")
    
elif (A *  priceA == priceP * P) :
    print("lika")
    
else :
    print("Petra")
