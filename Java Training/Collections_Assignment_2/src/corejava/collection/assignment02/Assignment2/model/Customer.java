package corejava.collection.assignment02.Assignment2.model;

public class Customer {
    private String customerName;
    private String location;
    private Integer date;
    private String productName;
    private Integer price;
    private String paymentType;

    /*public Customer(String customerName, String location, Integer date, String productName, Integer price,
                    String paymentType) {
        this.customerName = customerName;
        this.location = location;
        this.date = date;
        this.productName = productName;
        this.price = price;
        this.paymentType = paymentType;
    }*/

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

}
