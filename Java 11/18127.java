/*
 * 제출 번호: 37396178
 * ID: adviate
 * 문제: 18127
 * 결과: 맞았습니다!!
 * 메모리: 17708 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 336 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		long B = scanner.nextInt(), sum = 1;
		scanner.close();
		
		long cnt = sum;
		for(int i = 0; i < B; i++) {
			cnt += (A-2);
			sum += cnt;
		}
		
		System.out.println(sum);
	}
}
