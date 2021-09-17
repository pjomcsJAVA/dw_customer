package com.pereira.pcs.customer;


import java.util.HashMap;
import java.util.Map;

public class CustomerDatabase {

    public static final Map<String, Customer> CUSTOMERS = buildDatabase();

    private static Map<String, Customer> buildDatabase() {
        Map<String, Customer> allCustomers = new HashMap<>();

        Customer c1 = new Customer();
        c1.setId("1");
        c1.setName("Raquel");
        c1.setCountry("PT");
        c1.setGender(Gender.F);
        allCustomers.put(c1.getId(), c1);

        Customer c2 = new Customer();
        c2.setId("2");
        c2.setName("Helen");
        c2.setCountry("UK");
        c2.setGender(Gender.F);
        allCustomers.put(c2.getId(), c2);

        Customer c3 = new Customer();
        c3.setId("3");
        c3.setName("Jean");
        c3.setCountry("FR");
        c3.setGender(Gender.M);
        allCustomers.put(c3.getId(), c3);

        Customer c4 = new Customer();
        c4.setId("4");
        c4.setName("Pablo");
        c4.setCountry("ES");
        c4.setGender(Gender.M);
        allCustomers.put(c4.getId(), c4);

        return allCustomers;
    }

}
