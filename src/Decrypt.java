import java.util.Scanner;
public class Decrypt {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the phrase to be decrypted: ");
		char[] toDecrypt = in.nextLine().toCharArray();
		
		int[] keyValues = {'.' - toDecrypt[toDecrypt.length - 2],
						   ')' - toDecrypt[toDecrypt.length - 1]};
		
//		System.out.println("keyValues[0] =" + keyValues[0] + "\nkeyValues[1] =" + keyValues[1]);
		
		char outputChar[] = new char[toDecrypt.length -2]; 
		
		for(int i = 0; i < outputChar.length; i++) {
				switch(keyValues[0]) {
				case 0:
					outputChar[i] = (char)(toDecrypt[i] - keyValues[1]);
					break;
				case 1:
					outputChar[i] = (char)(toDecrypt[i] + keyValues[1]);
					break;
				}
		}
		
		System.out.print("\nThe original text was: ");
		
		for(int i = 0; i < outputChar.length; i++) {
			System.out.print(outputChar[i]);
		}
		
	}
	
}
