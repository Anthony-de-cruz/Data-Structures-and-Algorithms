def stalin_sort(array: list[int]) -> None:
    """This sorting algorithm is O(n). The greatest sorting algorithm.
    Iterates over the list, eliminating any elements that are out of order."""

    if len(array) < 2:
        return

    for x in range(1, len(array) - 1):

        if array[x] < array[x - 1]:
            array.pop(x)


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]
    test_2 = [1]

    stalin_sort(test_1)
    stalin_sort(test_2)
    assert test_1 == [1, 3, 7, 10]
    assert test_2 == [1]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
