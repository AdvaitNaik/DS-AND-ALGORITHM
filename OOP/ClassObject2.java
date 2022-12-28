package OOP;

class ClassObject2 {
  
    // stores the value for light true if light is on false if light is off
    boolean isOn;
  
    // method to turn on the light
    void turnOn() {
      isOn = true;
      System.out.println("Light on? " + isOn);
  
    }
  
    public static void main(String[] args) {
      
      // create an object of Lamp
      ClassObject2 led = new ClassObject2();
  
      // access method using object
      led.turnOn();
    }
  }

