package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        CustomerService customerService = new CustomerService();
        Customer customer1 = new Customer(1101, "Tara", "Female", true, "Austin");
        Customer customer2 = new Customer(1101, "Tara", "Female", true, "Austin");
        Customer customer3 = new Customer(5242, "Sam", "Male", false, "Denver");
        Customer customer4 = new Customer(8965, "Abbie", "Female", false, "Chicago");
        Customer customer5 = new Customer(3354, "Michelle", "Female", false, "Portland");
        Customer customer6 = new Customer(2212, "Mary", "Female", true, "New Orleans");
        Customer customer7 = new Customer(4542, "John", "Male", false, "Seattle");
        Customer customer8 = new Customer(1119, "Trevor", "Male", false, "Boston");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);
        customerList.add(customer7);
        customerList.add(customer8);

        List<String> list = customerService.getListOfCustomersSortedByName(customerList);
        for (String s : list) {
            System.out.println(s);
        }
    }

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {

        List<String> list = new ArrayList<>();
        Collections.sort(customerList);
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getCustomerName());
        }

        return list;
    }

}
