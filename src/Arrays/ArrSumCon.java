package Arrays;
import java.util.Scanner;
public class ArrSumCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        boolean skip=false;
        for(int i=0;i<n;i++) {
            if(arr[i]==6) {
                skip=true; 
            } else if(arr[i]==7&&skip) {
                skip=false; 
            } else if(!skip) {
                sum=sum+arr[i];
            }
        }
        System.out.println(""+sum);
    }
}
