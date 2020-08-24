import java.util.Scanner;
public classcOperation {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = s.nextInt();
        System.out.println("Enter second number :");
        int num2 = s.nextInt();
        int sum 		= num1 + num2;
        int difference 	= num1 - num2;
        int product 	= num1 * num2;
        int division	= num1 / num2;
        int modulus	    = num1 % num2;
        System.out.println("Sum : "         + sum);
        System.out.println("Difference : "  + difference);
        System.out.println("Product : "     + product);
        System.out.println("Division : "    + quotient);
        System.out.println("Modulus : "      + modulo);
    }
}