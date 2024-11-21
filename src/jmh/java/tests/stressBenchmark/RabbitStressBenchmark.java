package tests.stressBenchmark;

import rabbitbase.RabbitMQBenchmarkBase;

public class RabbitStressBenchmark extends RabbitMQBenchmarkBase {

    public RabbitStressBenchmark() {
        super(10, 10);
    }
}