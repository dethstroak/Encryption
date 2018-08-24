import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Encrypt {

	static Scanner in = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {

		System.out.print("Enter the phrase to be encrypted: ");
		char[] inputChar = in.nextLine().toCharArray();

		ArrayList<Character> arrayList = new ArrayList<Character>(inputChar.length + 2);

		int[] keyValues = { random.nextInt(2), // Operation
							random.nextInt(9) + 1 // Shift value
		};

		// System.out.println("keyValues[0] = " + keyValues[0] + "\nkeyValues[1] = " +
		// keyValues[1]);

		for (int i = 0; i < (inputChar.length); i++) {
			arrayList.add(inputChar[i]);
		}
		arrayList.add((char) ('.' -keyValues[0]));
		arrayList.add((char) (')' - keyValues[1]));

		// System.out.println(arrayList.toString());

		for (int i = 0; i < arrayList.size() - 2; i++) {
				switch (keyValues[0]) {
				case 0:
					arrayList.set(i, (char) ((arrayList.get(i) + keyValues[1]) % 255));
					break;
				case 1:
					arrayList.set(i, (char) ((arrayList.get(i) - keyValues[1]) % 255));
					break;
			}
		}

		// System.out.println(arrayList.toString());

		System.out.print("\nEncrypted: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}

	}

}
