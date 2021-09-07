/*
제출 번호: 33088900
아이디: adviate
문제: 16170
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 242B
제출한 시간: 2021.09.07  17:31:50
*/

#include <stdio.h>
#include <time.h>

int main() {
	time_t timer = time(NULL);
	struct tm* t = localtime(&timer);
	t = gmtime(&timer);

	printf("%d \n",t->tm_year+1900);
	printf("%d \n",t->tm_mon+1);
	printf("%d \n",t->tm_mday);

	return 0;
}
