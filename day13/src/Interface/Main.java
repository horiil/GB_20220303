package Interface;

public abstract class Main {
	public static void main(String[] args) {
		Character user = new Character("주인공");
		Monster mob = new Monster("좀비");

		user.walk();
		user.run();
		user.jump();
		user.attack();
		user.shield();
		user.pickup();
		
		System.out.println("----------------------------------");

		mob.walk();
		mob.run();
		mob.jump();
		mob.attack();
		mob.shield();
	}
}
