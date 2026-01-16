package gameTask;

public class Wizard extends Character{
	//생성자
	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);		
	}

	@Override
	public void normalAttack() {
		super.normalAttack();		
		this.hp -=  2;
		showStatus();
	}

	@Override
	public void skillAttack() {
		super.skillAttack();
		if(!checkMp(10)) {
			return;
		}
		this.mp -= 10;
		showStatus();
	}

	@Override
	public void specialAttack() {
		System.out.println("마법사는 특수공격이 없습니다");
	}
	
}
