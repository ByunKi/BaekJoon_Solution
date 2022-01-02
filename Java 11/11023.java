/*
 * 제출 번호: 36938667
 * ID: adviate
 * 문제: 11023
 * 결과: 맞았습니다!!
 * 메모리: 17696 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 347 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] tmp = input.split(" ");
		int sum = 0;
		for(int i = 0; i < tmp.length; i++) {
			sum += Integer.parseInt(tmp[i]);
		}
		System.out.println(sum);
		scanner.close();
	}
}
