public class AlgorithmTester {

    @FunctionalInterface
    public interface passableMethod {
        void execute();
    }

    public static long averageTime(passableMethod m, int repetitions) {
        long totalTime = 0;
        for (int x = 0; x < repetitions; x++) {
            long time = timeAlgorithm(m);
            totalTime += time;
            System.out.println(time);
        }
        return totalTime / repetitions;
    }

    public static long timeAlgorithm(passableMethod m) {
        long startTime = System.nanoTime();
        m.execute();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
