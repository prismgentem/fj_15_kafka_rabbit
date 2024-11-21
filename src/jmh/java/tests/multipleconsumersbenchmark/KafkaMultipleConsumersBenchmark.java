package tests.multipleconsumersbenchmark;

import kafkabase.KafkaProducerConsumerBenchmarkBase;

public class KafkaMultipleConsumersBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public KafkaMultipleConsumersBenchmark() {
        super(1, 3);
    }
}
