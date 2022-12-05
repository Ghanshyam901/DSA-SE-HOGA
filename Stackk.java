public class Stackk {
public static void main(String[] args) {
    
    stack st = new stack();
    st.push(1);
    st.push(3);
    // st.pop();
    st.push(4);
    st.push(3);
    // st.pop();
    System.out.println(st);
    System.out.println("top " +st.top());
    System.out.println("size" + st.size());
    System.out.println(st.isEmpty());


 }

}

class stack{
    int [] arr = new int[20];
    int idx =-1;

    void push(int x){
        idx++;
        arr[idx] = x;
    }
    void pop(){
        if(idx == -1){
            System.out.println("out of bound");
        }else{
           idx--; 
        }
        // idx--;
    }
    int top(){
        return arr[idx];
    }
    int size(){
        return idx+1;
    }boolean isEmpty(){
        return idx == -1;
    }


}
