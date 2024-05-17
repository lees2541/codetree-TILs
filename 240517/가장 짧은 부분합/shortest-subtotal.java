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
        int mir = n;
        int r;
        for(int i = 1, j = 0 ;i < n ; i++){
            if(arr[i-1] >= m){
                mir = 1;
                break;
            }
            if(sum[j]-sum[i-1]>= m){
                
                r = j - i+1 ;
                if (r < mir) mir = r;
                j = i+1;

            }else{
                if(n-j <= 1){
                    j = i+1;

                }else{
                    i--;
                    j++;

                }
                
            }

        }












        System.out.printf("%d" ,mir);

    }
}