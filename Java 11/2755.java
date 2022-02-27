/*
 * 제출 번호: 39672959
 * ID: adviate
 * 문제: 2755
 * 결과: 맞았습니다!!
 * 메모리: 14568 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 983 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		double sum = 0, tmp = 0;
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			double grade = 0.0;
			switch (input[2]) {
				case "A+": grade = 4.3; break;
				case "A0": grade = 4.0; break;
				case "A-": grade = 3.7; break;
				case "B+": grade = 3.3; break;
				case "B0": grade = 3.0; break;
				case "B-": grade = 2.7; break;
				case "C+": grade = 2.3; break;
				case "C0": grade = 2.0; break;
				case "C-": grade = 1.7; break;
				case "D+": grade = 1.3; break;
				case "D0": grade = 1.0; break;
				case "D-": grade = 0.7; break;
				case "F": grade = 0; break;
			}
			sum += (grade * Integer.valueOf(input[1]));
			tmp += Integer.valueOf(input[1]);
		}
		System.out.printf("%.2f \n", (sum / tmp));
	}
}
