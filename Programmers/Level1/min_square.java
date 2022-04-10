//프로그래머스 최소 직사각형

class Solution {
    public int solution(int[][] sizes) {

        int[] arr = new int[sizes.length*2];
        int[] x = new int[sizes.length];
        int[] y = new int[sizes.length];

        int count=0;
        int a = 0;
        int b = 0;
        int max=0;
        int may=0;


        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0]>sizes[i][1]) {
                continue;
            }
            else {
                int tmp = 0;
                tmp=sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1]=tmp;
            }
        }

        for(int i=0; i<sizes.length ; i++) {
            for(int j=0; j<sizes[0].length; j++) {
                arr[count]=sizes[i][j];
                count++;
            }
        }

        for(int i=0; i<sizes.length*2;i++) {
            if(i%2==0) {
                x[a]=arr[i];
                a++;
            }
            else {
                y[b]=arr[i];
                b++;
            }
        }
        max=x[0];
        may=y[0];

        for(int i=0;i<sizes.length-1;i++) {
            max=Math.max(max,x[i+1]);
        }

        for(int i=0;i<sizes.length-1;i++) {
            may=Math.max(may,y[i+1]);
        }
        return max*may;
    }
}
