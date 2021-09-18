/*
* 제출 번호: 33504574	
* 아이디: adviate
* 문제: 13136
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 204B
* 제출한 시간: 2021.09.18 22:29:17
*/

/*
* 각 CCTV는 N행 N열의 직사각형 영역의 좌석을 촬영할 수 있다.
* 모든 좌석을 전부 촬영하도록 CCTV를 배치할 때, 최소 몇 개의 CCTV가 필요할까?

* 첫 번째 줄에 좌석의 세로 크기, 가로 크기 R, C와 한 대의 CCTV가 수용할 수 있는 범위 N이 주어진다. 
  (1 ≤ R, C, N ≤ 1,000,000)

* 모든 좌석을 전부 촬영하도록 CCTV를 배치할 때, 필요한 CCTV의 최소 개수를 출력한다.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main() {
	long long R, C, N;
	cin >> R >> C >> N;
	cout << (R / N + (R%N > 0 ? 1 : 0)) * (C / N + (C % N > 0 ? 1 : 0)) << endl;
	return 0;
}
