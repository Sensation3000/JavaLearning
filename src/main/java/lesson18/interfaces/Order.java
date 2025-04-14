package lesson18.interfaces;

public class Order {
    private final int orderId;
    private final int customerId;

    public Order(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }
}
