/*
 * 제출 번호: 38697946
 * ID: adviate
 * 문제: 17826
 * 결과: 맞았습니다!!
 * 메모리: 14304 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 744 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int num = Integer.parseInt(reader.readLine()), ans = -1;
		
		for(int i = 0; i < input.length; i++) {
			if(num == Integer.parseInt(input[i])) { ans = i; }
		}
		
		if(ans < 5) { System.out.println("A+"); }
		else if(ans < 15) { System.out.println("A0"); }
		else if(ans < 30) { System.out.println("B+"); }
		else if(ans < 35) { System.out.println("B0"); }
		else if(ans < 45) { System.out.println("C+"); }
		else if(ans < 48) { System.out.println("C0"); }
		else if(ans < 50) { System.out.println("F"); }
	}
}
