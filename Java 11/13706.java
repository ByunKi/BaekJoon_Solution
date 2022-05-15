/*
 * 제출 번호: 43318284
 * ID: adviate
 * 문제: 13706
 * 결과: 맞았습니다!!
 * 메모리: 14404 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 303 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger ans = new BigInteger(reader.readLine());
		System.out.println(ans.sqrt());
	}
}
