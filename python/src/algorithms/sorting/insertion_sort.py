def insertion_sort(array: list[int]) -> None:
    """This sorting algorithm is O(n^2)"""

    x = 1
    while x < len(array):
        y = x
        while y > 0 and array[y - 1] > array[y]:
            array[y], array[y - 1] = array[y - 1], array[y]
            y -= 1
        x += 1


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]

    insertion_sort(test_1)
    assert test_1 == [1, 2, 3, 6, 7, 10]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
