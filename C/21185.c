/*
제출 번호: 34002629
아이디: adviate
문제: 21185
결과: 맞았습니다!!
메모리:	1116KB
시간: 0ms
언어: C99
코드 길이: 240B
제출한 시간: 2021.10.03 13:01:38
*/

/*
* Your friend has secretly picked N consecutive positive integers between 1 and 100.
    and wants you to guess if their sum is even or odd.
    If the sum must be even, output 'Even'.  If the sum must be odd, output 'Odd'.  If the sum could be even or could be odd, output 'Either'.

* The input is a single integer N with 1 <= N <= 10.

* Output a single word. The word should be 'Even', 'Odd', or 'Either', according to the rules given earlier.
*/

#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);


    if (N % 4 == 0) {
        printf("Even \n");
    }
    else if (N % 2 == 0) {
        printf("Odd \n");
    }
    else {
        printf("Either \n");
    }

	return 0;
}
