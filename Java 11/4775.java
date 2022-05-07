/*
 * 제출 번호: 42982872
 * ID: adviate
 * 문제: 4775
 * 결과: 맞았습니다!!
 * 메모리: 24148 KB
 * 시간: 284 ms
 * 언어: Java 11
 * 코드 길이: 919 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();

		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) { set.add(reader.readLine()); }

		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			ArrayList<String> list = new ArrayList<>();
			
			String input;
			while(!(input = reader.readLine()).equals("-1")) {
				if(!set.contains(input)) { list.add(input); }
			}
			
			if(list.size() < 1) { System.out.println("Email " + (i + 1) + " is spelled correctly."); } 
			else {
				System.out.println("Email " + (i + 1) + " is not spelled correctly.");
				for(int j = 0; j < list.size(); j++) { System.out.println(list.get(j)); }
			}
		}
		System.out.println("End of Output");
	}
}
