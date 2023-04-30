package Tables;

public class Tables {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Multiplication table for " + i + ":");
			for (int j = 1; j <= 20; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
