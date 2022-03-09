package programmers;
import java.util.Scanner;

class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b;i++) {
        	for(int j=0; j<a;j++) {
        		System.out.printf("*");
        	}System.out.print("\n");
    }
}

  
//프로그래머스 별찍기 
//System.out.println,   System.out.print ,   System.out.printf에 대해 알게 되었다.
  
