// 단순 for 문과 substring을 통한 문자열 조합 - 시간 오래걸림(최악)

package programmers;

import java.util.*;

public class Test1 {
	
	public static void main(String[] args) {
	
		String strings[] = {"abce", "abcd", "cdx"};
		int n=2;
		
		for (int i=0; i<strings.length ;i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
			System.out.println(strings[i]);
		}
		Arrays.sort(strings);
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].substring(1);
			System.out.println(strings[i]);
		}
	}
}

// compareTo 이용한 코드 - 시간 효율적

package programmers;

import java.util.*;

public class Test1 {
	
	public static void main(String[] args) {
	
		String strings[] = {"abce", "abcd", "cdx"};
		int n=1;
		
		Arrays.sort(strings,(o1,o2)->{
			if(o1.charAt(n) > o2.charAt(n)) return 1;
			else if (o1.charAt(n) < o2.charAt(n)) return -1;
			return o1.compareTo(o2);
		});
		for(int i=0; i<strings.length;i++) {
		System.out.println(strings[i]);
		}
	}
}
