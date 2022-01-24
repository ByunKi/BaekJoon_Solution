/*
 * 제출 번호: 38052761
 * ID: adviate
 * 문제: 5074
 * 결과: 맞았습니다!!
 * 메모리: 14396 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 814 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine(); String[] tmp = input.split(" ");
			if(tmp[0].equals("00:00") && tmp[1].equals("00:00")) { break; }

			int Day = 0, Min = 0, Hour = 0, time = 0;
			time = Integer.parseInt(tmp[0].split(":")[0]) * 60 + Integer.parseInt(tmp[0].split(":")[1]) + Integer.parseInt(tmp[1].split(":")[0]) * 60 + Integer.parseInt(tmp[1].split(":")[1]);
			Day = time / (60 * 24) ;
			Hour = time / 60 % 24;
			Min = time % 60;
			
			if(Day > 0) { System.out.printf(String.format("%02d:%02d +%d \n", Hour, Min, Day)); } 
			else { System.out.printf(String.format("%02d:%02d\n", Hour, Min)); }
		}
 	}
}
