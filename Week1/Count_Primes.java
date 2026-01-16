package Week1;

import java.util.Scanner;

public class Count_Primes {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          if(n<=1){
            System.out.println(0);
        }
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=2;i*i<n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<n;j=j+i){
                    if(j%i==0){
                        arr[j]=1;
                    }
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c++;
            }

        }
       System.out.println(c);

    }
}
