/*
제출 번호: 34266180
아이디: adviate
문제: 4153
결과: 맞았습니다!!
메모리:	1116KB
시간: 0ms
언어: C99
코드 길이: 688B
제출한 시간: 2021.10.10 17:59:08
*/

/*
* 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

* 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 
	각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

* 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다. 
*/

#include <stdio.h>

int main() {
	int arr[3] = { 0 };
	int rst = 0;

	while (1) {
		rst = 0;
		scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);
		

		if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
			return 0;
		}

		if (arr[2] > arr[1] && arr[2] > arr[0]) {
			if ((arr[2] * arr[2]) == (arr[1] * arr[1]) + (arr[0] * arr[0])) {
				rst = 1;
			}
		}
		else if (arr[1] > arr[2] && arr[1] > arr[0]) {
			if ((arr[1] * arr[1]) == (arr[2] * arr[2]) + (arr[0] * arr[0])) {
				rst = 1;
			}
		}
		else {
			if ((arr[0] * arr[0]) == (arr[1] * arr[1]) + (arr[2] * arr[2])) {
				rst = 1;
			}
		}

		if (rst >= 1) {
			printf("right \n");
		}
		else {
			printf("wrong \n");
		}

	}

	return 0;
}
