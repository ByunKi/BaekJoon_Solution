/*
제출 번호: 33889731
아이디: adviate
문제: 11549
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 216B
제출한 시간: 2021.09.30 10:48:22
*/

/*
* The participants must smell, tasteand assess the sample so as to identify the tea type, 
	which can be : (1) white tea; (2) green tea; (3) black tea; or (4) herbal tea.
	At the end, the answers are checked to determine the number of correct guesses.

* The first line contains an integer T representing the tea type (1 ≤ T ≤ 4). 
	The second line contains five integers A, B, C, D and E, indicating the answer given by each contestant (1 ≤ A, B, C, D, E ≤ 4).

* Output a line with an integer representing the number of contestants who got the correct answer.
*/

#include <stdio.h>

int main() {
	int type, cnt = 0, arr[5];
	scanf("%d", &type);

	for (int i = 0; i < 5; i++) {
		scanf("%d", &arr[i]);

		if (arr[i] == type) {
			cnt++;
		}
	}

	printf("%d \n",cnt);

	return 0;
}
