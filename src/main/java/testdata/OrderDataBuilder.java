package testdata;

import pojoclasses.orders.*;

import java.util.ArrayList;
import java.util.List;

public class OrderDataBuilder {
    public static Order createOrderPayload(){

        Order orders=new Order();
        orders.setOrderId(1001);
        orders.setOrderDate("2026-02-27");

        //Set Customer Details
        Customer customer=new Customer();
        customer.setCustomerId(501);
        customer.setName("Mani");
        customer.setEmail("mani@gmail.com");
        //set Address Detailss
        Address address=new Address();
        address.setStreet("Madhapur");
        address.setPincode(500081);
        address.setCity("Hyderabad");

        customer.setAddress(address);
        orders.setCustomer(customer);
        ///Set Item Details
        Items items1 =new Items();
        items1.setPrices(75000);
        items1.setProductId(2001);
        items1.setProductName("Laptop");
        items1.setQuantity(1);
        Items items2 =new Items();
        items2.setPrices(500);
        items2.setProductId(2002);
        items2.setProductName("Mouse");
        items2.setQuantity(2);

        List<Items> items=new ArrayList<>();

        items.add(items1);
        items.add(items2);
        orders.setItems(items);

        /// Set payment details
        Payments payments=new Payments();
        payments.setMethod("UPI");
        payments.setPaymentId("PAY123");
        payments.setStatus("Success");

        orders.setPayment(payments);

        return orders;

    }

}
