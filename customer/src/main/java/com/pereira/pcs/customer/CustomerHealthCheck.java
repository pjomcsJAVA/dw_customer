package com.pereira.pcs.customer;

import com.codahale.metrics.health.HealthCheck;

public class CustomerHealthCheck extends HealthCheck {

    @Override
    protected Result check() {
        return Result.healthy();
    }
}