package tests.simplebenchmark;

import kafkabase.KafkaProducerConsumerBenchmarkBase;

public class KafkaSimpleBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public KafkaSimpleBenchmark() {
        super(1, 1);
    }
}
