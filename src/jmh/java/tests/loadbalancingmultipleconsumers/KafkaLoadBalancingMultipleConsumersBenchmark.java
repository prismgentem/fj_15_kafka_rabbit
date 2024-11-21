package tests.loadbalancingmultipleconsumers;

import kafkabase.KafkaProducerConsumerBenchmarkBase;

public class KafkaLoadBalancingMultipleConsumersBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public KafkaLoadBalancingMultipleConsumersBenchmark() {
        super(3, 3);
    }
}
