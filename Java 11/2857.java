/*
 * 제출 번호: 37752069
 * ID: adviate
 * 문제: 2857
 * 결과: 맞았습니다!!
 * 메모리: 18172 KB
 * 시간: 224 ms
 * 언어: Java 11
 * 코드 길이: 515 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean isFBI = false;
		String[] arr = new String[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
			if(arr[i].contains("FBI")) { isFBI = true; }
		}
		scanner.close();
		
		if(isFBI) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].contains("FBI")) { System.out.print((i + 1) + " "); }
			}
		} else {
			System.out.println("HE GOT AWAY!");
		}
	}
}
