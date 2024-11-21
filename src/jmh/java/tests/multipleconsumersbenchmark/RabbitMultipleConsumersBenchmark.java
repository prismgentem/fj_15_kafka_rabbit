package tests.multipleconsumersbenchmark;

import rabbitbase.RabbitMQBenchmarkBase;

public class RabbitMultipleConsumersBenchmark extends RabbitMQBenchmarkBase {

    public RabbitMultipleConsumersBenchmark() {
        super(1, 3);
    }
}