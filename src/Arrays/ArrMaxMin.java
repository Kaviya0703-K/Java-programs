package Arrays;
import java.util.Scanner;
public class ArrMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int a=sc.nextInt();
        if (a>0) {
            int[]num=new int[a];
            for(int i=0;i<a;i++) {
                num[i]=sc.nextInt();
            }
            int max=num[0];
            int min=num[0];
            for(int i=1;i<a;i++) {
                if(num[i]>max) {
                    max=num[i];
                }
                if(num[i]<min) {
                    min=num[i];
                }
            }
            System.out.println("Maximum Value: "+max);
            System.out.println("Minimum Value: "+min);
        }
    }
}
