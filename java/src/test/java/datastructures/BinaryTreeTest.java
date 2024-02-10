package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void happyTest() {

        Integer[] values = {10, 20, 30, 60, 100, 25, 50, 5, 45};
        BinaryTree<Integer> tree = new BinaryTree<Integer>(values[0]);

        try {
            for (int x = 1; x < values.length; x++) {
                tree.insert(values[x]);
            }
        } catch (DuplicateValueException exp) {
            Assert.fail("DuplicateValueException thrown dispite no duplicates");
        }
    }

    @Test
    public void insertDuplicateTest() {

        BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
        try {
            tree.insert(3);
        } catch (DuplicateValueException exp) {
            Assert.fail("DuplicateValueException thrown dispite no duplicates");
        }

        try {
            tree.insert(1);
            Assert.fail(
                "DuplicateValueException not thrown dispite a duplicate value");

        } catch (DuplicateValueException exp) {
        }

        try {
            tree.insert(3);
            Assert.fail(
                "DuplicateValueException not thrown dispite a duplicate value");
        } catch (DuplicateValueException exp) {
        }
    }

    @Test
    public void depthPreOrderTest() {

        Integer[] values = {10, 20, 30, 60, 100, 40, 25, 45, 5, 50};
        BinaryTree<Integer> tree = new BinaryTree<Integer>(values[0]);

        try {
            for (int x = 1; x < values.length; x++) {
                tree.insert(values[x]);
            }
        } catch (DuplicateValueException exp) {
            Assert.fail(
                "DuplicateValueException not thrown dispite a duplicate value");
        }

        ArrayList<Integer> correctPath = new ArrayList<>(
            Arrays.asList(10, 5, 20, 30, 25, 60, 40, 45, 50, 100));

        ArrayList<Integer> path = tree.depthPreOrder();

        for (int x = 0; x < correctPath.size(); x++) {
            assert (path.get(x) == correctPath.get(x));
        }
    }
}
