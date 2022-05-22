/*
 * 제출 번호: 43626877
 * ID: adviate
 * 문제: 4378
 * 결과: 맞았습니다!!
 * 메모리: 14164 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 2149 B
 */

import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String input;
		while((input = reader.readLine()) != null) {
			for(int i = 0; i < input.length(); i++) {
				switch(input.charAt(i)) {
					case '1': ans.append("`"); break;
					case '2': ans.append("1"); break;
					case '3': ans.append("2"); break;
					case '4': ans.append("3"); break;
					case '5': ans.append("4"); break;
					case '6': ans.append("5"); break;
					case '7': ans.append("6"); break;
					case '8': ans.append("7"); break;
					case '9': ans.append("8"); break;
					case '0': ans.append("9"); break;
					case '-': ans.append("0"); break;
					case '=': ans.append("-"); break;
					case ' ': ans.append(" "); break;
					case '/': ans.append("."); break;
					case '.': ans.append(","); break;
					case '\'': ans.append(";"); break;
					case '\\': ans.append("]"); break;
					case ']': ans.append("["); break;
					case 'S': ans.append("A"); break;
					case 'N': ans.append("B"); break;
					case 'V': ans.append("C"); break;
					case 'F': ans.append("D"); break;
					case 'R': ans.append("E"); break;
					case 'G': ans.append("F"); break;
					case 'H': ans.append("G"); break;
					case 'J': ans.append("H"); break;
					case 'O': ans.append("I"); break;
					case 'K': ans.append("J"); break;
					case 'L': ans.append("K"); break;
					case ';': ans.append("L"); break;
					case ',': ans.append("M"); break;
					case 'M': ans.append("N"); break;
					case 'P': ans.append("O"); break;
					case '[': ans.append("P"); break;
					case 'W': ans.append("Q"); break;
					case 'T': ans.append("R"); break;
					case 'D': ans.append("S"); break;
					case 'Y': ans.append("T"); break;
					case 'I': ans.append("U"); break;
					case 'B': ans.append("V"); break;
					case 'E': ans.append("W"); break;
					case 'C': ans.append("X"); break;
					case 'U': ans.append("Y"); break;
					case 'X': ans.append("Z"); break;
				}
			}
			ans.append("\n");
		}
		System.out.println(ans);
	}
}
