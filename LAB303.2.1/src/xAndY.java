public class xAndY {
    public static class SimpleDivision {
        public static void main(String[] args) {
            // Declare and assign values to x and y
            int x = 5;
            int y = 6;

            // Calculate y / x and assign to q (as integer division)
            int q = y / x;

            // Print q
            System.out.println("q after integer division: " + q);

            // Cast y to double and assign to q
            q = (int) (double) y;

            // Print q again
            System.out.println("q after casting y to double: " + q);
        }
    }

}
