// 프로그래머스 같은 숫자는 싫어
// 처음 짠 코드 정확성 12.7 , 효율성 21.2
package programmers;

public class Test1 {
	public static void main(String[] args) {
		 
	     int[] arr = {4,4,4,3,3};
	     int[] result = new int[arr.length];
	     int index =0;
	     	     
	     for(int j=0,i=1; i<arr.length;i++) {
	    	 if(arr[i-1]==arr[i]) {
	    		 if(i==arr.length-1) {
	    			 index+=1;
	    			 result[j]=arr[arr.length-1];
	    			 j++;
	    		 }
	    		 else
	    			 continue;
	    	 }
	    	 else {
	    		 index+=1;
	    		 result[j]=arr[i-1];
	    		 j++;
	    		 }
	     }
	     
	     int[] answer = new int[index];

	     for(int i=0; i<index; i++) {
	    	 
	    	 answer[i]=result[i];
	     }
	     for(int i=0; i<index;i++) {
	    	 System.out.println(answer[i]);   
	 }
	}
}
