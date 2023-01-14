package STACKQUEUE;

public class Doubly_Linked_List_Deque {

    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size;

    public Doubly_Linked_List_Deque(int size) {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    // This operation checks if the deque is full. If front = 0 and rear = n - 1 OR front = rear + 1, 
    // the deque is full.
    boolean isFull() {
        return ((front == 0 && rear == size-1) || (front ==  rear + 1));
    }

    // This operation checks if the deque is empty. If front = -1, the deque is empty.
    boolean isEmpty() {
        return (front == -1);
    }

    // INSERT FRONT
    void insertfront(int element){
        // Check if the array is full.
        if(isFull()){
            System.out.println("Full");
            return;
        }

        // Check the position of front.
        if (front == -1){
            front = 0;
            rear = 0;
        }

        // If front < 1, reinitialize front = n-1 (last index)
        else if (front == 0) 
            front = size - 1;

        // Else, decrease front by 1.
        else
            front = front - 1;

        // Add the new key 5 into array[front]
        arr[front] = element;
    }

    // INSERT REAR
    void insertrear(int element) {
        // Check if the array is full.
        if(isFull()){
            System.out.println("Full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // If the deque is full, reinitialize rear = 0.
        else if (rear == size - 1)
            rear = 0;

        // Else, increase rear by 1
        else
            rear = rear + 1;

        // Add the new key 5 into array[rear]
        arr[rear] =  element; 
    }

    // DELETE FRONT
    void deletefront() {
        // Check if the deque is empty
        // If the deque is empty (i.e. front = -1), deletion cannot be performed (underflow condition).
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }

        // If the deque has only one element (i.e. front = rear), set front = -1 and rear = -1.
        if (front == rear){
            front = -1;
            rear = -1;
        } 
        // Else if front is at the end (i.e. front = n - 1), set go to the front front = 0.
        else if (front == size - 1)
            front = 0;
        
        // Else, front = front + 1
        else 
            front = front + 1;
    }


    // DELETE REAR
    void deleterear() {
        // Check if the deque is empty
        // If the deque is empty (i.e. front = -1), deletion cannot be performed (underflow condition).
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }

        // If the deque has only one element (i.e. front = rear), set front = -1 and rear = -1, 
        // else follow the steps below.
        if (front == rear) {
            front = -1;
            rear = -1;
        }

        // If rear is at the front (i.e. rear = 0), set go to the front rear = n - 1.
        else if (rear == 0)
            rear = size - 1;

        // Else, rear = rear - 1
        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
          System.out.println(" Underflow");
          return -1;
        }
        return arr[front];
    }
    
      int getRear() {
        if (isEmpty() || rear < 0) {
          System.out.println(" Underflow\n");
          return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        Doubly_Linked_List_Deque dq = new Doubly_Linked_List_Deque(4);

        System.out.println("Insert element at rear end : 12 ");
        dq.insertrear(12);

        System.out.println("insert element at rear end : 14 ");
        dq.insertrear(14);

        System.out.println("get rear element : " + dq.getRear());

        dq.deleterear();
        System.out.println("After delete rear element new rear become : " + dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertfront(13);

        System.out.println("get front element: " + dq.getFront());

        dq.deletefront();

        System.out.println("After delete front element new front become : " + +dq.getFront());

    }
    
}
