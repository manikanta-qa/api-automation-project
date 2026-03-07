package pojoclasses.orders;

public class Payments {
    private String paymentId;
    private String method;
    private String status;

    public String getPaymentId() {

        return paymentId;
    }

    public void setPaymentId(String paymentId) {

        this.paymentId = paymentId;
    }

    public String getMethod() {

        return method;
    }

    public void setMethod(String method) {

        this.method = method;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
