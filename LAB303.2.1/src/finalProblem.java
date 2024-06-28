public class finalProblem {
    public static class frenchFryOrder {
        public static void main(String[] args) {
            // Define product names and prices
            String product1 = "Regular Fries";
            double price1 = 2.50;
            String product2 = "Cheese Fries";
            double price2 = 3.00;
            String product3 = "Bacon Cheese Fries";
            double price3 = 2.00;

            // Define quantities ordered
            int quantity1 = 3;  // three items of Fries
            int quantity2 = 4;  // four items of Cheese Fries
            int quantity3 = 2;  // two items of Bacon Cheese Fries

            // Calculate subtotal
            double subtotal = quantity1 * price1 + quantity2 * price2 + quantity3 * price3;

            // Define constant for sales tax rate
            final double SALES_TAX_RATE = 0.07;  // 7% sales tax

            // Calculate total sale including sales tax
            double salesTax = subtotal * SALES_TAX_RATE;
            double totalSale = subtotal + salesTax;

            // Print the receipt with formatted amounts
            System.out.println("===== French Fry Order Receipt =====");
            System.out.printf("%-12s: %d @ $%.2f each%n", product1, quantity1, price1);
            System.out.printf("%-12s: %d @ $%.2f each%n", product2, quantity2, price2);
            System.out.printf("%-12s: %d @ $%.2f each%n", product3, quantity3, price3);
            System.out.println("-----------------------------");
            System.out.printf("Subtotal    : $%.2f%n", subtotal);
            System.out.printf("Sales Tax   : $%.2f%n", salesTax);
            System.out.printf("Total Sale  : $%.2f%n", totalSale);
            System.out.println("==============================");
        }
    }

}
