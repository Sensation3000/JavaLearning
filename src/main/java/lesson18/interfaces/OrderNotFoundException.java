package lesson18.interfaces;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException (int orderId){
        super("Order " + orderId + " not found");
    }
}
