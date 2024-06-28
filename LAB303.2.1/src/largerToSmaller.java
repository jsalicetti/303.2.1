public class largerToSmaller {
    public static class DivideDoubles {
        public static void main(String[] args) {
            // Declare two double variables
            double num1 = 20.5;
            double num2 = 10.3;

            // Determine the larger and smaller numbers
            double larger = Math.max(num1, num2);
            double smaller = Math.min(num1, num2);

            // Divide the larger number by the smaller number
            double result = larger / smaller;

            // Print out the result before casting
            System.out.println("Result before casting to integer: " + result);

            // Cast the result to an integer
            int castedResult = (int) result;

            System.out.println("Casted result to integer: " + castedResult);
        }
    }

}
