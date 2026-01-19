package Week2_Stack;
import java.util.*;
public class Reverse_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseString(s));
        sc.close();
        

    }
    public static String reverseString(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            st.push(i);
        }
        String s1="";
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        return s1;
    }
}
