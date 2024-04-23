public class OrderTest {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new DefaultPriceCalculator();
        OrderPlacer orderPlacer = new OrderPlacerImpl();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        EmailNotifier emailNotifier = new EmailNotifierImpl();

        OrderHandler orderHandler = new OrderHandler(priceCalculator, orderPlacer, invoiceGenerator, emailNotifier);
        orderHandler.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}