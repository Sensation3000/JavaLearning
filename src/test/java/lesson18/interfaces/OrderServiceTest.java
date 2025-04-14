package lesson18.interfaces;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class OrderServiceTest {

    @Test(expectedExceptions = OrderNotFoundException.class)
        //тест будет успешный, если такой Exception в тесте возникнет
    void testExceptionIfOrderNotFound() {
        OrderService service = new OrderService(new TestOrderRepository());
        Order order = service.findOrder(-999, 1000);
    }

    @Test(expectedExceptions = UnauthorisedOrderAccessException.class)
        //тест будет успешный, если такой Exception в тесте возникнет
    void testUnauthorised() {
        OrderService service = new OrderService(new TestOrderRepository());
        Order order = service.findOrder(100, -999);
    }

    @Test
    //happyPath
    void testExistingOrder() {
        OrderService service = new OrderService(new TestOrderRepository());
        Order order = service.findOrder(existingOrder.getOrderId(), existingOrder.getCustomerId());
        assertEquals(order.getOrderId(), existingOrder.getOrderId());
        assertEquals(order.getCustomerId(), existingOrder.getCustomerId());
    }

    //создаем один заказ
    Order existingOrder = new Order(100, 1000);

    class TestOrderRepository implements OrderRepository {
        //создаем тестовый репозиторий

        private Map<Integer, Order> allOrders = new HashMap<>();
        //создаем список заказов в репозитории

        TestOrderRepository() {
            allOrders.put(existingOrder.getOrderId(), existingOrder);
            //кладем туда один заказ
        }

        @Override
        public Order findById(int id) {
            return allOrders.get(id);
        }
    }
}
