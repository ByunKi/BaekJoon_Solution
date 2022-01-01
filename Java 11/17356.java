/*
 * 제출 번호: 36917212
 * ID: adviate
 * 문제: 17356
 * 결과: 맞았습니다!!
 * 메모리: 17996 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 300 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		
		System.out.println(1 / (1 + Math.pow(10, ((B - A) / 400))));
		scanner.close();
	}
}
