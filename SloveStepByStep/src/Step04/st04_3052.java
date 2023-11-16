package Step04;

import java.util.*;

// 나머지 - 배열을 활용하여 서로 다른 값의 개수를 찾는 문제
public class st04_3052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
	
		for(int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		}
		
		in.close();
		System.out.print(h.size());
	}

}