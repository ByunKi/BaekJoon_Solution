/*
 * 제출 번호: 37161127
 * ID: adviate
 * 문제: 12756
 * 결과: 맞았습니다!!
 * 메모리: 17660 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 651 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] attack = new int[2];
		int[] life = new int[2];
		for(int i = 0; i < 2; i++) {
			attack[i] = scanner.nextInt();
			life[i] = scanner.nextInt();
		}
		
		while(life[0] > 0 && life[1] > 0) {
			life[0] -= attack[1];
			life[1] -= attack[0];
			
			//System.out.println(life[0] + " " + life[1]);
		}
		
		if(life[0] > life[1]) {
			System.out.println("PLAYER A");
		} else if(life[0] <= 0 && life[1] <= 0) {
			System.out.println("DRAW");
		} else {
			System.out.println("PLAYER B");
		}
		
		scanner.close();
	}
}
