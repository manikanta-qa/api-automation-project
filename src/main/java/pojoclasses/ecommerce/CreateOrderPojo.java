package pojoclasses.ecommerce;

import java.util.List;

public class CreateOrderPojo {
private List<OrdersPojo> orders;

    public List<OrdersPojo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersPojo> orders) {
        this.orders = orders;
    }
}
