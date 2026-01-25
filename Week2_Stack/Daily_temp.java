package Week2_Stack;

import java.util.*;

public class Daily_temp {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int  n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] nums=func(arr);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

    }
        public static int[] func(int[] arr) {
        int[] nums=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nums[i]=0;
            }
            else{
                nums[i]=st.peek()-i;
            }
            st.push(i);
           
        }
        return nums;

    }

}
