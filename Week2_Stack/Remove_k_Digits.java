package Week2_Stack;
import java.util.*;
public class Remove_k_Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        String s1=removeKdigits(s,k);
        System.out.print(s1);



    }
    public static String removeKdigits(String num, int k) {
        if(k==num.length()){ // jitni string ki length utne hi removals
            return "0";
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){ //agr choti digit  hai next wali  toh bdi remove 
                st.pop();
                k--;
            }
            st.push(num.charAt(i));

        }
        while(k>0 && !st.isEmpty()){ // agr incresing no hai toh last ki remove->12345
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){ //agr starting no's zeroes hai toh remove them
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}


