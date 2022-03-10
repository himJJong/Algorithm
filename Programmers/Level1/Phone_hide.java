package programmers;

public class Test1 {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String answer = "";
		String str = phone_number.substring(0,phone_number.length()-4);
		String str2 = phone_number.substring(phone_number.length()-4,phone_number.length());
		for(int i=0 ; i<phone_number.length()-4;i++) {
			answer+="*";
		}
		System.out.println(answer+str2);
	}

}

//프로그래멋 휴대폰 번호 숨기기
//substring, replace 
