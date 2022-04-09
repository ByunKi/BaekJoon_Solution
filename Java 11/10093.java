/*
 * 제출 번호: 41727905
 * ID: adviate
 * 문제: 10093
 * 결과: 100점
 * 메모리: 27752 KB
 * 시간: 1068 ms
 * 언어: Java 11
 * 코드 길이: 620 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		long begin = Long.valueOf(input[0]), end = Long.valueOf(input[1]);
		
		if(begin > end) {
			System.out.println(begin - end - 1);
			for(long i = end + 1; i < begin; i++) { System.out.print(i + " "); }
		} else if(begin == end) {
			System.out.println(0);
		} else {
			System.out.println(end - begin - 1);
			for(long i = begin + 1; i < end; i++) { System.out.print(i + " "); }
		}
	}
}
