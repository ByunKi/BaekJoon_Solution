/*
 * 제출 번호: 37986569
 * ID: adviate
 * 문제: 24309
 * 결과: 맞았습니다!!
 * 메모리: 14336 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 386 B
 */

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(reader.readLine()), b = new BigInteger(reader.readLine()), c = new BigInteger(reader.readLine());
		System.out.println((b.subtract(c)).divide(a));
	}
}
