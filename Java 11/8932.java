/*
 * 제출 번호: 35808717
 * ID: adviate
 * 문제: 8932
 * 결과: 맞았습니다!!
 * 메모리: 82596 KB
 * 시간:  984 ms
 * 언어: Java 11
 * 코드 길이: 798 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int a1 = (int) (9.23076 * Math.pow((26.7 - scanner.nextInt()), 1.835));
			int a2 = (int) (1.84523 * Math.pow((scanner.nextInt() - 75), 1.348));
			int a3 = (int) (56.0211 * Math.pow((scanner.nextInt() - 1.5), 1.05));
			int a4 = (int) (4.99087 * Math.pow((42.5 - scanner.nextInt()), 1.81));
			int a5 = (int) (0.188807 * Math.pow((scanner.nextInt() - 210), 1.41));
			int a6 = (int) (15.9803 * Math.pow((scanner.nextInt() - 3.8), 1.04));
			int a7 = (int) (0.11193 * Math.pow((254 - scanner.nextInt()), 1.88));
			
			System.out.println(a1+a2+a3+a4+a5+a6+a7);
		}
		
		scanner.close();
	}
}
