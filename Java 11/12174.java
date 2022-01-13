/*
 * 제출 번호: 37485486
 * ID: adviate
 * 문제: 12174
 * 결과: 맞았습니다!!
 * 메모리: 32944 KB
 * 시간: 696 ms
 * 언어: Java 11
 * 코드 길이: 745 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < TC; i++) {
			int num = scanner.nextInt();
			scanner.nextLine();
			
			String input = scanner.nextLine();
			input = input.replaceAll("O", "0");	input = input.replaceAll("I", "1");
			
			String[] arr = new String[num];
			int beginIdx = 0, endIdx = 7;
			
			System.out.print("Case #" + (i+1) + ": ");
			for(int j = 0; j < arr.length; j++, beginIdx += 8, endIdx += 8) {
				arr[j] = input.substring(beginIdx, endIdx+1);
				System.out.print((char) Integer.parseInt(arr[j], 2));
			}
			System.out.println();
		}
		scanner.close();
	}
}
