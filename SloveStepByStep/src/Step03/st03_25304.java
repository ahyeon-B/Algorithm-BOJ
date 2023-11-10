package Step03;

import java.util.*;

// 영수증 - 💸
public class st03_25304 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int num = in.nextInt();
		int sum = 0;
	
		for(int i = 0; i < num; i++) {
			int price = in.nextInt();
			int quan = in.nextInt();
			sum += price * quan;
		}
		
		if(sum == total) 
			System.out.println("Yes");
		else
			System.out.println("No");
		
		in.close();
	}

}
