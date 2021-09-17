/*
* 제출 번호: 33454081
* 아이디: adviate
* 문제: 20976
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 341B
* 제출한 시간: 2021.09.17 12:40:09
*/

/*
* 3 つの整数 A, B, C が与えられる．これらのうち 2 番目に大きい数を出力せよ．
* 入力は以下の形式で標準入力から与えられる．
* A, B, C のうち，2 番目に大きい数を出力せよ．

* 1 ≦ A ≦ 100．
  1 ≦ B ≦ 100．
  1 ≦ C ≦ 100．
*/

#include <iostream>

using namespace std;

int main() {
	int nums[3], tmp;
	cin >> nums[0] >> nums[1] >> nums[2];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < (3 - 1) - i; j++) {
			if (nums[j] > nums[j + 1]) {
				tmp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = tmp;
			}
		}
	}

	cout << nums[1] << endl;

	return 0;
}
