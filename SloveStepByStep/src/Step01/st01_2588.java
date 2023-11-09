package Step01;

import java.util.*;

// 곱셈 - 빈 칸에 들어갈 수는?
public class st01_2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		in.close();
	}

}
