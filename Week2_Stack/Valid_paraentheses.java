package Week2_Stack;
import java.util.*;
public class Valid_paraentheses {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){ //if open bracket is being found then it is being psuhed into a stack
                st.push(ch);
            }
            // if we find a closing bracket and does not get the corresponding open bracket in accordance to closing bracket then we retun false and pop out the wrong bracket
            else{
                if(st.isEmpty()||ch==')'&& st.pop()!='(' || ch=='}' && st.pop()!='{' || ch==']' && st.pop()!='['){
                    return false;
                }
                

            }
        }// if stack is empty then we get the valid pararentheses
        return st.isEmpty();
    }
}
// Time complexity-> O(n)
//space complexity->o(n)
