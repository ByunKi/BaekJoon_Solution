#include <stdio.h>
#include <string.h>
#include <math.h>

// 형식지정자 사용
/*
int main() {
	int num;
	scanf("%x", &num);
	printf("%d \n",num);

	return 0;
}
*/ 

// 진법의 특성
int main() {
	int sum = 0, length, power;

	char hex_ary[7] = { 0 }; // 저장할 공간
	scanf("%s",hex_ary);

	length = strlen(hex_ary);
	power = length - 1; // 0 부터 시작을 함.

	for (int i = 0; i < length; i++) {
		switch (hex_ary[i]) {
			case 'A':
				sum += 10 * pow(16, power--);
				break;
			case 'B':
				sum += 11 * pow(16, power--);
				break;
			case 'C':
				sum += 12 * pow(16, power--);
				break;
			case 'D':
				sum += 13 * pow(16, power--);
				break;
			case 'E':
				sum += 14 * pow(16, power--);
				break;
			case 'F':
				sum += 15 * pow(16, power--);
				break;
			default:
				sum += (hex_ary[i] - 48) * pow(16, power--); // 0 ~ 9
				break;
		}
	}

	printf("%d",sum);

	return 0;
}
