import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
//	 write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }
        sum[0] = arr[0];
        for (int i = 1;i<n;i++){
            sum[i] = sum[i-1] + arr[i];
        }
        int max = sum[m-1];
        for (int i = 0; i < n-m; i++){
            if(sum[i+m]-sum[i] >= max) max = sum[i+m]-sum[i];

        }












        System.out.printf("%d" ,max);

    }
}