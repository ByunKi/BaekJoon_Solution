/*
 * 제출 번호: 39764756
 * ID: adviate
 * 문제: 2592
 * 결과: 맞았습니다!!
 * 메모리: 14156 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 649 B
 */
 
 import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		int[] arr = new int[10], cnt = new int[10];
		int sum = 0, idx = 0;
		for(int i = 0; i < 10; i++) { 
			arr[i] = Integer.valueOf(reader.readLine());
			sum += arr[i]; 
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) { cnt[i]++; }
			}
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[idx] < cnt[i]) { idx = i;}
		}
		
		System.out.println(sum / 10);
		System.out.println(arr[idx]);
	}
}
