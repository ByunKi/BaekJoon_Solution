// 정보
/*
제출 번호: 33430118
아이디: adviate
문제: 6763
결과: 맞았습니다!!
메모리: 1116KB
시간: 0ms
언어: C99
코드 길이: 517B 
제출한 시간: 2021.09.16 18:57:09
*/

// 문제 조건
/*
* Many communities now have “radar” signs that tell drivers what their speed is, in the hope that they will slow down.
You will output a message for a “radar” sign. The message will display information to a driver based on his/her speed according to the following table:

* The input will be two integers. The first line of input will be speed limit. The second line of input will be the recorded speed of the car.

* 

If the driver is not speeding, the output should be:

Congratulations, you are within the speed limit!

If the driver is speeding, the output should be:

You are speeding and your fine is $F.

where F is the amount of the fine as described in the table above.

* km/h over the limit 	Fine
1 to 20 	$100
21 to 30 	$270
31 or above 	$500
*/

// 풀이 과정
/*
* 

*/

#include <stdio.h>

int main() {
	int limit, speed;
	scanf("%d", &limit);
	scanf("%d", &speed);

	int speedGap = speed - limit;

	if (speedGap <= 0) {
		printf("Congratulations, you are within the speed limit! \n");
	}
	else {
		if (speedGap <= 20) {
			printf("You are speeding and your fine is $100. \n");
		} // 1 ~ 20
		else if (speedGap <= 30) {
			printf("You are speeding and your fine is $270. \n");
		} // 21 ~ 30
		else {
			printf("You are speeding and your fine is $500. \n");
		} // 31 ~
	}

	return 0;
}
