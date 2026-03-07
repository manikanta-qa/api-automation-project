package pojoclasses.orders;

public class Items {
    private int productId;
    private String productName;
    private int  quantity;
    private double orderPrices;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {

        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrices() {
        return orderPrices;
    }

    public void setPrices(double orderPrices) {
        this.orderPrices = orderPrices;
    }



}
