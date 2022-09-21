package corejava.collection.assignment02.Assignment2.Main;
import corejava.collection.assignment02.Assignment2.Customer.Customer;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Customer> list = new ArrayList<Customer>();

        list.add(new Customer("Rajan Patil", "Aundh", 1, "Phone Cover", 170, "Cash"));
        list.add(new Customer("Mohit Gupta", "Baner", 1, "Samsung Battery", 900, "Credit1 Card"));
        list.add(new Customer("Rajan Patil", "Aundh", 3, "Samsung Battery", 1000, "Cash"));
        list.add(new Customer("Nina Kothari", "Baner", 4, "Earphones", 500, "Credit1 Card"));
        list.add(new Customer("T Sunit1ha", "Shivajinagar", 5, "Earphones", 550, "Credit1 Card"));
        list.add(new Customer("Rohan Gade", "Aundh", 10, "Motorola Battery", 1000, "Credit1 Card"));
        list.add(new Customer("Rajan Patil", "Shivajinagar", 21, "Earphones", 550, "Credit1 Card"));
        list.add(new Customer("Rajan Patil", "Aundh", 22, "USB Cable", 150, "UPI"));
        list.add(new Customer("Meena Kothari", "Baner", 23, "USB Cable", 100, "Cash"));
        list.add(new Customer("Nina Kothari", "Baner", 24, "USB Cable", 200, "UPI"));
        list.add(new Customer("Mohit Gupta", "Baner", 25, "USB Cable", 150, "UPI"));


        Set<String> st = new HashSet<>();
        Iterator<Customer> it = list.iterator();
        while (it.hasNext()) {
            Customer cst = it.next();
            st.add(cst.getProductName());
        }
        for (String productname : st) {
            Iterator<Customer> it1 = list.iterator();

            List<Integer> price = new ArrayList<Integer>();

            Integer temp = 0;
            while (it1.hasNext()) {
                Customer values = it1.next();
                String productNameInList = values.getProductName();

                if (productname.equals(productNameInList)) {
                    Integer productPrice = values.getPrice();
                    temp++;
                    price.add(productPrice);
                }
            }
            Integer discountPrice = price.stream().min(Integer::compare).get();

            Iterator<Customer> it12 = list.iterator();
            while (it12.hasNext()) {
                Customer values = it12.next();
                Integer getPriceFromList = values.getPrice();

                if (discountPrice == getPriceFromList && temp != 1) {
                    String name=values.getCustomerName();
                    System.out.println(name);
                }
            }
        }
    }
}
