/*
 * 제출 번호: 39923120
 * ID: adviate
 * 문제: 2948
 * 결과: 맞았습니다!!
 * 메모리: 14172 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 554 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		
		String[] input = reader.readLine().split(" ");
		int D = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);

		for(int i = 1; i < M; i++) { D += months[i]; }
		System.out.println(day[D % 7]);
	}
}
