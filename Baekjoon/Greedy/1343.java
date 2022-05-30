import java.io.*;
import java.util.*;


public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//입력 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 

        char[] board = br.readLine().toCharArray();				// char 배열 board에 consol입력값을 char형으로 
        
        StringBuilder sb = new StringBuilder();					// Stringbuilder의 객체 활용 

        for (int i = 0; i < board.length; i++) {
            if(i + 3 < board.length) {
                boolean four = board[i] == board[i + 1] && board[i] == board[i + 2] && board[i] == board[i + 3];

                if(four && board[i] == 'X') {
                    i += 3;
                    sb.append("AAAA");
                    continue;
                }
            }

            if(i + 1 < board.length) {
                boolean two = board[i] == board[i + 1];

                if(two && board[i] == 'X') {
                    i += 1;
                    sb.append("BB");
                    continue;
                }
            }

            if(board[i] == '.') {
                sb.append(".");
            }else {
                sb = new StringBuilder("-1");
                break;
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
