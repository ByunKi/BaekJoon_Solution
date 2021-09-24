/*
* 제출 번호: 33681433
* 아이디: adviate
* 문제: 8718
* 결과: 맞았습니다!!
* 메모리: 2020KB
* 시간: 0ms
* 언어: C++17
* 코드 길이: 624B
* 제출한 시간: 2021.09.24 14:56:36
*/

/*
*  x 리터의 눈 . 아시아가 전화통화를 하고 있는 동안 카시아는 눈사람을 만들기로 했다. 
   아시아가 말을 끝냈을 때, 카시아는 이미 으로 하나의 공을 만들었다 k 리터의 눈 . 

*  입력의 첫 번째 줄에는 두 개의 정수 x , k (1 ≤ x ≤ 10^6 , 1 ≤ k ≤ 10^5 , k < x )가 있는데, 이는 각각 공원에 있는 눈의 리터 수와 리터 수를 나타냅니다. 
   눈의 눈덩이 중 하나를 확인 합니다.

* 출력의 첫 번째이자 유일한 줄에는 눈사람의 최대 크기와 동일한 정수 하나가 포함되어야 합니다
  결과를 밀리리터 단위로 입력	
*/

#include <iostream>

using namespace std;

void printSnowmanSize(int x, int k)
{
	x *= 1000;

	// k가 제일 작은 경우
	int kSmallest = 7000 * k;

	if (kSmallest <= x)
	{
		cout << kSmallest << "\n";

		return;
	}

	// k가 가운데
	int kMiddle = 3500 * k;

	if (kMiddle <= x)
	{
		cout << kMiddle << "\n";

		return;
	}

	// k가 제일 큰 경우
	int kBiggest = 1750 * k;

	if (kBiggest <= x)
	{
		cout << kBiggest << "\n";

		return;
	}

	// 조건 만족 못함
	cout << 0 << "\n";
}

int main(void)
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	int x, k;
	cin >> x >> k;

	printSnowmanSize(x, k);

	return 0;
}
