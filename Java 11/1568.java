/*
 * 제출 번호: 37250978
 * ID: adviate
 * 문제: 1568
 * 결과: 맞았습니다!!
 * 메모리: 17708 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 327 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(), K = 0, cnt = 0;;
		
		while(N > 0) {
			if(N >= K) {
				N -= K;
				cnt++;
			} else {
				K = 0;
			}
			K++;
		}
		
		System.out.println(cnt-1);
		scanner.close();
	}
}
