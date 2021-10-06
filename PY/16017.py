"""
제출 번호: 34111508
아이디: adviate
문제: 16017
결과: 맞았습니다!!
메모리:	29200KB 
시간: 80ms
언어: Python 3
코드 길이: 311B
제출한 시간: 2021.10.06 09:45:32


* we have noted that telemarketers like to use seven-digit phone numbers where the last four digits have three properties. Looking just at the last four digits
    the first of these four digits is an 8 or 9;
    the last digit is an 8 or 9;
    the second and third digits are the same.

* If the number is not a telemarketer number,
    we should answer the phone,
    otherwise, we should ignore it.

* The input will be 4 lines where each line contains exactly one digit
    in the range from 0 to 9.

* Output either ignore if the number matches the pattern for a telemarketer number
    otherwise, output answer.
"""

arr = []
for i in range(4) :
    i = int(input())
    arr.append(i)

if(arr[0] == 8 or arr[0] == 9) :
    if(arr[3] == 8 or arr[3] == 9) :
        
        if(arr[2] == arr[1]) :
            print("ignore")
        else :
            print("answer")
    else :
        print("answer")
else :
    print("answer")
    
