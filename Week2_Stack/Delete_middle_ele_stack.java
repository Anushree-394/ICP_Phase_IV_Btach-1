package Week2_Stack;

import java.util.Stack;

public class Delete_middle_ele_stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        deleteMid(s);

    }
    // space complexity-> O(n) // uses extra space
    //time complexity-> O(n/2)

    public static void deleteMid(Stack<Integer> s) {
        
        Stack<Integer> st=new Stack<>();
        int len=s.size();
        int mid=len/2;
        for(int i=0;i<=mid;i++){
            st.push(s.pop()); // we add last size/2 ele in new stack then pop the top most ele in order to del a middle ele
        }
        st.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    }
}
