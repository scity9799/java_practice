package exam;

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int count = 0;
		while(true) {
			int dice1 = r.nextInt(6) + 1, dice2 = r.nextInt(6) + 1;
			count ++;
			if(dice1 == dice2) {
				System.out.println("나온 주사위 눈 : " + dice1);
				count ++;
				break;
			}
		}
		System.out.println("반복 횟수 : " + count);
	}
}
