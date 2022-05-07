/*
 * 제출 번호: 42947877
 * ID: adviate
 * 문제: 4796
 * 결과: 맞았습니다!!
 * 메모리: 16492 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 504 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int cases = 1;
		while(!(input = reader.readLine()).equals("0 0 0"))  {
			 String[] tmp = input.split(" ");
			 int L = Integer.valueOf(tmp[0]), P = Integer.valueOf(tmp[1]), V = Integer.valueOf(tmp[2]);
			 
			 System.out.println("Case " + (cases++) + ": " + (V / P * L + Math.min(V % P, L)));
		}
	}
}
