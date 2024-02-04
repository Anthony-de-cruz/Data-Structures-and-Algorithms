public class AlgorithmTester {

    public AlgorithmTester() {}

    @FunctionalInterface
    public interface passableMethod {
        void apply();
    }

    public static long averageTime(passableMethod m, int repetitions) {
        long averageTime = 0;
        for (int x = 0; x < repetitions; x++) {
        }
        return averageTime;
    }

    public static long timeAlgorithm(passableMethod m) {
        long startTime = System.nanoTime();
        m.apply();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
