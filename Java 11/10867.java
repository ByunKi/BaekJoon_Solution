/*
 * 제출 번호: 42690980
 * ID: adviate
 * 문제: 10867
 * 결과: 맞았습니다!!
 * 메모리: 27320 KB
 * 시간: 376 ms
 * 언어: Java 11
 * 코드 길이: 586 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < TC; i++) { set.add(Integer.valueOf(input[i])); }
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) { ans.append(it.next() + " "); }
		
		System.out.println(ans);
	}
}
