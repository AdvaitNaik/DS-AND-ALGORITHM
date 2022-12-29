package OOP;

class ProtectedAnimal {
    protected String name;
  
    protected void display() {
      System.out.println("I am an animal.");
    }
}
  
class ProtectedDoggy extends ProtectedAnimal {
  
    public void getInfo() {
      System.out.println("My name is " + name);
    }

}

class Inheritance_protected {
    public static void main(String[] args) {
  
      // create an object of the subclass
      ProtectedDoggy labrador = new ProtectedDoggy();
  
      // access protected field and method
      // using the object of subclass
      labrador.name = "Rocky";
      labrador.display();
      labrador.getInfo();
    }
}
