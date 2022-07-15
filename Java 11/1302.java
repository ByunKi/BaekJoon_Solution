/*
 * 제출 번호: 46132881
 * ID: adviate
 * 문제: 1302
 * 결과: 맞았습니다!!
 * 메모리: 14304 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 721 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, Integer> map = new TreeMap<>();
		
		int N = Integer.valueOf(reader.readLine()), max = -1;
		for(int i = 0; i < N; i++) {
			String input = reader.readLine();
			
			if(map.containsKey(input)) { map.put(input, map.get(input) + 1); }
			else { map.put(input, 1); }
		}
		
		String book = "";
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			if(map.get(tmp) > max) { 
				max = map.get(tmp); 
				book = tmp; 
			}
		}
		System.out.println(book);
	}
}
