/*
 * 제출 번호: 36940398
 * ID: adviate
 * 문제: 23348
 * 결과: 맞았습니다!!
 * 메모리: 27880 KB
 * 시간: 356 ms
 * 언어: Java 11
 * 코드 길이: 684 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] techniques = new int [3];
		for(int i = 0; i < techniques.length; i++) {
			techniques[i] = scanner.nextInt();
		}

		int TC = scanner.nextInt(), score = 0, maxScore = 0;
		for(int i = 0; i < TC; i++) {
			for(int j = 0; j < 3; j++) {
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int num3 = scanner.nextInt();
				score += techniques[0]*num1 + techniques[1]*num2 + techniques[2]*num3;
			}
			if(score > maxScore) {
				maxScore = score;
			}
			score = 0;
		}
		
		System.out.println(maxScore);
		scanner.close();
	}
}
