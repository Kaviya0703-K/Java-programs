package ForLoop;
public class PrimeNum {
	    public static void main(String[] args) {
	        for(int n=10;n<=99;n++) {
	            int count=0;
	            for(int i=2;i<=n/2;i++) {
	                if(n%i==0) {
	                    count++;
	                    break;
	                }
	            }
	            if(count==0) {
	                System.out.print(n+" ");
	            }
	        }
	    }
	}