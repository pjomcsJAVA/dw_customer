package com.pereira.pcs.tds;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TodayDateApplication extends Application<TodayDateConfiguration> {

    public static void main(String[] args) {
        System.out.println("SERVER running on port 8080...");
        try {
            new TodayDateApplication().run(args);
        } catch (Exception e) {
            System.out.println("Error initializing dropwizard service...");
        }
    }

    @Override
    public String getName() {
        return "TodaysDate-microservice";
    }

    @Override
    public void initialize(Bootstrap<TodayDateConfiguration> bootstrap) {
    }

    @Override
    public void run(TodayDateConfiguration todaysDateConfiguration, Environment environment) {
        environment.jersey().register(new TodayDateResource());
        environment.healthChecks().register("TodaysDateHC", new TodayDateHealthCheck());
    }
}
