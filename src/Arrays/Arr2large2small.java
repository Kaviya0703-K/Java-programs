package Arrays;
import java.util.Scanner;
public class Arr2large2small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        if(n>=2) {
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int large=Integer.MIN_VALUE;
            int large2=Integer.MIN_VALUE;
            int small=Integer.MAX_VALUE;
            int small2=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                int num=arr[i];
                if(num>large) {
                    large2=large;
                    large=num;
                } else if(num>large2&&num!=large) {
                    large2=num;
                }
                if(num<small) {
                    small2=small;
                    small=num;
                } else if(num<small2&&num!=small) {
                    small2=num;
                }
            }
            System.out.println("Largest: "+large);
            System.out.println("Second Largest: "+large2);
            System.out.println("Smallest: "+small);
            System.out.println("Second Smallest: "+small2);
        }
    }
}
