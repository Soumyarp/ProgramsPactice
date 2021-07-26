package DataStructures.Stack;

/*
* isEmpty()  --boolean
* isFull()   --boolean
* Push(int element)  --void
* Pop()  --int
* Peek()--int
*
* */

public class StackImplUsingArray {
    int size;
    int top;
    int arr[];

   public StackImplUsingArray(int size){
        this.size = size;
        this.arr= new int[size];
        this.top=-1;
    }

    public boolean isEmpty(){
       return (top==-1);
    }
    public boolean isFull(){
       return (size-1==top);
    }
    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack Is Empty");
            return -1;
        }
    }

    public void push(int element){
       if(!isFull()){
           top++;
           arr[top]=element;
           System.out.println("Pushed element is "+element);
       }
       else
           System.out.println("Stack is full");
    }

    public int pop(){
       if(!isEmpty()){
           int returnedTop=top;
           top--;
           System.out.println("Popped Element is "+arr[returnedTop]);
           return returnedTop;
       }else{
           System.out.println("Stack is empty");
           return -1;
       }
    }

    public static void main(String[] args) {
        StackImplUsingArray st = new StackImplUsingArray(10);
        System.out.println(st.isEmpty());
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(110);
        System.out.println(st.isFull());
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
    }
}
