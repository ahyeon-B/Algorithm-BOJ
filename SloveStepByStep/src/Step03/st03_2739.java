package Step03;

import java.util.*;

// 구구단 - 구구단을 출력하는 문제
public class st03_2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		in.close();
	}

}
