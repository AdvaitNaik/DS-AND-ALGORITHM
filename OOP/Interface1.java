package OOP;

interface Polygon1 {
    void getArea(int length, int breadth);
  }
  
  // implement the Polygon interface
  class Rectangle1 implements Polygon1 {
  
    // implementation of abstract method
    public void getArea(int length, int breadth) {
      System.out.println("The area of the rectangle is " + (length * breadth));
    }
  }
  
  class Interface1 {
    public static void main(String[] args) {
      Rectangle1 r1 = new Rectangle1();
      r1.getArea(5, 6);
    }
  }