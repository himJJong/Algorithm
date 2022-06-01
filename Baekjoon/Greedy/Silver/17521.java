import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int days;			// 날짜 
		long money = 0;		// 처음 가지고 있는 돈 
		int[] price;		// 저장되어있는 코인 값 
		long coin = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		days = Integer.parseInt(st.nextToken());
		money = Long.parseLong(st.nextToken());

		price = new int[days];

		for (int i = 0; i < days; i++) {
		    price[i] = Integer.parseInt(br.readLine());    
		}
		
				//5754278534
		for(int i=0; i<days-1; i++) {
			if(coin==0&&price[i]<price[i+1]) {	//	코인 구매 
				coin = (money/price[i]);
				money-=coin*price[i];
				
			}
			if(price[i]>price[i+1]) {	// 코인 판매 
				money += price[i]*coin;
				coin = 0;
			}
		}
		if(coin!=0) {
			money += coin*price[days-1];
		}
		System.out.println(money);
	}
}
