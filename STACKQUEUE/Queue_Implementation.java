package STACKQUEUE;

class Queue {
    private int arr[];
    private int front, rear, currentSize, maxSize;
    
    public Queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        currentSize = 0;
    }

    public void push(int element){
        if(currentSize == maxSize){
            System.out.println("Queue Full");
        }
        if (rear == -1){
            front = 0;
            rear = 0;
        } else {
            rear = (rear+1)%maxSize;
        }
        arr[rear] = element;
        currentSize++; 
    }

    public int pop(){
        if(front == -1){
            System.out.println("Queue Full");
        }
        int popElement = arr[front];

        if (currentSize == 1){
            front = -1;
            rear = -1;
        } else {
            front = (front+1)%maxSize;
        }
        currentSize--; 
        return popElement;
    }

    public int TopPeek(){
        if(front == -1){
            System.out.println("Queue Full");
            System.exit(1);
        }
        return arr[front];
    }
    public int size(){
        return currentSize;
    }
}

public class Queue_Implementation {
    public static void main(String args[]) {
        Queue q = new Queue(6);
        q.push(8);
        q.push(6);
        q.push(4);

        System.out.println("Top" + q.TopPeek());
        System.out.println("Size" + q.size());
        System.out.println("Pop" + q.pop());
        System.out.println("Size" + q.size());
    }
    
}
