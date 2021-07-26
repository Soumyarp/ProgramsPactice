package GeneralPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        long a[]=new long[(int) n];
        long b[]=new long[(int) n];
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(br.readLine());
        }long res=0;b[0]=1;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1])
                b[i]=b[i-1]+1;
            else
                b[i]=1;
        }for(int i=(int) (n-2);i>=0;i--){
            if(a[i]>a[i+1] && b[i]<=b[i+1])
                b[i]=b[i+1]+1;
            res+=b[i];
        }

        System.out.println(res+b[(int) (n-1)]);
    }

}


