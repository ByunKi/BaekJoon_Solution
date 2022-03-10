/*
 * 제출 번호: 40195933
 * ID: adviate
 * 문제: 9243
 * 결과: 맞았습니다!!
 * 메모리: 14168 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 649 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		String A = reader.readLine(), B = reader.readLine();
		
		if(N % 2 == 0) { System.out.println(A.equals(B) ? "Deletion succeeded" : "Deletion failed"); }
		else {
			char[] arr = A.toCharArray();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == '0') { arr[i] = '1'; }
				else { arr[i] = '0'; }
			}
			A = new String(arr);
			System.out.println(A.equals(B) ? "Deletion succeeded" : "Deletion failed");
		}
	}
}
