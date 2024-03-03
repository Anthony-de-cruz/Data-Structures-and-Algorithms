def selection_sort(array: list[int]) -> None:
    """This sorting algorithm is O(n^2)"""

    n = len(array)

    for x in range(n - 1):
        # Find the next smallest element
        position = x
        minimum = array[x]
        for y in range(x, n):
            if array[y] < minimum:
                position = y
                minimum = array[y]

        # Swap element at smallest position with element at x
        array[position] = array[x]
        array[x] = minimum


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]

    selection_sort(test_1)
    assert test_1 == [1, 2, 3, 6, 7, 10]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
