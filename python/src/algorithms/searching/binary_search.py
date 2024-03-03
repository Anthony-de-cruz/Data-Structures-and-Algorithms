def binary_search(structure: list[int], term: int) -> bool:
    low = 0
    high = len(structure)

    while low < high:
        half = low + (high - low) // 2
        value = structure[half]

        if value == term:
            return True

        elif value > term:
            high = half

        else:
            low = half + 1

    return False


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [1, 2, 4, 6, 10, 20, 25, 50, 90]
    assert binary_search(test_1, 1)
    assert binary_search(test_1, 10)
    assert binary_search(test_1, 90)

    assert not binary_search(test_1, 11)

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
