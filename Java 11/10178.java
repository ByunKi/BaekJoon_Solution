/*
 * 제출 번호: 35899231
 * ID: adviate
 * 문제: 10178
 * 결과: 맞았습니다!!
 * 메모리: 18212 KB
 * 시간:  216 ms
 * 언어: Java 11
 * 코드 길이: 216 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			int candies = scanner.nextInt();
			int bros = scanner.nextInt();
			
			System.out.println("You get " + (candies / bros) + " piece(s) and your dad gets " + (candies % bros) + " piece(s).");
		}
		
		scanner.close();
	}
}
