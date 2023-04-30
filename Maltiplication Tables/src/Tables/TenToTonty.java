package Tables;

public class TenToTonty {

	public static void main(String[] args) {
		for (int i = 10; i <= 10; i++) {
			System.out.println("Multiplication table of " + i);
			System.out.println("____________________________\n");
			for (int j = 1; j <= 20; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("");
		}
	}

}
