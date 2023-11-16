package Step04;

import java.util.*;

// 최소, 최대 - 최솟값과 최댓값을 찾는 문제
public class st04_10818 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = 0;
		int max = 0;
		int []arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[0] + " " + arr[n-1]);		
		in.close();
	}

}
