/*
 * 제출 번호: 35899145
 * ID: adviate
 * 문제: 9610
 * 결과: 맞았습니다!!
 * 메모리: 22980 KB
 * 시간:  348 ms
 * 언어: Java 11
 * 코드 길이: 670 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = scanner.nextInt();
		int axis = 0, q1 = 0, q2 = 0, q3 = 0, q4 = 0;
		
		for(int i = 0; i < nums; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if(x == 0 || y == 0) {
				axis++;
			} else if (x > 0 && y > 0) {
				q1++;
			} else if (x < 0 && y > 0) {
				q2++;
			} else if (x < 0 && y < 0) {
				q3++;
			} else if (x > 0 && y < 0) {
				q4++;
			}
		}
		System.out.println("Q1: " + q1 + "\n" + "Q2: " + q2 + "\n" + "Q3: " + q3 + "\n" + "Q4: " + q4 + "\n" + "AXIS: " + axis);
		scanner.close();
	}
}
