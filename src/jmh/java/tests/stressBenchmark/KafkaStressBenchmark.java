package tests.stressBenchmark;

import kafkabase.KafkaProducerConsumerBenchmarkBase;

public class KafkaStressBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public KafkaStressBenchmark() {
        super(10, 10);
    }
}
