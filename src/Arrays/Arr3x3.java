package Arrays;
import java.util.Scanner;
public class Arr3x3 {
	    public static void main(String[] args) {
	        if (args.length != 9) {
	            System.out.println("Please enter 9 integer numbers");
	            return;
	        }
	        int[][]arr=new int[3][3];
	        int index=0;
	        for(int i=0;i<3;i++) {
	            for(int j=0;j<3;j++) {
	                arr[i][j]=Integer.parseInt(args[index]);
	                index++;
	            }
	        }
	        for(int i=0;i<3;i++) {
	            for(int j=0;j<3;j++) {
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }
	        int max=arr[0][0];
	        for(int i=0;i<3;i++) {
	            for(int j=0;j<3;j++) {
	                if(arr[i][j]>max) {
	                    max=arr[i][j];
	                }
	            }
	        }
	        System.out.println("The biggest number: "+max);
	    }
	}
