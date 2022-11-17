/*
 * 제출 번호: 51834309
 * ID: adviate
 * 문제: 2606
 * 결과: 맞았습니다!!
 * 메모리: 14264 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 1396 B
 */

import java.io.*;
import java.util.*;

public class Main {
	
	public static int cnt_bfs_list(int v, ArrayList<ArrayList<Integer>> list, boolean[] visited) {
		int cnt = 0;
		Queue<Integer> queue = new LinkedList<>();
		visited[v] = true;
		queue.add(v);
		
		while(queue.size() != 0) {
			v = queue.poll();
			cnt++;
			
			Iterator<Integer> it = list.get(v).listIterator();
			while(it.hasNext()) {
					int n = it.next();
					if(!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> g = new ArrayList<>();
		
		int N = Integer.valueOf(reader.readLine()), E = Integer.valueOf(reader.readLine());
		boolean[] visited = new boolean[N+1];
		for (int i = 0; i <= N+1; i++) { g.add(new ArrayList<>()); }
		
		for(int i = 0; i < E; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]);
			
			g.get(a).add(b);
			g.get(b).add(a);
		}
		
	    for(int i = 1; i <= N; i++){ Collections.sort(g.get(i)); }
	    int cnt = cnt_bfs_list(1, g, visited);
	    System.out.println(cnt == 0 ? 0 : cnt-1);
		writer.close();
		reader.close();
	}
}
