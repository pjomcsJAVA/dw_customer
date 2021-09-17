package com.pereira.pcs.order;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class OrderApplication extends Application<OrderConfiguration> {

    public static void main(String[] args) {
        System.out.println("Order server running on port 8083...");
        try {
            new OrderApplication().run(args);
        } catch (Exception e) {
            System.out.println("Error initializing dropwizard order service...");
        }
    }

    @Override
    public String getName() {
        return "Order-microservice";
    }

    @Override
    public void initialize(Bootstrap<OrderConfiguration> bootstrap) {
    }

    @Override
    public void run(OrderConfiguration orderConfiguration, Environment environment) {
        environment.jersey().register(new OrderResource());
        environment.healthChecks().register("OderHealthCheck", new OrderHealthCheck());
    }
}
