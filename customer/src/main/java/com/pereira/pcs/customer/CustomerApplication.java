package com.pereira.pcs.customer;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CustomerApplication extends Application<CustomerConfiguration> {

    public static void main(String[] args) {
        System.out.println("Customer server running on port 8082...");
        try {
            new CustomerApplication().run(args);
        } catch (Exception e) {
            System.out.println("Error initializing dropwizard customer service...");
        }
    }

    @Override
    public String getName() {
        return "Customer-microservice";
    }

    @Override
    public void initialize(Bootstrap<CustomerConfiguration> bootstrap) {
    }

    @Override
    public void run(CustomerConfiguration todaysDateConfiguration, Environment environment) {
        environment.jersey().register(new CustomerResource());
        environment.healthChecks().register("CustomerHealthCheck", new CustomerHealthCheck());
    }
}
