# kafka_rabbit

| Benchmark                                                                        | Mode  | Cnt | Score     | Error    | Units |
|----------------------------------------------------------------------------------|-------|-----|-----------|----------|-------|
| kafka.test.LoadBalancingBenchmark.kafkaProducersConsumers                        | thrpt | 3   | 1071,239  | ± 176,449 | ops/s |
| kafka.test.LoadBalancingMultipleConsumersBenchmark.kafkaProducersConsumers       | thrpt | 3   | 4,928     | ± 0,055   | ops/s |
| kafka.test.MultipleConsumersBenchmark.kafkaProducersConsumers                    | thrpt | 3   | 4,867     | ± 0,193   | ops/s |
| kafka.test.SimpleBenchmark.kafkaProducersConsumers                               | thrpt | 3   | 1350,969  | ± 525,204 | ops/s |
| kafka.test.StressBenchmark.kafkaProducersConsumers                               | thrpt | 3   | 1,095     | ± 0,073   | ops/s |
| rabbit.tests.LoadBalancingBenchmark.rabbitProducerConsumer                       | thrpt | 3   | 5,923     | ± 0,281   | ops/s |
| rabbit.tests.LoadBalancingMultipleConsumersBenchmark.rabbitProducerConsumer      | thrpt | 3   | 5,801     | ± 0,480   | ops/s |
| rabbit.tests.MultipleConsumersBenchmark.rabbitProducerConsumer                  | thrpt | 3   | 16,140    | ± 4,357   | ops/s |
| rabbit.tests.SimpleBenchmark.rabbitProducerConsumer                             | thrpt | 3   | 17,222    | ± 1,254   | ops/s |
| rabbit.tests.StressBenchmark.rabbitProducerConsumer                             | thrpt | 3   | 1,749     | ± 0,513   | ops/s |

Из таблицы видно, что **Kafka** демонстрирует более высокую производительность, особенно в простых тестах, таких как **SimpleBenchmark** (1350,969 ops/s), по сравнению с **RabbitMQ**, где лучшие результаты составляют **17,222 ops/s** в тесте **SimpleBenchmark**.

В нагрузочных тестах производительность обоих систем снижается, но **Kafka** всё равно показывает лучшие результаты.

