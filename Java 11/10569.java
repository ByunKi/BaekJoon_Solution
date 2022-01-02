/*
 * 제출 번호: 36938559
 * ID: adviate
 * 문제: 10569
 * 결과: 맞았습니다!!
 * 메모리: 17696 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 321 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		for(int i = 0; i < TC; i++) {
			 int V = scanner.nextInt();
			 int E = scanner.nextInt();
			 
			 System.out.println(2 + E - V);
		}
		scanner.close();
	}
}
