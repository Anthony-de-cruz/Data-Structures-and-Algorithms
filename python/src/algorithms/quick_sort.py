def _partition(array: list[int], low: int, high: int) -> int:
    pivot = array[high]
    index = low - 1

    # Look for values less than the pivot
    for i in range(low, high - 1):
        # Once found, swap
        if array[i] <= pivot:
            index += 1
            array[i], array[index] = array[index], array[i]

    index += 1
    array[high], array[index] = array[index], pivot

    return index


def _quick_sort(array: list[int], low: int, high: int) -> None:
    if low >= high:
        return

    # Quick sort above and below the pivot, but not the pivot itself
    pivot_index = _partition(array, low, high)

    _quick_sort(array, low, pivot_index - 1)
    _quick_sort(array, pivot_index + 1, high)


def quick_sort(array: list[int]) -> None:
    _quick_sort(array, 0, len(array) - 1)


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 3, 7, 2, 10, 6]

    quick_sort(test_1)
    assert test_1 == [1, 2, 3, 6, 7, 10]

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
