/*
 * 제출 번호: 37692747
 * ID: adviate
 * 문제: 16944
 * 결과: 맞았습니다!!
 * 메모리: 17728 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 1312 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		String input = scanner.next();
		scanner.close();
		
		boolean digit = false, lower = false, upper = false, special = false;
		for(int i = 0; i < length; i++) {
			char c = input.charAt(i);
			
			if(Character.isDigit(c)) {
				digit = true;
			} else if(Character.isLowerCase(c)) {
				lower = true;
			} else if(Character.isUpperCase(c)) {
				upper = true;
			}
			
			switch (c) {
//			case '!', '@', '#', '$', '%', '^', '&', '*', '(', ')' ,'-', '+':
//				special = true;
//				break;
			case '!':
				special = true;
				break;
			case '@':
				special = true;
				break;
			case '#':
				special = true;
				break;
			case '$':
				special = true;
				break;
			case '%':
				special = true;
				break;
			case '^':
				special = true;
				break;
			case '&':
				special = true;
				break;
			case '*':
				special = true;
				break;
			case '(':
				special = true;
				break;
			case ')':
				special = true;
				break;
			case '-':
				special = true;
				break;
			case '+':
				special = true;
				break;
			}
		}
		
		int cnt = 0;
		if(!digit) { cnt++; }
		if(!lower) { cnt++; }
		if(!upper) { cnt++; }
		if(!special) { cnt++; }
		
		if(length + cnt >= 6) {
			System.out.println(cnt);
		} else {
			System.out.println(6 - length);
		}
	}
}
