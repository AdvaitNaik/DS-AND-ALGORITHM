package STACKQUEUE;

public class Circular_Queue{
    int SIZE = 5;
    int front, rear;
    int items[] = new int[SIZE];

    Circular_Queue() {
        front = -1;
        rear = -1;
    }

    // Check Queue Full
    boolean isFull() {
        if (front == 0 && rear == (SIZE-1)){
            return true;
        }
        if (front == (rear+1)){
            return true; 
        }
        return false;
    }
    
    // Check Queue Empty 
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Element add
    void enQueue(int element){
        if (isFull()) {
            System.out.println("Full Queue");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted");
        }
    }

    // Element Remove
    int deQueue() {
        int element;
        if (isEmpty()){
            System.out.println("Full Queue");
            return -1;
        } else {
            element = items[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front+1) % SIZE;
            }
            return element;
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        } else {
          System.out.println("Front -> " + front);
          System.out.println("Items -> ");
          for (i = front; i != rear; i = (i + 1) % SIZE)
            System.out.print(items[i] + " ");
          System.out.println(items[i]);
          System.out.println("Rear -> " + rear);
        }
      }


    public static void main(String[] args){
        Circular_Queue cq = new Circular_Queue();

        // Fails because front = -1
        cq.deQueue();

        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        cq.enQueue(6);

        cq.display();

        int elem = cq.deQueue();

        if (elem != -1) {
        System.out.println("Deleted Element is " + elem);
        }
        cq.display();

        cq.enQueue(7);

        cq.display();

        // Fails to enqueue because front == rear + 1
        cq.enQueue(8);

        
    }

}