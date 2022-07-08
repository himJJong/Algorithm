package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int[] arr;
    static int n, m;
    static boolean[] visited;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());						//출력할 문자열 개수 
        m = Integer.parseInt(st.nextToken());						//배열 크기 

        arr = new int[n];
        ans = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);
        System.out.print(sb.toString());
    }

    public static void dfs(int depth) {
        if (depth == m){
            for (int i = 0; i < m; i++){
                sb.append(ans[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                visited[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
