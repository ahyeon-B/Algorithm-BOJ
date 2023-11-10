package Step03;

import java.util.*;

// A + B - 3 - A+B를 여러 번 출력하는 문제
public class st03_10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int []a = null;
		int []b = null;
		
		for(int i = 0; i < t; i++) {
			a = new int[t];
			b = new int[t];
		}
		
		for(int i = 0; i < t; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(a[i]+b[i]);
		}
		in.close();
	}

}
