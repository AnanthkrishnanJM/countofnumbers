package countofnumbers;
import java.util.Arrays;
import java.util.Scanner;

public class Count {
	public static int[] countSmall(int A[],int n) {
		
		int p[]=new int[A.length];
		for(int i=0;i<n;i++) {
			p[i]=0;
			for(int j=i+1;j<n;j++) {
				if(A[j]<A[i]) {
					p[i]++;
				}
			}
			
		}
		return p;
	}

	public static void main(String[] args) {
		
		Scanner B=new Scanner(System.in);
		int n=B.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=B.nextInt();
		}
		int[] value=countSmall(A,n);
		System.out.println(Arrays.toString(value));

	}
}
