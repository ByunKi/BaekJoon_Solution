/*
 * 제출 번호: 36788720
 * ID: adviate
 * 문제: 1264
 * 결과: 맞았습니다!!
 * 메모리: 17688 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 811 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(true) {
			int cnt = 0;
			input = scanner.nextLine();
			if(input.equals("#")) {
				break;
			}
			
			for(int i = 0; i < input.length(); i++) {
				switch(input.charAt(i)) {
				case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
					cnt++;
					break;
//					case 'A':
//						cnt++;
//						break;
//					case 'a':
//						cnt++;
//						break;
//					case 'E':
//						cnt++;
//						break;
//					case 'e':
//						cnt++;
//						break;
//					case 'I':
//						cnt++;
//						break;
//					case 'i':
//						cnt++;
//						break;
//					case 'O':
//						cnt++;
//						break;
//					case 'o':
//						cnt++;
//						break;
//					case 'U':
//						cnt++;
//						break;
//					case 'u':
//						cnt++;
//						break;
				}
			}
			
			System.out.println(cnt);
		}
		scanner.close();
	}
}
