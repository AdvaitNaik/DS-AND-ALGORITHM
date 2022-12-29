package OOP;

class Animal {
    protected void displayInfo() {
       System.out.println("I am an animal.");
    }
 }
 
 class AccessSpecifier_Dog extends Animal {
    public void displayInfo() {
       System.out.println("I am a dog.");
    }
 }
 
 class Method_Overriding_AccessSpecifier {
    public static void main(String[] args) {
        AccessSpecifier_Dog d1 = new AccessSpecifier_Dog();
       d1.displayInfo();
    }
 }
 
