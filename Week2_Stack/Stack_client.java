package Week2_Stack;

public class Stack_client {
    public static void main(String[] args) {
        Stack_imp st=new Stack_imp(5);
        st.push(5);
        st.push(6);
        st.push(2);
        st.push(3);
        st.push(1);
        st.pop();
        st.display();
        st.push(10);
        st.display();
    }
}
