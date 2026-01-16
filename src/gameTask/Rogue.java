package gameTask;

import java.util.Random;

public class Rogue extends Character{

	public Rogue() {
		super("로그", 20, 20, 3, 20, 0);
	}

	@Override
	public void normalAttack() {
		if (!checkMp(3)) {
			return;
		}
		super.normalAttack();
		this.mp -= 3;
		showStatus();
	}

	@Override
	public void skillAttack() {
		super.skillAttack();
		if(!checkMp(2) || hp < 5) {
			System.out.println("스킬이 발동되지 않습니다.");
			return;
		}
	}
	int[] damage = new int[81];
	@Override
	public void specialAttack() {
		super.specialAttack();
		Random r = new Random();
		int random = (r.nextInt(damage.length) + 20);
		System.out.println(random + "의 피해를 입혔습니다.");
		showStatus();
	}
