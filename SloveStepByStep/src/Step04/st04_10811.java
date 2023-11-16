package Step04;

import java.util.*;
import java.io.*;

// 바구니 뒤집기 - 배열을 뒤집는 문제
public class st04_10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int left = Integer.parseInt(st.nextToken()) - 1;
			int right = Integer.parseInt(st.nextToken()) - 1;
			
			while(left < right) {
				int temp = arr[left];
				arr[left++] = arr[right];
				arr[right--] = temp;
			}
		}
		br.close();
		
		for(int num:arr)
			System.out.print(num + " ");
	}

}
