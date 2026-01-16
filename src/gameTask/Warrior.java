package gameTask;

public class Warrior extends Character{

	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}

	@Override
	public void skillAttack() {
		super.skillAttack();
		if(!checkMp(3)) {
			return;
		}
		this.mp -= 3;
		showStatus();
	}

	@Override
	public void specialAttack() {
		super.specialAttack();
		System.out.println(name + "이 특수 공격을 사용했습니다. 피해량 : " + this.specialDmg);
		this.hp -= 10;
		showStatus();
		revive();
	}
	
	void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다");
	}
}
