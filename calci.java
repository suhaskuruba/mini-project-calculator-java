import java.util.*;

public class calci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // entering the number to calculate:
        System.out.println("enter the numbers ot calculate:");

        // for number 1 , input:
        System.out.print("first number: ");
        int a = sc.nextInt();

        // for number 2 ,input:
        System.out.print("second number: ");
        int b = sc.nextInt();

        // now selecting the required operation:
        System.out.print("select the required operation: ");

        // defining the operators:
        System.out.println(" + - * / % ");

        // taking the input of characters:
        char ch = sc.next().charAt(0); // this is for the index for the character which we input.

        // making the switch statements for doing calculations:
        switch (ch) {

            // +;
            case '+':
                System.out.println("sum of the numbers is : " + (a + b));
                break;

            // -;
            case '-':
                System.out.println("difference of the numbers is : " + (a - b));
                break;

            // *;
            case '*':
                System.out.println("product of the numbers is : " + (a * b));
                break;

            // ;
            case '/':
                System.out.println("division  of the numbers is : " + (a / b));
                break;

            // %;
            case '%':
                System.out.println("remainder of the numbers is : " + (a % b));
                break;

            default:
                System.out.println("invalid ");

                // finally the calculator is completed...hurray

        }
    }
}
