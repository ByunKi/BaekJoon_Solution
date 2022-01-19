/*
 * 제출 번호: 37789898
 * ID: adviate
 * 문제: 11134
 * 결과: 맞았습니다!!
 * 메모리: 17784 KB
 * 시간: 236 ms
 * 언어: Java 11
 * 코드 길이: 361 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			long N = scanner.nextLong();
			int C = scanner.nextInt();
			long ans = N / C;
			
			if(N % C != 0) { ans++; }
			System.out.println(ans);
		}
		scanner.close();
	}
}
