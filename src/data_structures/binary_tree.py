from __future__ import annotations
import typing


class BinaryNode:
    def __init__(self, value: typing.Any) -> None:

        self.value = value
        self.left = None
        self.right = None

    def __str__(self) -> str:
        try:
            return self.value.__str__()
        except TypeError:
            return self.value.__repr__(self.value)

    def insert(self, *nodes: BinaryNode) -> None:

        for node in nodes:
            if self.value == node.value:
                raise ValueError("Attempted to insert duplicate")

            elif node.value < self.value:
                if self.left is None:
                    self.left = node
                else:
                    try:
                        self.left.insert(node)
                    except ValueError as error:
                        raise error

            else:
                if self.right is None:
                    self.right = node
                else:
                    try:
                        self.right.insert(node)
                    except ValueError as error:
                        raise error

    def _depth_pre_order_walk(self, path: list[BinaryNode]) -> list[BinaryNode]:

        # Pre
        path.append(self.value)

        # Resurse
        if not self.left is None:
            self.left._depth_pre_order_walk(path)

        if not self.right is None:
            self.right._depth_pre_order_walk(path)

        # Post
        return path

    def depth_pre_order(self) -> list[BinaryNode]:

        """Depth first traversal is a recursive algorithm,
        and so uses a stack to traverse the tree.

        It traverses in order of depth;
        can be used to copy a tree.

        It's complexity is O(V+E) where V is the number
        of verticies and E is the number of edges.
        This boils down to O(N)."""

        return self._depth_pre_order_walk([])

    def _depth_in_order_walk(self, path: list[BinaryNode]) -> list[BinaryNode]:
        # Pre

        # Resurse
        if not self.left is None:
            self.left._depth_in_order_walk(path)

        path.append(self.value)

        if not self.right is None:
            self.right._depth_in_order_walk(path)

        # Post
        return path

    def depth_in_order(self) -> list[BinaryNode]:

        """Depth first traversal is a recursive algorithm,
        and so uses a stack to traverse the tree.

        It traverses in order of value.

        It's complexity is O(V+E) where V is the number
        of verticies and E is the number of edges.
        This boils down to O(N)."""

        return self._depth_in_order_walk([])

    def _depth_post_order_walk(self, path: list[BinaryNode]) -> list[BinaryNode]:

        # Pre

        # Resurse
        if not self.left is None:
            self.left._depth_post_order_walk(path)

        if not self.right is None:
            self.right._depth_post_order_walk(path)

        # Post
        path.append(self.value)

        return path

    def depth_post_order(self) -> list[BinaryNode]:

        """Depth first traversal is a recursive algorithm,
        and so uses a stack to traverse the tree.#

        It traverses in the opposite order of depth;
        can be used for reverse polish notation.

        It's complexity is O(V+E) where V is the number
        of verticies and E is the number of edges.
        This boils down to O(N)."""

        return self._depth_post_order_walk([])

    def breadth_first_search(self, term: typing.Any) -> BinaryNode | None:

        """Breadth first search is an iterative algorithm,
        using a queue to navigate the tree. The complexity is O(n^2).
        Returns the node object if found, returns None if not."""

        queue = [self]

        # O(n)
        while len(queue):
            # O(n)
            current = queue.pop(0)

            if current.value == term:
                return current

            if current.left:
                queue.append(current.left)
            if current.right:
                queue.append(current.right)

        return None

def compare(a: BinaryNode | None, b: BinaryNode | None) -> bool:
    
    if a is None and b is None:
        return True

    if a is None or b is None:
        return False

    if a.value != b.value:
        return False

    return compare(a.left, b.left) and compare(a.right, b.right)


def test() -> bool:

    node_1 = BinaryNode(5)
    node_2 = BinaryNode(2)
    node_3 = BinaryNode(3)
    node_4 = BinaryNode(10)
    node_5 = BinaryNode(23)
    node_6 = BinaryNode(9)

    node_1.insert(node_2, node_3, node_4, node_5, node_6)

    assert node_1.left is node_2 and node_1.right is node_4
    assert node_2.left is None and node_2.right is node_3

    assert node_1.depth_pre_order() == [5, 2, 3, 10, 9, 23]
    assert node_1.depth_in_order() == [2, 3, 5, 9, 10, 23]
    assert node_1.depth_post_order() == [3, 2, 9, 23, 10, 5]

    assert node_1.breadth_first_search(9) is node_6
    assert node_1.breadth_first_search(69) is None

    copy_node = node_1

    print(compare(node_1, copy_node))

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
