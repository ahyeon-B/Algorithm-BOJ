package Step03;

import java.util.*;

// A+B - 7 - A+B를 조금 더 아름답게 출력하는 문제
public class st03_11021 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int []arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			arr[i] = a + b;
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + arr[i]);
		}
		
		in.close();
	}

}