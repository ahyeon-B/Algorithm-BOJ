package Step04;

import java.util.*;

// 개수 세기 - 배열을 입력받고 v를 찾는 문제
public class st04_10807 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int []arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int v = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == v)
				sum++;
		}
		
		System.out.println(sum);
		in.close();
	}

}