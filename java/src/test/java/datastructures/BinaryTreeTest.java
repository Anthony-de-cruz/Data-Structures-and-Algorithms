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

    @Test
    public void depthInOrderTest() {

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
            Arrays.asList(5, 10, 20, 25, 30, 40, 45, 50, 60, 100));

        ArrayList<Integer> path = tree.depthInOrder();

        for (int x = 0; x < correctPath.size(); x++) {
            assert (path.get(x) == correctPath.get(x));
        }
    }

    @Test
    public void depthPostOrderTest() {

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
            Arrays.asList(5, 25, 50, 45, 40, 100, 60, 30, 20, 10));

        ArrayList<Integer> path = tree.depthPostOrder();

        for (int x = 0; x < correctPath.size(); x++) {
            assert (path.get(x) == correctPath.get(x));
        }
    }

    @Test
    public void treeCompareToTest() {

        Integer[] values1 = {10, 20, 30, 60, 100, 40, 25, 45, 5, 50};
        Integer[] values2 = {10, 20, 30, 70, 100, 40, 25, 45, 5, 50};
        BinaryTree<Integer> tree1 = new BinaryTree<Integer>(values1[0]);
        BinaryTree<Integer> tree2 = new BinaryTree<Integer>(values1[0]);
        BinaryTree<Integer> tree3 = new BinaryTree<Integer>(values2[0]);

        try {
            for (int x = 1; x < values1.length; x++) {
                tree1.insert(values1[x]);
                tree2.insert(values1[x]);
                tree3.insert(values2[x]);
            }
        } catch (DuplicateValueException exp) {
            Assert.fail(
                "DuplicateValueException not thrown dispite a duplicate value");
        }

        assert (tree1.compareTo(tree2) == 0);
        assert (tree1.compareTo(tree3) != 0);
    }
}
