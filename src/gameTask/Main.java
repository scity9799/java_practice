package gameTask;

import java.util.Scanner;

public class Main {//클래스 시작
	public static void main(String[] args) {//main 시작
		
		Scanner sc = new Scanner(System.in);
		
		Character character = null;

		while(character == null) {//while1 시작
			System.out.println("===캐릭터 선택===");
			System.out.println("1. 마법사");
			System.out.println("2. 전사");
			System.out.println("3. 로그");
		
			int choice = sc.nextInt();			
		
			switch(choice) {//switch1 시작
				case 1 :
					character = new Wizard();
					System.out.println("마법사 선택");																
					break;
				case 2 :
					character = new Warrior();
					System.out.println("전사 선택");
					break;
				case 3 :
					character = new Rogue();
					System.out.println("로그 선택");
					break;
				default :
					System.out.println("잘못 선택했습니다. 다시 선택하세요");	
			}//switch1 끝
		}//while1 끝
					
		boolean run = true;	
		
		while(run) {//while2 시작
			System.out.println("1. 기본공격");
			System.out.println("2. 스킬공격");
			System.out.println("3. 특수공격");
			System.out.println("4. 종료");
				
			int attack = sc.nextInt();
			sc.nextLine();
								
			switch(attack) {//switch2 시작
				case 1 :
					character.normalAttack();
					break;
				case 2 :
					character.skillAttack();
					break;
				case 3:
					character.specialAttack();
					break;
				case 4:
					System.out.println("게임종료");
					run = false;
					break;
				default :
						System.out.println("잘못 입력했습니다. 다시 입력하세요");
				}//switch2 끝
			}//while2 끝
			sc.close();
	}//main 끝
}//클래스 끝
