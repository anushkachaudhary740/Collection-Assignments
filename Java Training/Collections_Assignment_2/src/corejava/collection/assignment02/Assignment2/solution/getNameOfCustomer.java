package corejava.collection.assignment02.Assignment2.solution;
import corejava.collection.assignment02.Assignment2.mapper.mapCustomer;
import corejava.collection.assignment02.Assignment2.model.Customer;
//import corejava.collection.assignment02.as2.model.Customer;

import java.util.*;

public class getNameOfCustomer {
    List customerArrayList = new ArrayList<>();

    public void getInput(String input[]) {

        for (String data : input) {

            Customer student = mapCustomer.map(data);
            customerArrayList.add(student);
        }
    }

    public void findTheName() {
        Set<String> st = new HashSet<>();
        Iterator<Customer> it = customerArrayList.iterator();
        while (it.hasNext()) {
            Customer cst = it.next();
            st.add(cst.getProductName());
        }
        for (String productname : st) {
            Iterator<Customer> it1 = customerArrayList.iterator();

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

            Iterator<Customer> it12 = customerArrayList.iterator();
            while (it12.hasNext()) {
                Customer values = it12.next();
                Integer getPriceFromList = values.getPrice();

                if (discountPrice == getPriceFromList && temp != 1) {
                    String name = values.getCustomerName();
                    System.out.println(name);
                }
            }
        }
    }
}


