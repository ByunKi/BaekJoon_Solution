/*
 * 제출 번호: 42731289
 * ID: adviate
 * 문제: 1292
 * 결과: 맞았습니다!!
 * 메모리: 28380 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 566 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		
		String[] input = reader.readLine().split(" ");
		int begin = Integer.valueOf(input[0]), end = Integer.valueOf(input[1]), sum = 0;
		
		for(int i = 1; i <= end; i++) {
			for(int j = 0; j < i; j++) { list.add(i); }
		}
		
		for(int i = begin - 1; i < end; i++) { sum += list.get(i); }
		System.out.println(sum);
	}
}
