/*
 * 제출 번호: 45648406
 * ID: adviate
 * 문제: 4892
 * 결과: 맞았습니다!!
 * 메모리: 16356 KB
 * 시간: 180 ms
 * 언어: Java 11
 * 코드 길이: 483 B
 */

import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 1;
		while(true) {
			int N = Integer.valueOf(reader.readLine());
			if(N == 0) { break; }

			int rst = 3 * N;
			if(rst % 2 == 0) { rst /= 2;}
			else {rst = (rst + 1) / 2; }
			rst /= 3;

			System.out.println(num + ". " + ((3*N) % 2 == 0 ? "even " : "odd ") + rst);
			num++;
		}
	}
}
