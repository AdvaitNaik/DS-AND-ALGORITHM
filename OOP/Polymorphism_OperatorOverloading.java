package OOP;

class Polymorphism_OperatorOverloading {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // + with numbers
        int sum = a + b;  // Output = 11
        System.out.println(sum);

        String first = "Java ";
        String second = "Programming";

        // + with strings
        String name = first + second;  // Output = Java Programming
        System.out.println(name);
    }   
}
