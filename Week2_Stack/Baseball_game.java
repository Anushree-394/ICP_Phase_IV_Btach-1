package Week2_Stack;
import java.util.*;
public class Baseball_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n =sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.print(calPoints(arr));
        sc.close();
    }
    public static  int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int x=st.peek();
                st.push(2*x);
            }
            else if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int c=a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;

    }
}
