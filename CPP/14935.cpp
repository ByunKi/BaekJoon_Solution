/*
* 제출 번호: 33364674
* 아이디: adviate
* 문제: 14935
* 결과: 맞았습니다!!
* 메모리: 2024KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 831B
* 제출한 시간: 2021.09.15 01:27:26
*/

/*
* 함수 F(x)는 입력으로 주어진 수 x의 첫 자리와 수 x의 자리수를 곱한 결과를 반환하는 함수이다.
* 정수 x 가 주어진다. (0 ≤ x ≤ 10^100) 
* 정수 x가 FA수 라면 FA를 출력하고, 아니라면 NFA를 출력한다. // NFA가 존재하나? 계속 적어지는 거 같은데....
  FA 밖에 없다.
*/

#include <iostream>
	
using namespace std;

int main() {
	string nums;
	cin >> nums;
	int digit = nums.size();

	// cout << (nums[0] - '0') * digit << endl;
	  // 곱하는 방식이 잘못된거 같은데?

	cout << "FA" << endl;
	// 예제를 잘 봅시다;;
	return 0;
}
