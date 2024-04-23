public class DefaultPriceCalculator implements PriceCalculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}