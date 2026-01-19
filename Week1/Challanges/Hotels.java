package Challanges;
import java.util.*;
public class Hotels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int start=0;
		int maxsum=Integer.MIN_VALUE;
		for(int right=0;right<n;right++){
			sum+=arr[right];
			while(sum>k){
				sum=sum-arr[start];
			  start++;
			}
			maxsum=Math.max(maxsum,sum);
		}
		System.out.print(maxsum);
    }
}
// Brute Force Approach
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i; j < n; j++) {
// if ((sum + arr[j]) <= m) {
// sum += arr[j];
// } else {
// break;
// }
// }
// max = Math.max(max, sum);
// }
// System.out.println(max);
