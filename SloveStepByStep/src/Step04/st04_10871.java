package Step04;

import java.util.*;

// X보다 작은 수 - 배열을 입력받고 X보다 작은 수를 찾는 문제
public class st04_10871 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < x)
				System.out.print(arr[i] + " ");
		}
		
		in.close();
	}

}