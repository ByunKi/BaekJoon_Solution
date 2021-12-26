/*
 * 제출 번호: 
 * ID: adviate
 * 문제: 15917
 * 결과: 
 * 메모리: 
 * 시간: 
 * 언어: Java 11
 * 코드 길이: 670 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
			
		for(int i = 0; i < testCases; i++) {
			int num = scanner.nextInt();
			
			if((num & (-num)) == num) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		scanner.close();
	}
}
