package Step03;

import java.util.*;

// 합 - 1부터 N까지의 합을 구하는 문제, 물론 반복문 없이 풀 수도 있습니다.
public class st03_8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		in.close();
	}

}
