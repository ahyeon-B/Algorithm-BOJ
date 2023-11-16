package Step04;

import java.io.*;

// 최댓값 - 최댓값이 어디에 있는지 찾는 문제
public class st04_2562 {

	public static void main(String[] args) throws IOException {
		// BufferedReader를 사용하여 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		int max = arr[0];
		int index = 0;
		
		// 배열을 순회하면서 입력을 받고 최댓값과 그 위치를 찾는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
