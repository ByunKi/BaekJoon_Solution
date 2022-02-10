/*
 * 제출 번호: 38857347
 * ID: adviate
 * 문제: 12778
 * 결과: 맞았습니다!!
 * 메모리: 20740 KB
 * 시간: 556 ms
 * 언어: Java 11
 * 코드 길이: 732 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] type = reader.readLine().split(" ");
			String problem = reader.readLine();
			
			if(type[1].equals("C")) {
				problem = problem.replaceAll(" ", "");
				for(int j = 0; j < problem.length(); j++) { System.out.print(problem.charAt(j) - 'A' + 1 + " "); }
			} else {
				String[] tmp = problem.split(" ");
				for(int j = 0; j < tmp.length; j++) { System.out.print((char)(Integer.parseInt(tmp[j]) + 'A' - 1) + " "); }
			} 
			System.out.println();
		}
	}
}
