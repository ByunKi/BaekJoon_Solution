/*
 * 제출 번호: 44634237
 * ID: adviate
 * 문제: 1977
 * 결과: 맞았습니다!!
 * 메모리: 15952 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 532 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int begin = Integer.valueOf(reader.readLine()), end = Integer.valueOf(reader.readLine());
		long sum = 0, num = 0, min = 100000000;
		for(int i = 1; (num = i * i) <= end; i++) {
			if(num >= begin) {
				sum += num;
				if(num < min) { min = num; }
			}
		}
		
		System.out.println(sum <= 0 || min == 100000000 ? -1 : (sum + "\n" + min));
	}
}
