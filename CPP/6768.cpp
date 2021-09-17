/*
* 제출 번호: 33453277
* 아이디: adviate
* 문제: 6768
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 161B
* 제출한 시간: 2021.09.17 12:02:42
*/

/*
* A CCC soccer game operates under slightly different soccer rules. A goal is only counted if the 4 players,
  in order, who touched the ball prior to the goal have jersey numbers that are in strictly increasing numeric order with the highest number being the goal scorer.
  Players have jerseys numbered from 1 to 99 (and each jersey number is worn by exactly one player).
  Given a jersey number of the goal scorer, indicate how many possible combinations of players can produce a valid goal.


* The input will be the positive integer J (1 ≤ J ≤ 99), which is the jersey number of the goal scorer.

* The output will be one line containing the number of possible scoring combinations that could have J as the goal scoring jersey number.
*/

#include <iostream>

using namespace std;

int main() {
	int input;
	cin >> input;

	cout << ((input - 1) * (input - 2) * (input - 3)) / 6 << endl;

	return 0;
}
