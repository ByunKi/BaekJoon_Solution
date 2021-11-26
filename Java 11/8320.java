/*
 * 제출 번호: 35791398
 * ID: adviate
 * 문제: 8320
 * 결과: 맞았습니다!!
 * 메모리: 17620KB
 * 시간:  204ms
 * 언어: Java 11
 * 코드 길이: 318B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; (i * j) <= n; j++) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
    //  n + ((n / 2) - 1);
		scanner.close();
	}
}
