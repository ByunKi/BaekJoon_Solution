/*
 * 제출 번호: 38298423
 * ID: adviate
 * 문제: 15953
 * 결과: 맞았습니다!!
 * 메모리: 15396 KB
 * 시간: 200 ms
 * 언어: Java 11
 * 코드 길이: 823 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] prizeTable1 = {500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10 };
		int[] prizeTable2 = {512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), ans = 0;
			
			if(a >= 1 && a <= 21) { ans += prizeTable1[a-1]; } 
			if(b >= 1 && b <= 31) { ans += prizeTable2[b-1]; } 
			System.out.println(ans*10000);
		}
 	}
}
