/*
 * 제출 번호: 46942914
 * ID: adviate
 * 문제: 7596
 * 결과: 맞았습니다!!
 * 메모리: 14440 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 760 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder ans = new StringBuilder();
		
		int cnt = 1;
		while(true) {
			int n = Integer.valueOf(reader.readLine());
			if (n == 0) { break; }
			
			ans.append(cnt++).append("\n");
			TreeSet<String> set = new TreeSet<>();
			for(int i = 0; i < n; i++) { set.add(reader.readLine()); }
			
			Iterator<String> it = set.iterator();
			while(it.hasNext()) { ans.append(it.next() + "\n"); }
		}
			writer.write(ans.toString());
			
			reader.close();
			writer.close();
	}
}
