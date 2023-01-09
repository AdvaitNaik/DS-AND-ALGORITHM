// push(): Insert the element in the stack.
// pop(): Remove and return the topmost element of the stack.
// top(): Return the topmost element of the stack
// size(): Return the number of remaining elements in the stack.

package STACKQUEUE;

class stack {
    int size = 100;
    int arr[] = new int[size];
    int top = -1;

    void push(int x) {
        top ++;
        arr[top] = x;
    }
    
    String pop() {
        if (top == -1)
            return "Stack Empty";
        int x = arr[top];
        top--;
        return String.valueOf(x);
    }

    int TopPeek() {
        return arr[top];
    }

    int size() {
        return top+1;
    }
}


public class Stack_Implementation {
    public static void main(String[] args){
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);

        System.out.println("Top" + s.TopPeek());
        System.out.println("Size" + s.size());
        System.out.println("Pop" + s.pop());
        System.out.println("Size" + s.size());

    } 
}
