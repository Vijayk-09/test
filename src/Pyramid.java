
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaceCount = 5;
		for (int i = 0; i < 6; i++) {

			int x = spaceCount;
			while (x > 0) {
				System.out.print(" ");
				x--;
			}
			for (int j = 0; j < 6; j++) {
				if (j <= i) {
					System.out.print("*" + " ");

				}

			}

			spaceCount--;

			System.out.println();
		}
	}
}
