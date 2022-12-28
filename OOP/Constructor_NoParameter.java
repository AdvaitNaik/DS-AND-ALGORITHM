package OOP;

class NoParameter {

    int i;
  
    // constructor with no parameter
    private NoParameter() {
      i = 5;
      System.out.println("Constructor is called");
    }
  
    public static void main(String[] args) {
  
      // calling the constructor without any parameter
      NoParameter obj = new NoParameter();
      System.out.println("Value of i: " + obj.i);
    }
}


public class Constructor_NoParameter {
    
}

