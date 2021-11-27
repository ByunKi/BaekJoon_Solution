/*
 * 제출 번호: 35808531
 * ID: adviate
 * 문제: 5717
 * 결과: 맞았습니다!!
 * 메모리: 17540 KB
 * 시간:  220 ms
 * 언어: Java 11
 * 코드 길이: 332 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int M = 1;
		int F = 1;
		
		while(true) {
			M = scanner.nextInt();
			F = scanner.nextInt();
			
			if(M == 0 && F == 0) {
				break;
			}
			
			System.out.println(M+F);
		}
		scanner.close();
	}
}
