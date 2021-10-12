/*
제출 번호: 34322353
아이디: adviate
문제: 13063
결과: 맞았습니다!!
메모리:	2020KB
시간: 0ms
언어: C99
코드 길이: 942B
제출한 시간: 2021.10.12 14:32:17
*/

/*
* Suppose a bill is intended to put for vote on the floor in the parliament and you know that the Reformist party is against the bill. 
	You and your party-mates want to do lobbying on the independent members so that enough of them make or change their minds so that the bill is passed. 
	Your task is to find the minimum number of independent members that have to vote as you wish so that the bill is passed.

* There are multiple test cases in the input. Each test case appears in one line containing three space-separated integers n, m and k which respectively are the total number of members, the number of members in the Conservative Party and the number of members in the Reformist Party (1 ⩽ n, m, k ⩽ 1000, m+k ⩽ n). 
	The input terminates with a line containing 0 0 0 which should not be processed.

* For each test case, output a line containing the minimum number of independent members that have to vote as you wish so that the bill is passed. 
	Output -1, if there is no way to pass the bill.
*/

#include <stdio.h>
#include <math.h>

int main() {
	int totalMembers, conservative, reformist, independent;
	double majority;

	while (1) {
		scanf("%d %d %d", &totalMembers, &conservative, &reformist);
		independent = totalMembers - (conservative + reformist);
		majority = totalMembers / 2.0;

		if (totalMembers == 0 && conservative == 0 && reformist == 0) {
			break;
		}

		if (totalMembers >= conservative + reformist) {
			if (conservative >= majority) { // 보수정당이 과반수 보다 클 경우, 무조건 가결
				printf("0 \n");
			}
			else if (reformist >= majority) { // 진보정당이 과반수 보다 클 경우, 무조건 부결
				printf("-1 \n");
			}
			else if (majority > conservative) { // 과반수 이하 
				if (totalMembers % 2 == 0) { // 짝수면 +1 해준다. (8 3 3)
					printf("%d \n", (int)ceil(majority) - conservative + 1);
				}
				else {
					printf("%d \n", (int)ceil(majority) - conservative);
				}
			}

		}
	}

	return 0;
}
