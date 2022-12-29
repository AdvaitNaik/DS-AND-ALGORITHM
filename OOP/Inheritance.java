package OOP;

class Animal {

    // field and method of the parent class
    String name;
    public void eat() {
      System.out.println("I can eat");
    }
  }
 
  public class Inheritance {
    
  }
  
  // inherit from Animal
  class Dog extends Animal {
  
    // new method in subclass
    public void display() {
      System.out.println("My name is " + name);
    }
  }
  
  class Inheritane {
    public static void main(String[] args) {
  
      // create an object of the subclass
      Dog labrador = new Dog();
  
      // access field of superclass
      labrador.name = "Roshnee";
      labrador.display();
  
      // call method of superclass using object of subclass
      labrador.eat();
  
    }
  }