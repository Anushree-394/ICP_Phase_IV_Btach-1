package Week2_Stack;
import java.util.*;
public class Help_Classmate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
       


    }
    //next smaller element find krna hai same as next greater ele
    public static int[] help_classmate(int nums2[], int n) {
        // Your code goes here
        Stack<Integer> st=new Stack<>();
        
       int[] arr=new int[nums2.length];
       for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=-1;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        return arr;
        
        
        

    }
}
