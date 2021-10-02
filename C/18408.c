/*
제출 번호: 33973154
아이디: adviate
문제: 18408
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 268B
제출한 시간: 2021.10.02 15:21:54
*/

/*
*3 つの整数 A, B, C が与えられる．
	A, B, C はそれぞれ 1 または 2 である．
	1 と 2 のうち，どちらが多くあるか．

* 入力は以下の形式で標準入力から与えられる．
	A B C

* 1 と 2 のうち，個数が多い方を出力せよ．

*/

#include <stdio.h>

int main() {
	int intAry[3], cnt = 0;

	scanf("%d %d %d", &intAry[0], &intAry[1], &intAry[2]);

	for (int i = 0; i < 3; i++) {
		if (intAry[i] == 1) {
			cnt++;
		}
	}

	if (cnt > 1) {
		printf("1 \n");
	}
	else {
		printf("2 \n");
	}

	return 0;
}
