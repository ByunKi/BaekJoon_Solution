/*
 * 제출 번호: 42338026
 * ID: adviate
 * 문제: 16546
 * 결과: 맞았습니다!!
 * 메모리: 21020 KB
 * 시간: 232 ms
 * 언어: Java 11
 * 코드 길이: 501 B
 */
 
 import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		String input[] = reader.readLine().split(" ");
		boolean[] arr = new boolean[N + 1];
		
		for(int i = 0; i < input.length; i++) { arr[Integer.valueOf(input[i])] = true; }
		for(int i = 1; i <= arr.length; i++) { 
			if(!arr[i]) { System.out.println(i); break; }
		}
	}
}
