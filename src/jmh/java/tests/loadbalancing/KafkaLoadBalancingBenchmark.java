package tests.loadbalancing;

import kafkabase.KafkaProducerConsumerBenchmarkBase;

public class KafkaLoadBalancingBenchmark extends KafkaProducerConsumerBenchmarkBase {

    public KafkaLoadBalancingBenchmark() {
        super(3, 1);
    }
}
