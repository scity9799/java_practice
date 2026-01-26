package practice02;

import java.util.Arrays;

public class Ex06_12 {
	public static void main(String[] args) {
		int[] card = {3, 1, 4, 5, 10};
		int[] newCard = copyArray(card);
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		
		card[1] = 10;
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}
	public static int[] copyArray(int[] ar) {
		return Arrays.copyOf(ar, ar.length);
	}
}
