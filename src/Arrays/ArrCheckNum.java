package Arrays;
import java.util.Scanner;
public class ArrCheckNum {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n=sc.nextInt();
	        int[]arr=new int[n];
	        for(int i=0;i<n;i++) {
	            arr[i]=sc.nextInt();
	        }
	        System.out.print("Enter the number to search: ");
	        int num=sc.nextInt();
	        int a=-1;
	        for(int i=0;i<n;i++) {
	            if(arr[i]==num) {
	                a=i;
	                break;
	            }
	        }
	        System.out.println(a);
	    }
	}
