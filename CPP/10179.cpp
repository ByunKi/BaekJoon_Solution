/*
* 제출 번호: 33373046
* 아이디: adviate
* 문제: 10179
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 1030B
* 제출한 시간: 2021.09.15 11:44:38
*/

/*
* 당신은 어떤 물건이라도 20% 할인해주는 쿠폰을 가지고 있다.
  원래 가격이 주어질 때, 쿠폰을 사용하면 얼마가 되는지 알려주는 프로그램을 작성하시오.

* 첫 번째 줄에 테스트케이스의 수가 주어진다.
  각 줄에는 물건의 원래가격이 소수점 둘째자리까지 주어진다.

* 할인된 가격을 달러 단위로 출력한다.
  나누어떨어지지 않을 때는 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다.
*/

#include <iostream>

using namespace std;

int main() {
	double Tc;
	cin >> Tc;

	double *ary = new double[(size_t)Tc]();
	for (int i = 0; i < Tc; i++) {
		cin >> ary[i];
		ary[i] *= 0.8;
	}

	for (int i = 0; i < Tc; i++) {
		printf("$%0.2lf \n",ary[i]);
	}

	delete[] ary;
	return 0;
}
