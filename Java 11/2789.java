/*
 * 제출 번호: 37751612
 * ID: adviate
 * 문제: 2789
 * 결과: 맞았습니다!!
 * 메모리: 17620 KB
 * 시간: 200 ms
 * 언어: Java 11
 * 코드 길이: 695 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		StringBuffer buffer = new StringBuffer(input.length());
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E':
				break;

			//			case 'C':
			//			case 'A':
			//			case 'M':
			//			case 'B':
			//			case 'R':
			//			case 'I':
			//			case 'D':
			//			case 'G':
			//			case 'E':
			//				break;
			default:
				buffer.append(input.charAt(i));
				break;
			}
		}
		System.out.println(buffer.toString());
	}
}
