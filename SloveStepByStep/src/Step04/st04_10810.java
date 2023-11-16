package Step04;

import java.util.*;

// 공 넣기 - 배열에 값을 쓰는 문제
public class st04_10810 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int []arr = new int[n];
		
		for(int a = 0; a < m; a++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int k = in.nextInt();
			
			for(int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
		}
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

}
