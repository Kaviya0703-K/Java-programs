package IfStatement;
import java.util.Scanner;
public class GenderInterst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		int age = sc.nextInt();
		String g = gender.toLowerCase();
		if(gender.equals("female")) {
			if(age>=1&&age<=58) {
				System.out.println("Interest=8.2%");
			}
			else if(age>=59&&age<=100) {
				System.out.println("Interest=9.2%");
			}
			else {
				System.out.println("Invalid Age");
			}
		}
		else if(gender.equals("male")){
			if(age>=1&&age<=58) {
				System.out.println("Interest=8.2%");
			}
			else if(age>=59&&age<=100) {
				System.out.println("Interest=9.2%");
			}
			else {
				System.out.println("Invalid Age");
			}
		}
		else {
			System.out.println("Invalid Gender");
		}
	}
}