/*
 * 제출 번호: 36723105
 * ID: adviate
 * 문제: 1100
 * 결과: 맞았습니다!!
 * 메모리: 17564 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 517 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0, flag = 1;

		for(int i = 0; i < 8; i++) {
			String input = scanner.next();
			String[] tmp = input.split("");
			
			for(int j = 0; j < 8; j++) {
				if(tmp[j].equals("F")) {
					if(flag > 0 && j % 2 == 0) {
						cnt++;
					} else if(flag < 0 && j % 2 != 0) {
						cnt++;
					}
				}
			}
			flag *= -1;
		}
		
		System.out.println(cnt);
		scanner.close();
	}
}
