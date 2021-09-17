package com.pereira.pcs.order;

import com.codahale.metrics.health.HealthCheck;

public class OrderHealthCheck extends HealthCheck {

    @Override
    protected Result check() {
        return Result.healthy();
    }
}