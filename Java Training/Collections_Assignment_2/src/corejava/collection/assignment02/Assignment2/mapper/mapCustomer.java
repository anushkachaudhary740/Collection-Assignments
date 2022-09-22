package corejava.collection.assignment02.Assignment2.mapper;

import corejava.collection.assignment02.Assignment2.model.Customer;

public class mapCustomer {
    public static Customer map(String data) {
        String [] splitArray = data.split(",");
        Integer date = Integer.parseInt(splitArray[2]);
        Integer price= Integer.parseInt(splitArray[4]);
        String productName=splitArray[3];
        String customerName=splitArray[0];
       Customer student = new Customer();
        student.setDate(date);
        student.setPrice(price);
        student.setProductName(productName);
        student.setCustomerName(customerName);
        return student;
    }
}
