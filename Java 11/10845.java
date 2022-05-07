/*
 * 제출 번호: 42955235
 * ID: adviate
 * 문제: 10845
 * 결과: 맞았습니다!!
 * 메모리: 19080 KB
 * 시간: 228 ms
 * 언어: Java 11
 * 코드 길이: 1113 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		LinkedList<Integer> queue = new LinkedList<>();
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			
			switch(input[0]) {
				case "push": queue.add(Integer.valueOf(input[1])); break;
				case "pop":	{
					try { ans.append(queue.remove() + "\n"); } 
					catch (NoSuchElementException e) { ans.append(-1 + "\n"); }
					break;
				}
				case "size": ans.append(queue.size() + "\n"); break;
				case "empty": ans.append((queue.isEmpty() ? 1 : 0) + "\n"); break;
				case "front": {
					if(queue.size() > 0) { ans.append(queue.peekFirst() + "\n"); }
					else { ans.append(-1 + "\n"); }
					break;
				} 
				case "back": {
					if(queue.size() > 0) { ans.append(queue.peekLast() + "\n"); }
					else { ans.append(-1 + "\n"); }
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
