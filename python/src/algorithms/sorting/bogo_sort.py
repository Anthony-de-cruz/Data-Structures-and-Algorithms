import random


def _shuffle_list(array: list[int]) -> None:

    for x in range(len(array)):
        rand = random.randint(0, len(array) - 1)
        array[x], array[rand] = array[rand], array[x]


def _check_sorted(array: list[int]) -> bool:

    print(array)

    if len(array) < 2:
        return True

    for x in range(len(array) - 1):
        if array[x] > array[x + 1]:
            return False

    return True


def bogo_sort(array: list[int]) -> None:
    """This sorting algorithm is O(∞), θ(n * n!), Ω(n).
    Possibly the greatest sorting algorithm.
    Randomly shuffle the list until it is sorted."""

    while not _check_sorted(array):
        _shuffle_list(array)


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]
    test_2 = [1]
    test_3 = [x for x in range(6, -1, -1)]

    bogo_sort(test_1)
    bogo_sort(test_2)
    bogo_sort(test_3)

    assert test_1 == [1, 2, 3, 6, 7, 10]
    assert test_2 == [1]
    assert test_3 == [x for x in range(0, 7)]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
