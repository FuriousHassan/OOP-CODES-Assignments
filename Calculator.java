import java.util.*;

    class Calculator{
    public static void main(String Args[]) {
        
	// Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Printing welcome message and instructions for the user
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Please enter an expression in the format 'e.g: '7 * 4'':");

        try {
            // Retrieving the first number from the user
            double num1 = scanner.nextDouble();
            // Retrieving the operation from the user
            String operation = scanner.next();
            // Retrieving the second number from the user
            double num2 = scanner.nextDouble();
            // Declaring the variable for the result
            double result;

            // Performing the appropriate operation based on the user's input
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    // Handling division by zero scenario
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    } else {
                        result = num1 / num2;
                        break;
                    }
                default:
                    // Handling an invalid operations
                    System.out.println("Invalid operation! Please use one of these '+', '-', '*', '/' only ");
                    return;
            }

            // Displaying the result of the operation
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            // Handling invalid input format scenario
            System.out.println("Invalid input format! Please enter numbers and an operation as specified.");
        }
    }
}
