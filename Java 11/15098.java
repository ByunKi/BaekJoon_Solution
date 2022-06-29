/*
 * 제출 번호: 45233859
 * ID: adviate
 * 문제: 15098
 * 결과: 맞았습니다!!
 * 메모리: 14132 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 467 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		
		boolean flag = true;
		String[] input = reader.readLine().split(" ");
		for(String s : input) {
			if(set.contains(s)) { flag = false; break; }
			else { set.add(s); }
		}
		
		System.out.println(flag ? "yes" : "no");
	}
}
