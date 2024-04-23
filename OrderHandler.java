public class OrderHandler {
    private final PriceCalculator priceCalculator;
    private final OrderPlacer orderPlacer;
    private final InvoiceGenerator invoiceGenerator;
    private final EmailNotifier emailNotifier;

    public OrderHandler(PriceCalculator priceCalculator, OrderPlacer orderPlacer,
                        InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.priceCalculator = priceCalculator;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = priceCalculator.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        orderPlacer.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        emailNotifier.sendEmailNotification(email);
    }
}