/*
제출 번호: 33979506
아이디: adviate
문제: 10944
결과: 	기다리는 중
메모리:	KB
시간: 0ms
언어: C99
코드 길이: 166B
제출한 시간: 2021.10.02 17:52:59
*/

/*
* 1부터 10,000까지 정수 중에서 하나를 출력한다. 
	이 수가 채점 프로그램이 랜덤으로 얻은 수와 같으면 이 문제를 맞힐 수 있다. 
	채점 프로그램은 채점을 할 때마다 랜덤을 수행한다.
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	int num;

	srand(time(NULL));
	num = rand() % 10000 + 1;
	
	printf("%d \n",num);

	return 0;
}
