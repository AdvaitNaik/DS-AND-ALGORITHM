package OOP;

class Poly_Polygon {

    // method to render a shape
    public void render() {
      System.out.println("Rendering Polygon...");
    }
  }
  
  class Poly_Square extends Poly_Polygon {
  
    // renders Square
    public void render() {
      System.out.println("Rendering Square...");
    }
  }
  
  class Poly_Circle extends Poly_Polygon {
  
    // renders circle
    public void render() {
      System.out.println("Rendering Circle...");
    }
  }
  
  class Polymorphism {
    public static void main(String[] args) {
      
      // create an object of Square
      Poly_Square s1 = new Poly_Square();
      s1.render();
  
      // create an object of Circle
      Poly_Circle c1 = new Poly_Circle();
      c1.render();
    }
  }