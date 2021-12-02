/*
 * 제출 번호: 35960775
 * ID: adviate
 * 문제: 3460
 * 결과: 맞았습니다!!
 * 메모리: 18208 KB
 * 시간:  228 ms
 * 언어: Java 11
 * 코드 길이: 508 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] binArr;
		int cnt = 0;
		
		int testCase = scanner.nextInt();
		for(int i = 0; i < testCase; i++) {
			int num = scanner.nextInt();
			cnt = 0;
			binArr = Integer.toBinaryString(num).split("");
			
			for(int j = binArr.length-1; j >= 0; j--) {
				if (binArr[j].equals("1")) {
					System.out.print(cnt + " ");
				}
				cnt++;
			}
			
		}
		
		scanner.close();
	}
}
