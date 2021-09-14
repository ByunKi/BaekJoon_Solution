/*
* 제출 번호: 33363661
* 아이디: adviate
* 문제: 11943
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 1461B
* 제출한 시간: 2021.09.15 00:55:30
*/

/*
* 두 개의 바구니에 사과와 오렌지가 있다. 첫 번째 바구니에는 사과 A개와 오렌지 B개가 있으며 두 번째 바구니에는 사과 C개와 오렌지 D개가 있다.

* 당신은 한 바구니에 있는 과일 하나를 집어서 다른 바구니로 옮길 수 있다. 이런 식으로 과일을 옮길 때, 한 바구니에는 사과만 있게 하고 다른 쪽에는 오렌지만 있게 하려고 한다.
  앞서 말한 조건을 만족하도록 과일을 옮길 때, 과일을 옮기는 최소 횟수를 구하는 프로그램을 작성하여라.

* 첫 번째 줄에는 첫 번째 바구니에 있는 사과와 오렌지의 수 A, B가 주어진다. (0 ≤ A, B ≤ 1,000)
  두 번째 줄에는 두 번째 바구니에 있는 사과와 오렌지의 수 C, D가 주어진다. (0 ≤ C, D ≤ 1,000)


* 사과와 오렌지를 옮기는 최소 횟수를 출력한다.
*/

#include <iostream>

using namespace std;

int main() {
	int A, B, C, D;
	cin >> A >> B;
	cin >> C >> D;
	// A를 옮기면 D를 옮겨야함, B를 옮기면 C를 옮겨야함 → A+D, B+C

	/*
	if (A+D > B+C) {
		cout << B + C << endl;
	}
	cout << A + D << endl;
	*/

	cout << min(A + D, B + C) << endl; // 최소값을 구하는 함수 min 사용
	// 내장 함수활용 능력이 부족한거 같다.
	return 0;
}