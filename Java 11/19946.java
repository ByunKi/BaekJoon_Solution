/*
 * 제출 번호: 37557626
 * ID: adviate
 * 문제: 19946
 * 결과: 맞았습니다!!
 * 메모리: 17904 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 380 B
 */
	
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger input = scanner.nextBigInteger();
		scanner.close();
		int k = 64;
		
		while(input.mod(BigInteger.TWO).equals(BigInteger.valueOf(0))) {
			input = input.divide(BigInteger.TWO);
			k--;
		}

		System.out.println(k);
		scanner.close();
	}
}
