/*
제출 번호: 34001088
아이디: adviate
문제: 15059
결과: 맞았습니다!!
메모리:	1112KB
시간: 0ms
언어: C99
코드 길이: 382B
제출한 시간: 2021.10.03 11:55:57
*/

/*
* 이 항공편의 승무원은 절차를 변경하기로 결정했습니다. 먼저 그녀는 모든 승객들에게 어떤 식사를 선호하는지 묻고 각 선택에 대해 이 항공편에서 사용할 수 있는 식사 수가 충분한지 확인합니다. 
	각 선택에 사용할 수 있는 식사의 양과 각 선택에 대해 요청한 식사 수를 감안할 때, 기내식을 선택하지 않은 승객이 몇 명인지 승무원이 결정하도록 도와주시겠습니까? 

* 첫 번째 줄에는 세 개의 정수 C a , B a , P a (0 ≤ Ca , Ba , Pa ≤ 100)가 포함되어 있으며 각각 닭고기, 쇠고기 및 파스타에 사용할 수 있는 식사 수를 나타냅니다.
	 두 번째 줄은 세 개의 정수 C r , B r 및 P r (0 ≤ Cr ,Br ,Pr ≤ 100)을 포함하며 각각 닭고기, 쇠고기 및 파스타에 대해 요청된 식사 횟수를 나타냅니다. 

* 식사를 위해 선택을 받지 못할 승객의 수를 나타내는 정수로 한 줄을 출력하십시오. 
*/

#include <stdio.h>
#include <math.h>

int main() {
	int stockArr[3], requestArr[3], sum = 0;

	scanf("%d %d %d", &stockArr[0], &stockArr[1], &stockArr[2]);
	scanf("%d %d %d", &requestArr[0], &requestArr[1], &requestArr[2]);
	
	for (int i = 0; i < 3; i++) {
		if (stockArr[i] < requestArr[i]) {
			sum += abs(requestArr[i] - stockArr[i]);
		}
	}

	printf("%d \n", sum);

	return 0;
}
