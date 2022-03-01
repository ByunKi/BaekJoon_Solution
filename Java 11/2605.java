/*
 * 제출 번호: 39766094
 * ID: adviate
 * 문제: 2605
 * 결과: 맞았습니다!!
 * 메모리: 14180 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 687 B
 */

import java.io.*;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<>();
		
	  	int length = Integer.valueOf(reader.readLine());
	  	String[] input = reader.readLine().split(" ");
	  	
	  	list.add(1);
	  	for(int i = 1; i < length; i++) { 
	  		if (Integer.valueOf(input[i]) == 0) { list.add(i + 1); }
	  		else if(Integer.valueOf(input[i]) > 0) {list.add(list.size() - Integer.valueOf(input[i]), i + 1);}
	  	}
	  	
	  	for(int i= 0; i < list.size(); i++) { System.out.print(list.get(i) + " "); }
	}
}
