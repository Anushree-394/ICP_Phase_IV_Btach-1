package Week2_Stack;
import java.util.*;
public class Backspace_String_Comapre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.print(backspaceCompare(s,t));

    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        // string1 is inserted into stack1 ele by ele
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
            //backtrack is being done
            else if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();

                }
                else{
                    continue;
                }
            }
        }
        //string2 is inserted into stack2 ele by ele
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            //backtrack is being done
            else if(t.charAt(i)=='#'){
               if(!st2.isEmpty()){
                    st2.pop();

                }
                else{
                    continue;
                }
            }
        }
        String s1="";
        String s2="";
        //after backtrack new string is created to track whether they are equal or not
        while(!st1.isEmpty()){
            s1=s1+(st1.pop());
        }
        while(!st2.isEmpty()){
            s2=s2+(st2.pop());
        }
        return s1.equals(s2);
    
    }
}
