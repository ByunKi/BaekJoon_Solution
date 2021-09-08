/*
제출 번호: 33127876	
아이디:adviate
문제:1297
결과:맞았습니다!!
메모리:2032KB
시간: 0ms
언어: C++17 
코드 길이: 786B
제출한 시간: 2021.09.08 16:46:31
*/

/*
* 첫째 줄에 TV의 대각선 길이 D, TV의 높이 비율 H, TV의 너비 비율 W이 공백 한 칸을 사이에 두고 주어진다.
* 첫째 줄에 TV의 높이와 TV의 너비를 공백 한 칸을 이용해서 구분지은 후 출력한다. 만약, 실제 TV의 높이나 너비가 소수점이 나올 경우에는 그 수보다 작으면서 가장 큰 정수로 출력한다. (예) 1.7 -> 1

    5 ≤ D ≤ 1,000
    1 ≤ H ≤ 99
    2 ≤ W ≤ 100
    H < W
    D, H, W는 정수
*/

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int D, W, H;
    double ratio;
	cin >> D >> H >> W;
    
    ratio = sqrt(pow(D, 2) / (pow(W, 2) + pow(H, 2)));
    cout << (int)floor(ratio * H) << " " << (int)floor(ratio * W) << endl;

	return 0;
}
