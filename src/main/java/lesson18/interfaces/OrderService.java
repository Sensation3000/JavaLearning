package lesson18.interfaces;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findOrder (int orderId, int customerId){
        Order order = orderRepository.findById(orderId);
        if (order == null) {
            throw new OrderNotFoundException(orderId);
        }
        if (order.getCustomerId()!=customerId){
            throw new UnauthorisedOrderAccessException();
        }
        return order;
    }
}

