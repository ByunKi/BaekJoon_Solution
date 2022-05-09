/*
 * 제출 번호: 43046293
 * ID: adviate
 * 문제: 10814
 * 결과: 맞았습니다!!
 * 메모리: 57360 KB
 * 시간: 816 ms
 * 언어: Java 11
 * 코드 길이: 815 B
 */

import java.io.*;

class Node {
	public int age;
	public String name;
	
	Node(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine()), cnt = N;
		Node[] arr = new Node[N];
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			arr[i] = new Node(Integer.valueOf(input[0]), input[1]);
		}
		
		for(int i = 1; i <= 200; i++) {
			for(int j = 0; j < N; j++) {
				if(i == arr[j].age) { 
					ans.append(arr[j].age + " " + arr[j].name + "\n");
					cnt--;
				}
			}
			if(cnt < 1) { break; }
		}
		System.out.println(ans);
	}
}
