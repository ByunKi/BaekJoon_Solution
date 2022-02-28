/*
 * 제출 번호: 39729451
 * ID: adviate
 * 문제: 5656
 * 결과: 맞았습니다!!
 * 메모리: 22696 KB
 * 시간: 324 ms
 * 언어: Java 11
 * 코드 길이: 936 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		int i=0;
		while(true) {
			i++;
			StringTokenizer stt = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(stt.nextToken());
			String b = stt.nextToken();
			int c = Integer.parseInt(stt.nextToken());
			if(b.charAt(0)=='E')break;
			if(b.charAt(0)=='=')ans.append("Case "+i+": "+(a==c)+"\n");
			else if(b.charAt(0)=='!')ans.append("Case "+i+": "+(a!=c)+"\n");
			else if(b.charAt(0)=='>') {
				if(b.length()==1) ans.append("Case "+i+": "+(a>c)+"\n");
				else ans.append("Case "+i+": "+(a>=c)+"\n");
			}
			else {
				if(b.length()==1) ans.append("Case "+i+": "+(a<c)+"\n");
				else ans.append("Case "+i+": "+(a<=c)+"\n");
			}
			
		}
		System.out.println(ans);
	}
}
