/*
 * 제출 번호: 36746262
 * ID: adviate
 * 문제: 1225
 * 결과: 맞았습니다!!
 * 메모리: 21160 KB
 * 시간: 1268 ms
 * 언어: Java 11
 * 코드 길이: 480 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		String[] aArr = a.split("");
		String b = scanner.next();
		String[] bArr = b.split("");
		long rst = 0;
		
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				rst += (Integer.parseInt(aArr[i]) * Integer.parseInt(bArr[j]));
			}
		}
		
		System.out.println(rst);
		scanner.close();
	}
}
