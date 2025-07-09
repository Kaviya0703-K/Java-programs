package Arrays;
import java.util.Scanner;
public class ArrAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the ASCII values:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print((char)a[i]);
        }
    }
}
