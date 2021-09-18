/*
* 제출 번호: 33503691
* 아이디: adviate
* 문제: 6764
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 492B
* 제출한 시간: 2021.09.18 22:05:37
*/

/*
* there are four consecutive depth readings which form a strictly increasing sequence (such as 3 4 7 9) (which we will call “Fish Rising”), or
  there are four consecutive depth readings which form a strictly decreasing sequence (such as 9 6 5 2) (which we will call “Fish Diving”), or
  there are four consecutive depth readings which are identical (which we will call “Constant Depth”).

* The input will be four positive integers, representing the depth readings. Each integer will be on its own line of input.

* The output is one of four possibilities. If the depth readings are increasing, then the output should be Fish Rising. 
  If the depth readings are decreasing, then the output should be Fish Diving. 
  If the depth readings are identical, then the output should be Fish At Constant Depth. 
  Otherwise, the output should be No Fish.
*/

#include <iostream>

using namespace std;

int main() {
	int ary[4];
	for (int i = 0; i < 4; i++) {
		cin >> ary[i];
	}

	if (ary[0] < ary[1] && ary[1] < ary[2] && ary[2] < ary[3]) {
		cout << "Fish Rising" << endl;
	}
	else if (ary[0] > ary[1] && ary[1] > ary[2] && ary[2] > ary[3]) {
		cout << "Fish Diving" << endl;
	}
	else if (ary[0] == ary[1] && ary[1] == ary[2] && ary[2] == ary[3]) {
		cout << "Fish At Constant Depth" << endl;
	}
	else {
		cout << "No Fish" << endl;
	}

	return 0;
}
