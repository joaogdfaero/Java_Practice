public class Main {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int total = addNumbers(num1, num2);
        System.out.println("Sum: " + total);

        int difference = subtractNumbers(num1, num2);
        System.out.println("Difference: " + difference);
    }

    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
}