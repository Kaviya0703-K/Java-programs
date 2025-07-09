package Arrays;
import java.util.Scanner;
public class ArrDuplicate {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n=sc.nextInt();
	        int[]a=new int[n];
	        for(int i=0;i<n;i++) {
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++) {
	            boolean found=false;
	            for(int j=0;j<i;j++) {
	                if(a[i]==a[j]) {
	                	found=true;
	                    break;
	                }
	            }
	            if(!found) {
	                System.out.print(a[i] +" ");
	            }
	        }
	    }
	}
