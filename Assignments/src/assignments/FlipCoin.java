package assignments;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		
		
		int n, hcount = 0, tcount = 0;
		double heads;
		double tails;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter num of times coin flip:");
		n = (int) scan.nextDouble();
	
		for(int j = 0; j < n; j++) {
			double random = Math.random();
			if(random<0.5)
				tcount++;
			else
				hcount++;
		}
		heads = hcount/(double)n*100;
		tails = tcount/(double)n*100;
		System.out.println("percentage of heads: " + heads + "%");
		System.out.println("percentage of tails: " + tails + "%");
	}

}
