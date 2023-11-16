package Step04;

import java.util.*;
// 공 바꾸기 - 배열의 값을 교환하는 문제
public class st04_10813 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int []arr = new int[n];
		
		for(int a = 0; a < n; a++) {
			arr[a] = a + 1;
		}
		
		for(int b = 0; b < m; b++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		
		for(int c = 0; c < n; c++) {
			System.out.print(arr[c] + " ");
		}
		
		in.close();
	}

}
