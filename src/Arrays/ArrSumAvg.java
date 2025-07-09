package Arrays;
import java.util.Scanner;
public class ArrSumAvg {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int a=sc.nextInt();
	        int[]num=new int[a];
	        int sum=0;
	        for (int i=0;i<a;i++) {
	            num[i]=sc.nextInt();
	            sum+=num[i];
	        }
	        double avg=(double)sum/a;
	        System.out.println("Sum of array elements: "+sum);
	        System.out.println("Average of array elements: "+ avg);
	    }
	}
