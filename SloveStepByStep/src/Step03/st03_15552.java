package Step03;

import java.io.*;
import java.util.*;

// 빠른 A+B - 빠르게 입력받고 출력하는 문제
public class st03_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	// 출력
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		
		br.close();		// BufferedReader를 닫아 입력 스트림 정리
        
		bw.flush();		// BufferedWriter의 출력 버퍼를 비워 실제 출력을 수행
		bw.close();		// BufferedWriter를 닫아 출력 스트림을 정리
	}

}
