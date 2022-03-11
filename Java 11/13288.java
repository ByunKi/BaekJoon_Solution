/*
 * 제출 번호: 40294158
 * ID: adviate
 * 문제: 13288
 * 결과: 맞았습니다!!
 * 메모리: 14292 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 1156 B
 */

import java.io.*;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		HashMap<Character, String> map = new HashMap<>();
		
		map.put('a', "@");
		map.put('b', "8");
		map.put('c', "(");
		map.put('d', "|)");
		map.put('e', "3");
		map.put('f', "#");
		map.put('g', "6");
		map.put('h', "[-]");
		map.put('i', "|");
		map.put('j', "_|");
		map.put('k', "|<");
		map.put('l', "1");
		map.put('m', "[]\\/[]");
		map.put('n', "[]\\[]");
		map.put('o', "0");
		map.put('p', "|D");
		map.put('q', "(,)");
		map.put('r', "|Z");
		map.put('s', "$");
		map.put('t', "']['");
		map.put('u', "|_|");
		map.put('v', "\\/");
		map.put('w', "\\/\\/");
		map.put('x', "}{");
		map.put('y', "`/");
		map.put('z', "2");
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLetter(input.charAt(i))) { ans.append(map.get(Character.toLowerCase(input.charAt(i)))); }
			else { ans.append(input.charAt(i)); }
		}
		
		System.out.println(ans);		
	}
}
