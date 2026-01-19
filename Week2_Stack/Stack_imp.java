package Week2_Stack;

public class Stack_imp {
    int[] arr;
    int index=-1;
    int size;
    public Stack_imp(int n){
        this.size=n;
        arr=new int[n];

    }
    public void push(int x){
        if(index==size-1){
            System.out.print("Stack overflow");
            return;
        }
        index++;
        arr[index]=x;
        

    }
    public void pop(){
        if(index==-1){
            System.out.print("Stack underflow");
            return;

        }
        index--;
    }
    public void peek(){
         if(index==-1){
            System.out.print("Stack underflow");
            return;
        }
        System.out.print(arr[index]+" ");
    }
    public boolean empty(){
        if(index==-1){
            return true;

        }
        return false;
    }
    public void display(){
        int indi=index;
        while(indi>-1){
            System.out.println(arr[indi]);
            indi--;
        }
        
    }

   
}
