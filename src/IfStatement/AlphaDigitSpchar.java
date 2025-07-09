package IfStatement;
import java.util.Scanner;
public class AlphaDigitSpchar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			System.out.println("Alphabhet");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}