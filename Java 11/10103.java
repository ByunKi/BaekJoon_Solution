/*
 * 제출 번호: 39871078
 * ID: adviate
 * 문제: 10103
 * 결과: 맞았습니다!!
 * 메모리: 14068 KB
 * 시간: 116 ms
 * 언어: Java 11
 * 코드 길이: 553 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int Ascore = 100, Bscore = 100;
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
			
			if(A > B) { Bscore -= A; }
			else if(B > A) { Ascore -= B; }
		}
			System.out.println(Ascore);
			System.out.println(Bscore);
	}
}
