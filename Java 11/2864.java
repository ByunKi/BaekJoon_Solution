/*
 * 제출 번호: 37497614
 * ID: adviate
 * 문제: 2864
 * 결과: 맞았습니다!!
 * 메모리: 18368 KB
 * 시간: 224 ms
 * 언어: Java 11
 * 코드 길이: 467 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next(), B = scanner.next();
		A = A.replaceAll("5", "6"); B = B.replaceAll("5", "6");
		int max = Integer.parseInt(A) + Integer.parseInt(B);
		
		A = A.replaceAll("6", "5"); B = B.replaceAll("6", "5");
		int min = Integer.parseInt(A) + Integer.parseInt(B);
		scanner.close();
		System.out.println(min + " " + max);
	}
}
