/*
 * 제출 번호: 43875406
 * ID: adviate
 * 문제: 4335
 * 결과: 맞았습니다!!
 * 메모리: 14420 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 704 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N, max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
		while((N = Integer.valueOf(reader.readLine())) != 0) {
			String answer = reader.readLine();
			
			if(answer.equals("right on")) { 
				ans.append(max > N && min < N ? "Stan may be honest" : "Stan is dishonest").append("\n");
				min = Integer.MIN_VALUE; max = Integer.MAX_VALUE;
			} 
			else if(answer.equals("too high")) { max = max > N ? N : max; }
			else { min = N > min ? N : min; }
		}
		System.out.println(ans);
	}
}
