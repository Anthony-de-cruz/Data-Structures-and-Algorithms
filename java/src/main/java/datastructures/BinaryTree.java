package datastructures;

import java.lang.Comparable;
import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>>
    implements Comparable<BinaryTree<T>> {

    private BinaryNode root;

    private class BinaryNode {

        public T value;
        public BinaryNode left = null;
        public BinaryNode right = null;

        public BinaryNode(T value) { this.value = value; }

        /**
         * Insert the given value to the binary tree.
         *
         * Throws an exception when a duplicate value is passed.
         *
         * @param value The element to be given
         * @throws DuplicateValueException Thrown when the passed value is
         *     already
         *                                 in the tree
         */
        public void insert(BinaryNode node) throws DuplicateValueException {

            int comparison = node.value.compareTo(this.value);

            if (comparison == 0) {
                throw new DuplicateValueException(String.format(
                    "Value: %s already exists in the tree", node.value));

            } else if (comparison > 0) {
                if (this.right != null) {
                    this.right.insert(node);
                } else {
                    this.right = node;
                }

            } else if (comparison < 0) {
                if (this.left != null) {
                    this.left.insert(node);
                } else {
                    this.left = node;
                }
            }
        }

        /**
         * Depth pre order traverses in order of depth;
         * can be used to copy a tree.
         *
         * @param path The array to hold the traversal path
         * @return The array that holds that traversal path
         */
        public ArrayList<T> depthPreOrderWalk(ArrayList<T> path) {

            // Pre
            path.add(this.value);

            // Recurse
            if (this.left != null) {
                this.left.depthPreOrderWalk(path);
            }

            if (this.right != null) {
                this.right.depthPreOrderWalk(path);
            }
            // Post
            return path;
        }

        /**
         * Depth in order traverses in order of value.
         *
         * @param path The array to hold the traversal path
         * @return The array that holds that traversal path
         */
        public ArrayList<T> depthInOrderWalk(ArrayList<T> path) {

            // Pre

            // Recurse
            if (this.left != null) {
                this.left.depthInOrderWalk(path);
            }
            path.add(this.value);

            if (this.right != null) {
                this.right.depthInOrderWalk(path);
            }
            // Post
            return path;
        }

        /**
         * Depth post order traverses in the opposite order of depth;
         * can be used for reverse polish notation.
         *
         * @param path The array to hold the traversal path
         * @return The array that holds that traversal path
         */
        public ArrayList<T> depthPostOrderWalk(ArrayList<T> path) {

            // Pre

            // Recurse
            if (this.left != null) {
                this.left.depthPostOrderWalk(path);
            }

            if (this.right != null) {
                this.right.depthPostOrderWalk(path);
            }
            // Post
            path.add(this.value);
            return path;
        }
    }

    /**
     * @param root The root element of the tree
     */
    public BinaryTree(T root) { this.root = new BinaryNode(root); }

    /**
     * Insert the given value to the binary tree.
     *
     * Throws an exception when a duplicate value is passed.
     *
     * @param value The element to be given
     * @throws DuplicateValueException Thrown when the passed value is already
     *                                 in the tree
     */
    public void insert(T value) throws DuplicateValueException {
        root.insert(new BinaryNode(value));
    }

    /**
     * Depth traversal is a recursive algorithm,
     * and so uses a stack to traverse the tree.
     *
     * Depth pre order traverses in order of depth;
     * can be used to copy a tree.
     *
     * It's complexity is O(V+E) where V is the number
     * of verticies and E is the number of edges.
     * This boils down to O(N).
     *
     * @return An ArrayList containing the values in order of traversal
     */
    public ArrayList<T> depthPreOrder() {
        return this.root.depthPreOrderWalk(new ArrayList<T>());
    }

    /**
     * Depth traversal is a recursive algorithm,
     * and so uses a stack to traverse the tree.
     *
     * Depth in order traverses in order of value.
     *
     * It's complexity is O(V+E) where V is the number
     * of verticies and E is the number of edges.
     * This boils down to O(N).
     *
     * @return An ArrayList containing the values in order of traversal
     */
    public ArrayList<T> depthInOrder() {
        return this.root.depthInOrderWalk(new ArrayList<T>());
    }

    /**
     * Depth traversal is a recursive algorithm,
     * and so uses a stack to traverse the tree.
     *
     * Depth post order traverses in the opposite order of depth;
     * can be used for reverse polish notation.
     *
     * It's complexity is O(V+E) where V is the number
     * of verticies and E is the number of edges.
     * This boils down to O(N).
     *
     * @return An ArrayList containing the values in order of traversal
     */
    public ArrayList<T> depthPostOrder() {
        return this.root.depthPostOrderWalk(new ArrayList<T>());
    }

    @Override
    public int compareTo(BinaryTree<T> other) {

        ArrayList<T> thisPath = this.depthPreOrder();
        ArrayList<T> otherPath = other.depthPreOrder();

        for (int x = 0; x < thisPath.size(); x++) {
            int comparison = thisPath.get(x).compareTo(otherPath.get(x));
            if (comparison != 0) {
                return comparison;
            }
        }
        return 0;
    }

    public T getRoot() { return root.value; }
}
