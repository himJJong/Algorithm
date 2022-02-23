package algorithm;
import java.util.*;

public class dfs {
	static int N;				//map의 세로 
	static int M;				//map의 가로 
	static int[][] map;			//map
	static boolean[][] visit;	//청소기가 들렸는지 확인
	
	// 전진, 후진을 위해 사용될 것  
	static int[] dr = {-1,0,1,0}; //북동남서(dr은 북에서 떨어진 거리)
	static int[] dc = {0,1,0,-1}; //북동남서(dc는 서에서 떨어진 거리)
	
	static int count;		//방 개수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();		// map의 가로 크기 
		M = sc.nextInt();		// map의 세로 크기 
		
		map = new int[N][M];	// map 배열 생성
		visit = new boolean[N][M]; //방문 체크
		
		int r = sc.nextInt(); // 로봇청소기의 가로 좌표 
		int c = sc.nextInt(); // 로봇청소기의 세로 좌표 
		int d = sc.nextInt(); // 로봇청소기 바라보는 방향
		
		// 0 북, 1 동, 2 남, 3 서  -> 라고 방향을 정해줌. (아래 dir_rotation 함수에서)
		
		for (int i=0; i<N; i++) {		// 맵 입력 , 0은 벽이 없음, 1은 벽이 있음.
			for (int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		count = 0;			//결과값 청소방의 개수
		clean(r,c,d);
		System.out.println(count);
	}
	
	public static void clean(int r, int c, int d) {
		boolean sign = false;
		
		if (!visit[r][c]) {		// 로봇 시작이 0일경우 청소하고 count++
			visit[r][c] = true;
			count++;
		}
		
		//4방향 탐색 
		for (int i=0; i<4; i++) {
			d = dir_rotation(d);
			int nr = r + dr[d];			//각 행의 위치 값 + dr -> 열 1칸씩 움직이기 
			int nc = c + dc[d];			//각 열의 위치 값 + dc -> 행 1칸씩 움직이기 
			
			if (map[nr][nc] == 0 && !visit[nr][nc]) {	//벽이 없고 , 방문이 되어있지 않으면 
				clean(nr,nc,d);
				sign = true;
				break;
			}
		}
		
		// 2-c,d 상황 -> 네 방향 모두 청소되어 후진 
		if (sign == false) {
			int nr = r - dr[d];
			int nc = c - dc[d];
			
			if (map[nr][nc] == 0) {
				clean(nr, nc, d);
			}
		}
}
	public static int dir_rotation(int d) {
		
		if (d==0)			//북쪽에서 왼쪽으로 
			return 3;		//서쪽
		else if (d==1)		//동쪽에서 왼쪽으로
			return 0;		//남쪽 
		else if (d==2)		//남쪽에서 왼쪽으로  
			return 1;		//동쪽 
		else				//서쪽에서 왼쪽으로 
			return 2;		//북쪽
	}
}
	
	
	
	
