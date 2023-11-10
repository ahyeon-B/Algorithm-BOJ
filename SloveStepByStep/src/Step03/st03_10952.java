package Step03;

import java.util.*;

// A + B - 5 - 0이 들어올 때까지 A+B를 출력하는 문제
public class st03_10952 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(true) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(a==0 && b==0)
				break;
			
			arr.add(a+b);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			Integer sum = arr.get(i);
			System.out.println(sum);
		}
		
		in.close();
	}

}