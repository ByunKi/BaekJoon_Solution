/*
    ID: adviate
    문제번호: 14652
    결과: 맞았습니다!!
    메모리: 1112KB
    시간: 300ms
    언어: C99 
	코드길이: 665B
    제출일시: 2021.09.06 21:42:35
*/

/*
1. 첫째 줄에 관중석의 크기를 나타내는 N, M과 잃어버린 관중석 번호를 나타내는 K가 주어진다. (1 ≤ N, M ≤ 30,000, 0 ≤ K ≤ N×M-1)
1-1. 배열을 만들지 못함. cnt를 이용해서 구한다.
2. 욱제의 잃어버린 자리를 찾아서, 잃어버린 자리의 좌표 (n, m)를 하나의 공백을 사이에 두고 숫자만 출력한다.
*/

#include <stdio.h>
#include <stdlib.h>

int main() {
	int N, M, K;
	int cnt = 0;
	scanf("%d %d %d", &N, &M, &K);

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cnt++;
            
			if (K == cnt) {
				printf("%d %d \n", K/M, K%M);
				break;
			}
		}
	}

	return 0;
}
