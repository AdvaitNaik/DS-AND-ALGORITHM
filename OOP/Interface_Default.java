package OOP;

interface Default_Polygon {
    void getArea();
  
    // default method 
    default void getSides() {
      System.out.println("I can get sides of a polygon.");
    }
  }
  
  // implements the interface
  class Default_Rectangle implements Default_Polygon {
    public void getArea() {
      int length = 6;
      int breadth = 5;
      int area = length * breadth;
      System.out.println("The area of the rectangle is " + area);
    }
  
    // overrides the getSides()
    public void getSides() {
      System.out.println("I have 4 sides.");
    }
  }
  
  // implements the interface
  class Default_Square implements Default_Polygon {
    public void getArea() {
      int length = 5;
      int area = length * length;
      System.out.println("The area of the square is " + area);
    }
  }
  
  class Interface_Default {
    public static void main(String[] args) {
  
      // create an object of Rectangle
      Default_Rectangle r1 = new Default_Rectangle();
      r1.getArea();
      r1.getSides();
  
      // create an object of Square
      Default_Square s1 = new Default_Square();
      s1.getArea();
      s1.getSides();
    }
  }
