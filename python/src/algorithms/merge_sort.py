def merge_sort(array: list[int]) -> list[int]:
    """This sorting algorithm is O(nlog(n)) performance
    and has O(n) spacial complexity"""

    n = len(array)

    if n < 2:
        return array

    # Split into 2 halves
    return merge(merge_sort(array[: n // 2]), merge_sort(array[n // 2 :]))


def merge(left: list[int], right: list[int]) -> list[int]:
    sorted = []

    # Sort through left and right
    while left and right:

        if left[0] < right[0]:
            sorted.append(left[0])
            left.pop(0)

        else:
            sorted.append(right[0])
            right.pop(0)

    # Append whatever is remaining
    if left:
        sorted += left
    if right:
        sorted += right

    return sorted


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]
    test_2 = [1, 3, 7, 2, 10, 6, 10, 10]
    test_3 = [0]
    test_4 = [x for x in range(99, -1, -1)]

    test_1 = merge_sort(test_1)
    test_2 = merge_sort(test_2)
    test_3 = merge_sort(test_3)
    test_4 = merge_sort(test_4)

    assert test_1 == [1, 2, 3, 6, 7, 10]
    assert test_2 == [1, 2, 3, 6, 7, 10, 10, 10]
    assert test_3 == [0]
    assert test_4 == [x for x in range(0, 100)]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
