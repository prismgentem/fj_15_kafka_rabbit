package tests.loadbalancing;

import rabbitbase.RabbitMQBenchmarkBase;

public class RabbitLoadBalancingBenchmark extends RabbitMQBenchmarkBase {

    public RabbitLoadBalancingBenchmark() {
        super(3, 1);
    }
}
