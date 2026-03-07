package pojoclasses.orders;

import java.util.List;

public class Order {
    private int orderId;
    private String orderDate;
    private Customer  customer;
    private List<Items> items;
    private Payments payment;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {

        this.orderId = orderId;
    }

    public String getOrderDate() {

        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public Payments getPayment() {
        return payment;
    }

    public void setPayment(Payments payment) {

        this.payment = payment;
    }

}
