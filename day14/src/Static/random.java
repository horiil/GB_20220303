package Static;

public class random {
	private static random current;

	public static random getInstance() {
		if (current == null) {
			current = new random();
		}
		return current;
	}

	public static void main(String[] args) {

		int random = (int) (Math.random() * (99999 - 10000 + 1) + 10000);
		System.out.println(random);
	}
}
