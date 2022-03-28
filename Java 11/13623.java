/*
 * 제출 번호: 41136405
 * ID: adviate
 * 문제: 13623
 * 결과: 맞았습니다!!
 * 메모리: 14300 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 969 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		if((input[0].equals("0") && input[1].equals("0") && input[2].equals("0")) || (input[0].equals("1") && input[1].equals("1") && input[2].equals("1"))) { System.out.println("*"); }
		else if((input[0].equals("0") && input[1].equals("1") && input[2].equals("1")) || (input[0].equals("1") && input[1].equals("0") && input[2].equals("0"))) { System.out.println("A"); }
		else if((input[0].equals("1") && input[1].equals("0") && input[2].equals("1")) || (input[0].equals("0") && input[1].equals("1") && input[2].equals("0"))) { System.out.println("B"); }
		else if((input[0].equals("1") && input[1].equals("1") && input[2].equals("0")) || (input[0].equals("0") && input[1].equals("0") && input[2].equals("1"))) { System.out.println("C"); }
	}
}
