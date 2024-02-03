package algorithms;

import java.util.List;

public class BubbleSort {

    public static <T extends Comparable<T>> void
    bubbleSort(List<T> collection) {
        for (int x = 0; x < collection.size(); x++) {
            for (int y = 0; y < collection.size() - 1 - x; y++) {
                if (collection.get(y).compareTo(collection.get(y + 1)) > 0) {
                    T temp = collection.get(y);
                    collection.set(y, collection.get(y + 1));
                    collection.set(y + 1, temp);
                }
            }
        }
    }
}
