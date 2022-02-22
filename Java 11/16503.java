/*
 * 제출 번호: 39452619
 * ID: adviate
 * 문제: 16503
 * 결과: 맞았습니다!!
 * 메모리: 14224 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 1124 B
 */

import java.io.*;

public class Main {
	public static int func(int a, char op, int b) {
		int rst = 0;
		
		switch (op) {
		case '+':
			rst = a + b;
			break;
		case '-':
			rst = a - b;
			break;
		case '*':
			rst = a * b;
			break;
		case '/':
			rst = a / b;
			break;
		default:
			break;
		}
		return rst;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		System.out.println(Math.min(func(func(Integer.parseInt(input[0]), input[1].charAt(0), Integer.parseInt(input[2])), input[3].charAt(0), Integer.parseInt(input[4])), func(Integer.parseInt(input[0]), input[1].charAt(0), func(Integer.parseInt(input[2]), input[3].charAt(0), Integer.parseInt(input[4])))));	
		System.out.println(Math.max(func(func(Integer.parseInt(input[0]), input[1].charAt(0), Integer.parseInt(input[2])), input[3].charAt(0), Integer.parseInt(input[4])), func(Integer.parseInt(input[0]), input[1].charAt(0), func(Integer.parseInt(input[2]), input[3].charAt(0), Integer.parseInt(input[4])))));
	}
}
