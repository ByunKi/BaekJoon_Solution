/*
 * 제출 번호: 44442203
 * ID: adviate
 * 문제: 4483
 * 결과: 맞았습니다!!
 * 메모리: 14596 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 1086 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {	
			int N = Integer.valueOf(reader.readLine());
			String[] names = new String[N];
			boolean[] checks = new boolean[N];
			for(int j = 0; j < names.length; j++) { names[j] = reader.readLine(); }

			int D = Integer.valueOf(reader.readLine());
			String[][] sentence = new String[D][];
			for(int j = 0; j < sentence.length; j++) { sentence[j] = reader.readLine().split(" "); }

			System.out.println("Test set " + (i + 1) + ":");
			for(int j = 0; j < sentence.length; j++) {
				for(int k = 0; k < sentence[j].length; k++) {
					for(int l = 0; l < names.length; l++) {
						if(sentence[j][k].equals(names[l])) { checks[l] = true; }
					}
				}
			}

			for(int k = 0; k < names.length; k++) { System.out.println(checks[k] == true ? names[k] + " is present" : names[k] + " is absent"); }
			System.out.println();
		}
	}
}
