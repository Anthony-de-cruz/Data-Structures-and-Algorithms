public class AlgorithmTester {

    public AlgorithmTester() {
    }

    @FunctionalInterface
    public interface passableMethod {
        void apply();
    }

    public static long timeAlgorithm(passableMethod f) {
        long startTime = System.nanoTime();
        f.apply();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
