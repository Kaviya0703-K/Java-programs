package WhileLoop;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=0;
	while(n!=0) {
		int a = n%10;
        r=r*10+a;
        n=n/10;
	}
	System.out.println(""+r);
}
}
