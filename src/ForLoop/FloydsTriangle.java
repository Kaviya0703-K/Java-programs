package ForLoop;
import java.util.Scanner;
public class FloydsTriangle {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        int rows=sc.nextInt();
	        int a=1;
	        for(int i=1;i<=rows;i++) {
	            for(int j=1;j<=i;j++) {
	                System.out.print(a+ " ");
	                a++;
	            }
	            System.out.println();
	        }
	    }
	}