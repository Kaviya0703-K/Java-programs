package IfStatement;
import java.util.Scanner;
public class PositiveNegativeZero {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	if(a>0) {
		System.out.println("Positive Number");
	}
	else if(a<0) {
		System.out.println("Negative Number");
	}
	else {
		System.out.println("Zero");
	}
	}
}