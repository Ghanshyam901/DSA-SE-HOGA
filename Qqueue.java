public class Qqueue {
    public static void main(String[] args) {
        queue q = new queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
class queue{
    private int [] arr;
    private int front,rear,currSize,maxSize;
    int n =20;

    public queue(){
        arr = new int[n];
        front = -1;
        rear = -1;
        currSize = 0;
    }public queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        currSize = 0;
    }

    void push(int val){
        if(currSize == maxSize){
            System.out.print("que is full");
        }
        if(rear == -1){
            front =0;
            rear =0;
        }else{
            rear = (rear+1) %maxSize;
            arr[rear] = val;
            currSize++;
        }
    }int pop(){
        if(front == -1){
            System.out.println("QUe is empty");
            System.exit(1);
        }
        int popele = arr[front];
        if(currSize == 1){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%maxSize;
            // currSize--;
        }
        currSize--;
        return popele;
    }int top(){
        if(front == -1){
            System.out.println("que is empty");
            System.exit(1);
        }
        return arr[front];
    }int size(){
        return currSize;
    }
}
