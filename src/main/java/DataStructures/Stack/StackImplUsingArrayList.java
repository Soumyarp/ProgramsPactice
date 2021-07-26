package DataStructures.Stack;

import java.util.ArrayList;

public class StackImplUsingArrayList {

    private ArrayList<Integer> arrayList = new ArrayList<>();


    public void push(Integer element){
        arrayList.add(element);
    }
    public Integer pop(){
        if(arrayList.size()==0){
            System.out.println("stack is empty");
        }
        return arrayList.remove(arrayList.size()-1);
    }
    public Integer peek() {
        if (arrayList.size() == 0) {
            System.out.println("stack is empty");
        }
        return arrayList.get(arrayList.size() - 1);
    }
    public boolean isEmpty(){
        return(arrayList.size()==0);
    }
    public int size(){
        return arrayList.size();
    }
    public String toString(){
        return ""+arrayList.toString();
    }

    public static void main(String[] args) {
        StackImplUsingArrayList st= new StackImplUsingArrayList();
       // System.out.println(st.pop());
       // System.out.println(st.peek());
        st.push(10);
        st.push(20);
        System.out.println(st);
        //st.size();
        //st.pop();
    }
}
