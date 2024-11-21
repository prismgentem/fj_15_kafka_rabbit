package rabbitbase;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Thread)
@Fork(value = 1)
@Warmup(iterations = 3)
@Measurement(iterations = 1)
public abstract class BaseTest {
}