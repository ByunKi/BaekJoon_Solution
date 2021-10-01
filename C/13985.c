/*
제출 번호: 33927481
아이디: adviate
문제: 13985
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 190B
제출한 시간: 2021.10.01 09:22:24
*/

/*
* The quiz asks a student for the sum of the numbers. 
	Determine if the student taking the quiz got the question correct.

* The first and the only line of input contains a string of the form: a + b = c
	It is guaranteed that a, b, and c are single-digit positive integers.
	The input line will have exactly 9 characters, formatted exactly as shown, with a single space separating each number and arithmetic operator.

* Print, on a single line, YES if the sum is correct; otherwise, print NO.
*/

#include <stdio.h>

int main() {
	char input[10];
	// gets(input);
	gets_s(input,10); 
	// 사이즈가 정해져 있다면은, get으로 문자열을 받는 것도 좋다.

	if ((input[0] - '0') + (input[4] - '0') == (input[8] - '0')) {
		printf("YES");
	}
	else {
		printf("NO");
	}

	return 0;
}
