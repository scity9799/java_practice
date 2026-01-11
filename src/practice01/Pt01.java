package practice01;

import java.util.Scanner;

//점수를 입력받아
//90점 이상 A
//80점 이상 B
//70점 이상 C
//그 외 F 를 출력하세요
public class Pt01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else{
			System.out.println("F");
		}
		sc.close();
	}
}
