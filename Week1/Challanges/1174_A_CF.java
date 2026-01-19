package Challanges;
import java.util.*;
public class 1174_A_CF {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int[] arr=new int[2*n];
	    for(int i=0;i<2*n;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    if(arr[0]==arr[2*n-1]){
	        System.out.print(-1);
	    }
	    else{
	        for(int i=0;i<2*n;i++){
	           System.out.print(arr[i]+" ");
	       }
	    }

    }
    
}
