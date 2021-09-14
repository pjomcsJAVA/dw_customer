package com.pereira.pcs.tds;

import com.codahale.metrics.health.HealthCheck;

public class TodayDateHealthCheck extends HealthCheck {

    @Override
    protected Result check() {
        return Result.healthy();
    }
}