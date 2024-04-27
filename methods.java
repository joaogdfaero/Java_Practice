public class Main {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        double shoeSize = 9.5;
        String nome = "João";
        
        double total = addNumbers(num1, shoeSize);
        System.out.println("Sum: " + total);

        int difference = subtractNumbers(num1, num2);
        System.out.println("Difference: " + difference);
        
        printName(nome);
    }

    // Method to add two numbers
    public static double addNumbers(int num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
    
    // arrota    
    private static void printName(String name) {
        System.out.println(name);
    }
}