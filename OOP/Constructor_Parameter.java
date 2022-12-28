package OOP;

class Parameter {

    String languages;
  
    // constructor accepting single value
    Parameter(String lang) {
      languages = lang;
      System.out.println(languages + " Programming Language");
    }
  
    public static void main(String[] args) {
  
      // call constructor by passing a single value
      Parameter obj1 = new Parameter("Java");
      Parameter obj2 = new Parameter("Python");
      Parameter obj3 = new Parameter("C");
    }
  }
  