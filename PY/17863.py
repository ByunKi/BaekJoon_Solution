"""
제출 번호: 34151999
아이디: adviate
문제: 17863
결과: 맞았습니다!!
메모리:	29200KB 
시간: 68ms
언어: Python 3
코드 길이: 97B
제출한 시간: 2021.10.06 09:16:32


* In the United States of America, telephone numbers within an area code consist of 7 digits
    Traditionally, the 555 prefix number has been used to provide directory information and assistance as in the following examples
    
* Telephone company switching hardware would detect the 555 prefix and route the call to a directory information operator.
    Now-a-days, telephone switching is done digitally and somewhere along the line a computer decides where to route calls.
    For this problem, write a program that determines if a supplied 7-digit telephone number should be routed to the directory information operator, that is, the prefix number is 555.

* The input consists of a single line containing a 7-digit positive integer N, (1000000 <= N <= 9999999).

* The single output line consists of the word YES
    if the number should be routed to the directory information operator or NO
    if the number should not be routed to the directory information operator.
"""

N = int(input())
basis = 555

if((N // 10000) == basis) :
    print("YES")
else :
    print("NO")
