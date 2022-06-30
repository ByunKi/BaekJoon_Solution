/*
 * 제출 번호: 45295113
 * ID: adviate
 * 문제: 11068
 * 결과: 맞았습니다!!
 * 메모리: 15192 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 982 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static ArrayList<Integer> initList(int num, int B) {
		ArrayList<Integer> tmpList = new ArrayList<>();
		
		while(num != 0) {
			tmpList.add(num % B);
			num /= B;
		}
		return tmpList;
	}
	
	public static <T> boolean isPalindrome(ArrayList<T> list) {
		for(int i = 0; i < (list.size() / 2); i++) {
			if(list.get(i) != list.get(list.size() - 1 - i)) { return false; }
		}
		return true;
	}
		
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int T = Integer.valueOf(reader.readLine());
		for(int i = 0; i < T; i++) {
			int num = Integer.valueOf(reader.readLine()), V = 0;
			
			for(int j = 2; j <= 64; j++) {
				ArrayList<Integer> list = initList(num, j);
				if(isPalindrome(list)) { V = 1; break; }
			}
			ans.append(V).append("\n");
		}
		System.out.println(ans);
	}
}
