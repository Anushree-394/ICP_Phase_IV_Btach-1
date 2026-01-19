package Week1;
import java.util.*;
public class Best_Time_To_Buy_And_Sell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Brute-Force
        // int max=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         int d=arr[j]-arr[i];
        //         max=Math.max(max,d);
        //     }
        // }
        // System.out.print(max);

        int b=arr[0];
    
        int diff=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<b){
                b=arr[i];

            }
            else if(arr[i]-b>diff){
                diff=arr[i]-b;
            }

        }
        System.out.println(diff);
        sc.close();


    }
}
