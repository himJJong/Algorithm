package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int craynenum = sc.nextInt();
			ArrayList<Integer> crayne = new ArrayList<>();
			for(int i=0; i<crayne.size(); i++) {
				crayne.add(sc.nextInt());
			}
			
			int boxnum = sc.nextInt();
			ArrayList<Integer> box = new ArrayList<>();
			for(int i=0; i<box.size();i++) {
				box.add(sc.nextInt());
			}
			
			Collections.sort(crayne, Collections.reverseOrder());
			Collections.sort(box, Collections.reverseOrder());
			
			if(crayne.get(0)<box.get(0)) {
				System.out.println(-1);
			}
			else {
				int answer = 0;
				while(!box.isEmpty()) {
					int idx = 0;
					for(int i=0; i<crayne.size();) {
						if(crayne.get(i)>=box.get(idx)) {
							box.remove(idx);
							i++;
						}
						else if(idx == box.size()) {
							break;
						}
						else {
							idx++;
						}
					}
					answer++;
				}
				
			System.out.println(answer);
		}
}
}
