/*
제출 번호: 33087978
아이디: adviate
문제: 10699
결과: 맞았습니다!!
메모리: 1112KB
시간: 0ms
언어: C99
코드 길이: 278B
제출한 시간: 2021.09.07 17:13:50
*/

/*
1. 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
*/

#include <stdio.h>
#include <time.h>


int main() {
	time_t timer = time(NULL);
	struct tm* t = localtime(&timer);

	printf("%d-%02d-%02d \n", (t->tm_year+1900), (t->tm_mon+1),t->tm_mday);
	return 0;
}
