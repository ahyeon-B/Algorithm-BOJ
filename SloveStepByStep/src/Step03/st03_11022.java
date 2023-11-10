package Step03;

import java.util.*;

// A + B - 8 - A+B를 바로 위 문제보다 아름답게 출력하는 문제
public class st03_11022 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int []a = new int[t];
		int []b = new int[t];
		int []arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			arr[i] = a[i] + b[i];
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " +a[i] + " + " + b[i] + " = " + arr[i]);
		}
		
		in.close();
	}

}
