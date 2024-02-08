package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class BinarySearchBenchmark {

    @State(Scope.Thread)
    public static class benchmarkState {

        public List<Integer> testData;
        public int searchTerm;

        /**
         * Initialise benchmark data
         * Runs at the start of the benchmark trial
         */
        @Setup(Level.Trial)
        public void setup() {

            testData = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
            searchTerm = 21;
            System.out.println("Settings up");
        }

        public benchmarkState() {}

        /**
         * Tear down benchmark state data
         * Runs at the end of the benchmark trial
         */
        @Setup(Level.Trial)
        public void tearDown() {
            System.out.println("Tearing down");
        }
    }

    /**
     * Benchmark BinarySearch.binarySearch()
     *
     * @param blackHole Consumes the method result, stopping the compiler from
     *                  optimising it away as dead code
     * @param state     Running state of the benchmark
     */
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void binarySearch(Blackhole blackHole, benchmarkState state) {
        blackHole.consume(
            BinarySearch.binarySearch(state.testData, state.searchTerm));
    }
}
