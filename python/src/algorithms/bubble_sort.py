def bubble_sort(array: list[int]):
    """This sorting algorithm is O(n^2)"""

    n = len(array)

    # O(n * n) - > O(n^2)
    for y in range(n - 1):
        for x in range(n - 1 - y):
            if array[x] > array[x + 1]:
                array[x], array[x + 1] = array[x + 1], array[x]


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]

    bubble_sort(test_1)
    assert test_1 == [1, 2, 3, 6, 7, 10]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
