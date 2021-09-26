/*
* 제출 번호: 33740809
* 아이디: adviate
* 문제: 19698
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 156B
* 제출한 시간: 2021.09.26 12:38:40
*/

/*
*
* 
*/

#include <iostream>

using namespace std;

int main() {
	int N, W, H, L;
	cin >> N >> W >> H >> L;

	cout << min((W / L) * (H / L), N) << endl;
	return 0;
}
