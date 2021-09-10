/*
* 제출 번호: 33224742
* 아이디: adviate
* 문제: 5928
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 988B
* 제출한 시간: 2021.09.11 02:13:14
*/

/*
* Line 1: This line contains 3 space-separated integers, D H M, specifying the date and time at which Bessie ends the contest. 
* D will be an integer in the range 11..14 telling the day of the month; 
* H and M are hours and minutes on a 24-hour clock (so they range from H=0,M=0 at midnight up through H=23,M=59 at 11:59 PM).
* Line 1: The total number of minutes spent by Bessie in the contest, or -1 if her ending time is earlier than her starting time.
*/

#include <iostream>

using namespace std;

int main() {
	int D, H, M, startTime, finishTime;
	cin >> D >> H >> M;

	startTime = 11 + 11 * 60 + 11 * 60 * 24; // 11일, 11시, 11분
	finishTime = M + H * 60 + D * 60 * 24 ;

	if (finishTime < startTime) {
		cout << -1 << endl;
		return 0;
	}
	
	cout << finishTime - startTime << endl;
	return 0;
}
