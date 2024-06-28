public class intDoubleDecV {
    public static class DivideIntegers {
        public static void main(String[] args) {
            // Declare two variables: one integer and one decimal
            int num1 = 15;
            double num2 = 5.0; // Change num2 to a decimal

            // Determine the larger and smaller numbers
            double larger = num1;
            double smaller = Math.min(num1, num2);

            // Divide the larger number by the smaller number
            double result = larger / smaller;

            // Print out the result
            System.out.println("Result of dividing " + larger + " by " + smaller + " is: " + result);
        }
    }

}
