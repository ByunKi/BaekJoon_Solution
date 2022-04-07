/*
 * 제출 번호: 41669979
 * ID: adviate
 * 문제: 3183
 * 결과: 맞았습니다!!
 * 메모리: 14036 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 869 B
 */

import java.io.*;

public class Main {
	public static boolean isLeap(int Y) {
		if(Y % 4 == 0 && Y % 100 != 0) { return true; }
		else if(Y % 400 == 0) { return true; }
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			int D = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]), Y = Integer.valueOf(input[2]);
			if(D == 0 && M == 0 && Y == 0) { break; }

			boolean isValid = true;
			if(M < 1 || M > 12) { isValid = false; }
			else if(D < 1 || D > days[M]) { isValid = false; }
			else if(!isLeap(Y) && M == 2 && D == 29) { isValid = false; }
			
			System.out.println(isValid ? "Valid" : "Invalid");
		}
	}
}
