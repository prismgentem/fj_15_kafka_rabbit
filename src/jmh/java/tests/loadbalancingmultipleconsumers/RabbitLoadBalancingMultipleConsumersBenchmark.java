package tests.loadbalancingmultipleconsumers;

import rabbitbase.RabbitMQBenchmarkBase;

public class RabbitLoadBalancingMultipleConsumersBenchmark extends RabbitMQBenchmarkBase {

    public RabbitLoadBalancingMultipleConsumersBenchmark() {
        super(3, 3);
    }
}