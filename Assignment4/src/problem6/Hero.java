package problem6;

public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

	@Override
	public void Swim() {
		System.out.println("Hero can swim");

	}

	@Override
	public void Fly() {
		System.out.println("Hero can fly");}}
