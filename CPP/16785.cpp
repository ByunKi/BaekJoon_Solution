/*
* 제출 번호: 33360992
* 아이디: adviate
* 문제: 16785
* 결과: 100점
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 869B
* 제출한 시간: 2021.09.14 23:48:13
*/

/*
* 이 소셜 게임은 1 일당 1 회 로그인 할 수 있으며 로그인 할 때마다 A 동전을 얻을 수있다.
* 월요일부터 일요일까지 7 일 연속 로그인하면 그때마다 추가로 B 동전을 얻을 수있다.
* JOI 군이 적어도 C 동전을 얻기 위해 로그인해야하는 횟수의 최소값을 구하라.

* 입력은 다음 형식으로 표준 입력으로부터 주어진다. A B C
* JOI 군이 적어도 C 동전을 얻기 위해 로그인해야하는 횟수의 최소값을 출력하라.
*/

#include <iostream>
#include <cmath>
#include <algorithm>

using namespace std;

const int WEEK = 7;

int main() {
	int A, B, C;
	cin >> A >> B >> C;

	int weeklyScore = WEEK * A + B;
	int result = C / weeklyScore * WEEK + min((int)ceil((double)(C % weeklyScore) / (double)A), WEEK);

	cout << result << endl;

	return 0;
}
