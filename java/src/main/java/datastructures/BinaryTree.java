package datastructures;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode root;

    private class BinaryNode {

        public T value;
        public BinaryNode left = null;
        public BinaryNode right = null;

        public BinaryNode(T value) { this.value = value; }

        /**
         *
         *
         * @param node
         * @throws DuplicateValueException
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
         *
         *
         * @param path
         * @return
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
    }

    /**
     *
     *
     * @param root
     */
    public BinaryTree(T root) { this.root = new BinaryNode(root); }

    /**
     *
     *
     * @param value
     * @throws DuplicateValueException Thrown when the passed value is already
     *                                 in the tree
     */
    public void insert(T value) throws DuplicateValueException {
        root.insert(new BinaryNode(value));
    }

    /**
     * Depth first traversal is a recursive algorithm,
     * and so uses a stack to traverse the tree.
     *
     * It traverses in order of depth;
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
     * Depth first traversal is a recursive algorithm,
     * and so uses a stack to traverse the tree.
     *
     * It traverses in order of value.
     *
     * It's complexity is O(V+E) where V is the number
     * of verticies and E is the number of edges.
     * This boils down to O(N).
     *
     * @return An ArrayList containing the values in order of traversal
     */
    public ArrayList<T> depthPostOrder() { return new ArrayList<T>(); }

    public T getRoot() { return root.value; }
}
