//백준 약수 구하기 2501

package algorithm;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int[] arr = new int[10001];
		int count = 0;
		
		for(int i=1; i<10001;i++) {
			if (a%i==0) {
				arr[count]=i;
				count++;
			}
			else {
				continue;
			}
		}
		
		System.out.println(arr[b-1]);
	}
}
